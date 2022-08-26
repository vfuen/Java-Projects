/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circclemovement;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleMovement extends JPanel {
    private final ArrayList<Point> location = new ArrayList<>(50);

    public CircleMovement() {
        addMouseListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent event) {
                location.add(event.getPoint());

                repaint();

            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent event) {
                location.add(event.getPoint());
                repaint();
            }
        });
    }

    public void paintComponent(Graphics graphPainter) {
        super.paintComponent(graphPainter);

        Graphics2D graph2D = (Graphics2D) graphPainter;

        graph2D.setColor(new Color(0, 0, 0));
        graph2D.setStroke(new BasicStroke(8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        for (int i = 1; i < location.size(); i++)
            graph2D.draw(new Line2D.Float(location.get(i - 1), location.get(i++)));

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        frame.add(new CircleMovement());

    }

}

