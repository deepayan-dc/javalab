package lab9;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseEventsDemo extends Frame implements MouseListener {
    String msg = "Perform Mouse Action";
    MouseEventsDemo() {
        addMouseListener(this);
        setSize(500, 400);
        setTitle("Mouse Events Demo");
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked";
        setBackground(Color.GREEN);
        repaint();
    }
    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered";
        setBackground(Color.YELLOW);
        repaint();
    }
    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited";
        setBackground(Color.GRAY);
        repaint();
    }
    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed";
        setBackground(Color.BLUE);
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released";
        setBackground(Color.RED);
        repaint();
    }
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(msg, 150, 200);
    }
    public static void main(String[] args) {
        new MouseEventsDemo();
    }
}




