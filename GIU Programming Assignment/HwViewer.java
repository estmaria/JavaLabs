import javax.swing.JComponent;
import javax.swing.JFrame;

public class HwViewer 
{
    public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(600, 800);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new Graphics2DDrawingExample();
      frame.add(component);

      frame.setVisible(true);
   }
}
