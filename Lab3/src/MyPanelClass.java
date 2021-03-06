import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.red);
                        g.fillRect(0, 0,getWidth() , getHeight()/5);
                        g.fillRect(0,(getHeight()/2)-(21/2),getWidth() , getHeight()/5);
                        g.fillRect(0,(getHeight()-getHeight()/6),getWidth() , getHeight()/5);
                        Polygon p3 = new Polygon();
                        p3.addPoint(0, 0);
                        p3.addPoint(getWidth()/2+5, getHeight()/2+5);
                        p3.addPoint(0,getHeight());
                        g.setColor(Color.blue);
                        g.fillPolygon(p3);
                        g.setColor(Color.white);
                        g.fillPolygon(p2);
                        
                        
                        
                        g.setColor(Color.blue);
                        g.drawLine(0, 0,getWidth()/2+5, getHeight()/2+5);
                        g.drawLine(0,getHeight(),getWidth()/2+5, getHeight()/2+5);
                        g.setColor(Color.red);
                       
                        g.setColor(Color.white);
                        g.fillPolygon(p2);
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.BLACK);
//                        g.fillPolygon(p);
                        //Paint the background
//                        g.setColor(Color.DARK_GRAY);
//                        g.fillRect(x1, y1, width+1, height+1);
//                        g.setColor(Color.BLUE);
//                        g.drawOval(getWidth()/2-(55/2), (getHeight()/2)-(55/2), 55, 55);
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+5, y1+5, width-11, height-11);
//                        g.setColor(Color.red);
//                        g.drawLine(0,getHeight() ,getWidth(),0);
//                        g.setColor(Color.white);
//                        g.drawLine( 0, 0, x2, y2);
                        }
}