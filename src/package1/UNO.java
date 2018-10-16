package package1;

import java.util.*; 
import java.awt.*;
import javax.swing.*;
public class UNO extends JFrame{
    int c=12;
    int r=4;
    String[][] cards = new String[r][c];
    
    int c2=8;
    int r2=2;
    String[][] player1 = new String[r2][c2];
    String[][] player2 = new String[r2][c2];
    boolean running=true;
    
    public static void main(String[] args){
       UNO obj=new UNO();
       obj.setVisible(true);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.fillCards();
       obj.printArray(obj.cards, obj.c, obj.r);
       obj.fillPlayer(obj.player1);
       obj.printArray(obj.player1, obj.c2, obj.r2);
       obj.fillPlayer(obj.player2);
       obj.printArray(obj.player2, obj.c2, obj.r2);
       obj.frame();
       obj.gameLoop();
    }
    
    public void fillCards(){
        for(int i=0;i<=3;i++)cards[i][11]="wild";
        
        cards[0][0]="red";
        cards[1][0]="green";
        cards[2][0]="blue";
        cards[3][0]="yellow";
        
        for(int j=0;j<=3;j++)
            for(int i=1;i<=10;i++)
                cards[j][i]=Integer.toString(i);
        
    }
    
    public void fillPlayer(String[][] array1){
        int randomC, randomR;
        //Color
        for(int i=0;i<=7;i++){
            randomR=(int)(Math.random()*4);
            array1[0][i]=cards[randomR][0];
        }
        //Number
        for(int i=0;i<=7;i++){
            randomC=(int)(Math.random()*11)+1;
            
            if(array1[0][i].equals("red"))
                array1[1][i]=cards[0][randomC];
                
            else if(array1[0][i].equals("green"))
                 array1[1][i]=cards[1][randomC];
                 
            else if(array1[0][i].equals("blue"))
                 array1[1][i]=cards[2][randomC];
                 
            else if(array1[0][i].equals("yellow"))
                 array1[1][i]=cards[3][randomC];
            
        }
        
        //Check for wilds
        for(int i=0;i<=7;i++){
            if(array1[1][i].equals("wild"))
                array1[0][i]="wild";
        }
        
    }
    
    
    public void printArray(String[][] array1,int col, int row){
        for(int j=0;j<=row-1;j++){
            for(int i=0;i<=col-1;i++){
                System.out.print(array1[j][i]+" ");
            }  System.out.println(" ");
        }System.out.println(" ");
    }
    
    public void gameLoop(){
        
        
        
    }
    
    public void frame(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        setSize(450,450);
    }
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.RED);
        g.fillRect(20,20,100,100);
        repaint();
    }
}
