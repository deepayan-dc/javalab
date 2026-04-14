package lab9;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseName extends Frame implements MouseListener {
    String msg = "";
    MouseName() {
        addMouseListener(this);
        setSize(400, 400);
        setTitle("Mouse Click Event");
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        msg = "Deepayan Chakravarti";
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(msg, 150, 200);
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public static void main(String[] args) {
        new MouseName();
    }
}

