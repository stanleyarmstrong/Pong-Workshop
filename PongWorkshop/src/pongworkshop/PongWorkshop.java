

package pongworkshop;
import javax.swing.*;
import java.awt.*;
class MyCanvas extends JComponent{
    @Override
    public void paint(Graphics g){
        g.drawRect(200, 480, 100, 20);
        g.fillRect(200, 480, 100, 20);
        g.drawRect(100, 100, 25, 20);
        g.fillRect(100, 100, 25, 20);
        g.setColor(Color.yellow);
        
        
                
        
        
    }
    
    
}
public class PongWorkshop {

    
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
