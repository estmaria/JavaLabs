import java.awt.*;
import java.awt.geom.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/** The Graphics2DDrawingExample program drwas the Norwegian flag and the Olympic rings flag
*@author Maria Esteban
*@version 1.0
*@since 2023-03-24  */

public class Graphics2DDrawingExample extends JComponent
{
   public void paintComponent(Graphics g)
   {
      //draws the Norwegian flag
      drawNorwegianFlag(g);
      //draws the olympic rings flag
      drawRing(g, 10, 250, "blue");
      drawRing(g, 105, 250, "black");
      drawRing(g, 200, 250, "red");
      drawRing(g, 57.5, 310, "yellow");
      drawRing(g, 152.5, 310, "green");
   }

   /**
      Draws a Norwegian flag
      @param g the graphics object
   */
  void drawNorwegianFlag(Graphics g) 
  {
      Graphics2D g2d = (Graphics2D) g;
      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

      g2d.setColor(new Color(196,77,77));
      g2d.fillRect(10, 25, 300, 200);


      g2d.setColor(Color.WHITE);
      g2d.fillRect(90, 25, 40, 200);
      g2d.setColor(Color.WHITE);
      g2d.fillRect(10, 105, 300, 40);

      g2d.setColor(new Color(30,44,172));
      g2d.fillRect(100, 25, 20, 200);
      g2d.setColor(new Color(30,44,172));
      g2d.fillRect(10, 115, 300, 20);
  }

  /**
      Draws a circle at a given location and in a given color
      @param g the graphics object
      @param xLeft the x coordinate of the top left corner
      @param yTop the y coordinate of the top left corner
      @param color the color of the ring (red, blue, black, yellow or green)
   */
  void drawRing (Graphics g, double xLeft, double yTop, String color)
  {
   Graphics2D g2d = (Graphics2D) g;
   double radius = 45;
   Stroke stroke2 = new BasicStroke(2f);
   g2d.setStroke(stroke2);
   if (color.equals("red")) {g2d.setColor(Color.RED);}
   else if (color.equals("blue")) {g2d.setColor(Color.BLUE);}
   else if (color.equals("black")) {g2d.setColor(Color.BLACK);}
   else if (color.equals("yellow")) {g2d.setColor(Color.YELLOW);}
   else if (color.equals("green")) {g2d.setColor(Color.GREEN);}

   Shape theCircle = new Ellipse2D.Double(xLeft, yTop, 2.0 * radius, 2.0 * radius);
   g2d.draw(theCircle);
  }
}

