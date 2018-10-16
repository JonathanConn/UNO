package package1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.util.*;

class Success extends JFrame implements ActionListener{
    public Success(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(450,450);
    }
    boolean running=true;
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.RED);
        int x=200;
        int y=0; 
        
        while(running){
            g.setColor(Color.RED);
            g.fillRect(x,y,10,20);
            g.setColor(Color.WHITE);
            g.fillRect(x,(y-20),10,20);
            if(y>=400){
                running=false;
            }else{
                y++;
                System.out.println("+1");
                
                try {
                    Thread.sleep(10);
                }catch (InterruptedException ie) {
            // Handle the exception
                }
                
            }
            repaint();
        }
        
        
    }

    public static void main(String []args){
        Success s=new Success();
        s.setVisible(true);
    }
    
    
    public void game(){
        boolean running=true;
        while(running){

            repaint();
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

