package com.miticraft.DiplomnaRabota;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.List;
import java.util.ArrayList;

public class AnimatedLSystemFractal extends JPanel {
    private int depth = 0; // Start with depth 0 and increment
    private final int maxDepth = 10; // Max depth for recursion
    private List<Line2D> lines = new ArrayList<>();
    
    public AnimatedLSystemFractal() {
        setBackground(Color.BLACK);
        new FractalWorker().execute(); // Start animation in a separate thread
    }

    private void generateKochFractal(int depth, double x1, double y1, double x2, double y2) {
        if (depth == 0) {
            lines.add(new Line2D.Double(x1, y1, x2, y2));
        } else {
            double deltaX = x2 - x1;
            double deltaY = y2 - y1;
            double xA = x1 + deltaX / 3;
            double yA = y1 + deltaY / 3;
            double xB = x1 + 2 * deltaX / 3;
            double yB = y1 + 2 * deltaY / 3;

            // Compute peak of the triangle
            double angle = Math.toRadians(60);
            double xC = (xA + xB) / 2 + (yA - yB) * Math.tan(angle);
            double yC = (yA + yB) / 2 + (xB - xA) * Math.tan(angle);

            generateKochFractal(depth - 1, x1, y1, xA, yA);
            generateKochFractal(depth - 1, xA, yA, xC, yC);
            generateKochFractal(depth - 1, xC, yC, xB, yB);
            generateKochFractal(depth - 1, xB, yB, x2, y2);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(Color.PINK);
        for (Line2D line : lines) {
            g2.draw(line);
        }
    }

    private class FractalWorker extends SwingWorker<Void, Integer> {
        @Override
        protected Void doInBackground() throws Exception {
            while (depth <= maxDepth) {
                lines.clear();
                int width = getWidth();
                int height = getHeight();

                // Define starting triangle coordinates
                double x1 = width * 0.2, y1 = height * 0.7;
                double x2 = width * 0.8, y2 = height * 0.7;
                double x3 = (x1 + x2) / 2, y3 = height * 0.3;

                generateKochFractal(depth, x1, y1, x2, y2);
                generateKochFractal(depth, x2, y2, x3, y3);
                generateKochFractal(depth, x3, y3, x1, y1);

                depth++;
                publish(depth); // Update UI
                Thread.sleep(250); // Delay for animation effect
            }
            return null;
        }

        @Override
        protected void process(List<Integer> chunks) {
            repaint(); // Update the UI every time depth increases
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animated L-System Fractal (Koch Snowflake)");
            AnimatedLSystemFractal panel = new AnimatedLSystemFractal();

            frame.add(panel);
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
