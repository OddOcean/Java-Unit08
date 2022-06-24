// Aweygandt2022 10.20.21
// Purpose of Program:
// demonstrate solution of the fencepost problem by drawing a fence 
// program will be able to draw a fence with a for, while or do while loop
// program will also check for proper user input 

import java.awt.*;
import javax.swing.JFrame;
import java.awt.MouseInfo;

public class Lab08A_Weygandt extends Canvas {
  private Orca orca;
  
  private static int Cwidth = 1600;
  private static int Cheight = 800;
  private int faceX1 = 0;//varibles that keep track of the body peices xs and ys \VVVVVV/
  private int faceY1 = 0;
  private int body1X1 = 0;
  private int body1Y1 = 0;
  private int body2X1 = 0;
  private int body2Y1 = 0;
  private int body3X1 = 0;
  private int body3Y1 = 0;
  private int body4X1 = 0;
  private int body4Y1 = 0;
  private int body5X1 = 0;
  private int body5Y1 = 0;
  private int body6X1 = 0;
  private int body6Y1 = 0;
  private int body7X1 = 0;
  private int body7Y1 = 0;
  private int body8X1 = 0;
  private int body8Y1 = 0;
  private int body9X1 = 0;
  private int body9Y1 = 0;
  private int body10X1 = 0;
  private int body10Y1 = 0;
  private int body11X1 = 0;
  private int body11Y1 = 0;

  public static void main(String[] args) {
    //sets up canvas
    JFrame frame = new JFrame("Orca Whale");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Lab08A_Weygandt();
    canvas.setSize(Cwidth, Cheight);
    canvas.setBackground(Color.WHITE);  
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }


  public void paint(Graphics g){
  
    orca = new Orca();
      
    while (true){
      double mouseX = MouseInfo.getPointerInfo().getLocation().getX();//sets mouseX and mouseY to the location of the mouse
      double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
      
      //MOVEMENT: Calculates xy coordinates of each body part
      faceX1 += ((int)Math.round(mouseX) - faceX1 - 130)/10;//reduces distance between mouse and body part, the closer it is the less the distance is reduced
      faceY1 += ((int)Math.round(mouseY) - faceY1 - 120)/10;
      
      body1X1 += ((int)Math.round(mouseX) - body1X1 - 130)/12;
      body1Y1 += ((int)Math.round(mouseY) - body1Y1 - 120)/12;
      
      body2X1 += ((int)Math.round(mouseX) - body2X1 - 130)/14;
      body2Y1 += ((int)Math.round(mouseY) - body2Y1 - 120)/14;
      
      body3X1 += ((int)Math.round(mouseX) - body3X1 - 135)/16;
      body3Y1 += ((int)Math.round(mouseY) - body3Y1 - 125)/16;

      body4X1 += ((int)Math.round(mouseX) - body4X1 - 135)/17;
      body4Y1 += ((int)Math.round(mouseY) - body4Y1 - 125)/17;

      body5X1 += ((int)Math.round(mouseX) - body5X1 - 130)/20;
      body5Y1 += ((int)Math.round(mouseY) - body5Y1 - 120)/20;
      
      body6X1 += ((int)Math.round(mouseX) - body6X1 - 125)/23;
      body6Y1 += ((int)Math.round(mouseY) - body6Y1 - 100)/23;
      
      body7X1 += ((int)Math.round(mouseX) - body7X1 - 115)/27;
      body7Y1 += ((int)Math.round(mouseY) - body7Y1 - 90)/27;
      
      body8X1 += ((int)Math.round(mouseX) - body8X1 - 100)/32;
      body8Y1 += ((int)Math.round(mouseY) - body8Y1 - 75)/32;
      
      body9X1 += ((int)Math.round(mouseX) - body9X1 - 85)/37;
      body9Y1 += ((int)Math.round(mouseY) - body9Y1 - 60)/37;

      body10X1 += ((int)Math.round(mouseX) - body10X1 - 70)/41;
      body10Y1 += ((int)Math.round(mouseY) - body10Y1 - 45)/41;
      
      body11X1 += ((int)Math.round(mouseX) - body11X1 - 135)/41;
      body11Y1 += ((int)Math.round(mouseY) - body11Y1 - 125)/41;
      
      g.setColor(Color.BLUE);
      g.fillRect(0, 0, Cwidth, Cheight);//clears canvas for next frame
      
      //DRAWING
      orca.body9(g, body11X1, body11Y1);
      orca.body8(g, body10X1, body10Y1);
      orca.body7(g, body9X1, body9Y1);
      orca.body6(g, body8X1, body8Y1);
      orca.body5(g, body7X1, body7Y1);
      orca.body4(g, body6X1, body6Y1);
      orca.body1(g, body5X1, body5Y1);
      orca.body3(g, body4X1, body4Y1);
      orca.body2(g, body3X1, body3Y1);
      orca.body1(g, body2X1, body2Y1);
      orca.body1(g, body1X1, body1Y1);
      orca.face(g, faceX1, faceY1);
      
      delay(30);//delays time between frames
    }
  }
  
  public static void delay(int delay) {//borrowed this from you
    int delaytime = delay;
    long startDelay = System.currentTimeMillis(); 
    long endDelay = 0;

    while (endDelay - startDelay < delaytime)//waits input milliseconds before breaking
      endDelay = System.currentTimeMillis();
  }
}