import java.awt.*; 
import javax.swing.*; 
import javax.swing.JFrame;
//import java.awt.Graphics;
  
public class myapplet extends JApplet { 

   /* private static void drawString(String rahulsehrawat, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

}
*/  
    public void init() 
    { 
        // set size 
     this.setSize(new Dimension(800,600));
   
    } 
  
    // paint the applet 
    public void paint(Graphics g) 
    { 
        // set Color for rectangle
        //  g.setBackground(Color.BLACK);
       int arr1[]={220,250,280,2};
       int arr2[]={300,400,100,200};
        g.setColor(Color.red);
        g.drawString("rahul sehrawat",200,200);
                        
        // draw a ellipse 
       g.drawOval(100, 100, 100, 100); 
       g.drawRect(100,100,100,100);
     //  g.drawLine(3,4,6,3);
    g.drawPolyline(arr1,arr2,4);
            
    } 
 /*   public static void main(String[] args)
    {
   
    myapplet m=new myapplet();
    JFrame f=new JFrame();
    f.add(m);
    f.setSize(600,600);
  f.setVisible(true);
   
    }
*/
} 