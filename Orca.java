import java.awt.*;

public class Orca{

  public Orca(){//orca constructor
  
  }
  
  public void face(Graphics g, int x, int y){//methods for drawing each body part at input x and y \VVVVVVVVVV/
    g.setColor(Color.BLACK);
    g.fillOval(0 + x, 0 + y, 240, 200);
    g.setColor(Color.WHITE);
    g.fillOval(20 + x, 80 + y, 60, 40);
    g.fillOval(160 + x, 80 + y, 60, 40);
    g.fillArc(32 + x, 103 + y, 176, 100, 205, 130);
  }
  
  public void body1(Graphics g, int x, int y){
    g.setColor(Color.BLACK);
    g.fillOval(-10 + x, -10 + y, 260, 220);
    g.setColor(Color.WHITE);
    g.fillArc(-10 + x, -9 + y, 260, 220, 205, 130);
  }
  
  public void body2(Graphics g, int x, int y){
    int [] finX = {120 + x, 335 + x, 365 + x, 365 + x, 295 + x};
    int [] fin2X = {120 + x, -95 + x, -125 + x, -125 + x, -65 + x};
    int [] finY = {100 + y, 160 + y, 190 + y, 220 + y, 190 + y};
    g.setColor(Color.BLACK);
    g.fillOval(-15 + x, -15 + y, 270, 230);
    g.fillPolygon(finX, finY, 5);
    g.fillPolygon(fin2X, finY, 5);
    g.setColor(Color.WHITE);
    g.fillArc(-15 + x, -14 + y, 270, 230, 200, 140);
  }
  
  public void body3(Graphics g, int x, int y){
    int [] dorselX = {90 + x, 90 + x, 120 + x, 150 + x, 150 + x};
    int [] dorselY = {100 + y, -15 + y, -135 + y, -15 + y, 100 + y};
    g.setColor(Color.BLACK);
    g.fillOval(-15 + x, -15 + y, 270, 230);
    g.fillPolygon(dorselX, dorselY, 5);
    g.setColor(Color.WHITE);
    g.fillArc(-15 + x, -14 + y, 270, 230, 200, 140);
  }
  
  public void body4(Graphics g, int x, int y){
    g.setColor(Color.BLACK);
    g.fillOval(-10 + x, -10 + y, 250, 200);
    g.setColor(Color.WHITE);
    g.fillArc(-10 + x, -9 + y, 250, 200, 200, 140);
  }
  
  public void body5(Graphics g, int x, int y){
    g.setColor(Color.BLACK);
    g.fillOval(-10 + x, -10 + y, 230, 180);
    g.setColor(Color.WHITE);
    g.fillArc(-10 + x, -9 + y, 230, 180, 200, 140);
  }
  
  public void body6(Graphics g, int x, int y){
    g.setColor(Color.BLACK);
    g.fillOval(-10 + x, -10 + y, 200, 150);
    g.setColor(Color.WHITE);
    g.fillArc(-10 + x, -9 + y, 200, 150, 200, 140);
  }
  
  public void body7(Graphics g, int x, int y){
    g.setColor(Color.BLACK);
    g.fillOval(-10 + x, -10 + y, 170, 120);
    g.setColor(Color.WHITE);
    g.fillArc(-10 + x, -9 + y, 170, 120, 200, 140);
  }
  
  public void body8(Graphics g, int x, int y){
    g.setColor(Color.BLACK);
    g.fillOval(-10 + x, -10 + y, 140, 90);
    g.setColor(Color.WHITE);
    g.fillArc(-10 + x, -9 + y, 140, 90, 200, 140);
  }
  
  public void body9(Graphics g, int x, int y){
    int [] tailX = {120 + x, 235 + x, 265 + x, 275 + x, 195 + x};
    int [] tail2X = {120 + x, 5 + x, -25 + x, -35 + x, 35 + x};
    int [] tailY = {100 + y, 110 + y, 110 + y, 130 + y, 130 + y};
    g.setColor(Color.BLACK);
    g.fillPolygon(tailX, tailY, 5);
    g.fillPolygon(tail2X, tailY, 5);
  }
}