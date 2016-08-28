

package pongworkshop;
import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MyCanvas extends JComponent{
    @Override
    public void paint(Graphics g){
        g.drawRect(200, 480, 100, 20);
        g.setColor(Color.blue);
        g.fillRect(200, 480, 100, 20);
        g.drawRect(200, 0, 100, 20);
        g.setColor(Color.BLACK);
        g.fillRect(200, 0, 100, 20);
        g.drawOval(250, 200, 25, 25);
        g.setColor(Color.red);
        g.fillOval(250, 200, 25, 25);
        
        
        
        
                
        
        
    }
    
    
}

public class PongWorkshop implements ActionListener{

    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(540, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Game Pong");
        frame.getContentPane().setBackground(Color.WHITE);
        
        frame.getContentPane().add(new MyCanvas());
        frame.setVisible(true);
        
        
       
    }
    
}
