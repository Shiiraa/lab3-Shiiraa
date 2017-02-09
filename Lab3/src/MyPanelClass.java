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
 
                        //Paint the background
                        g.setColor(Color.black);
                        g.fillRect(x1, y1, width+1, height+1);

                        
                        
                        g.setColor(Color.red);
                        g.fillRect(0, 0, 400, 30);
                        g.setColor(Color.white);
                        g.fillRect(0, 25, 400, 35);
                        g.setColor(Color.red);
                        g.fillRect(0, 60, 400, 50);
                        g.setColor(Color.white);
                        g.fillRect(0, 100, 400, 35);
                        g.setColor(Color.red);
                        g.fillRect(0, 135, 400, 35);
                        
                        Polygon p = new Polygon();
                        p.addPoint(0, 0);
                        p.addPoint(0, 170);
                        p.addPoint(100, 80);
                        g.setColor(Color.blue);
                        g.fillPolygon(p);
                        
                        //Star
                        Polygon p2 = new Polygon();
                        
                        // triangle 5 Point
                        p2.addPoint(x1 + 25, y1 + 73);
                        
                        //Point between triangle 5 and 1
                        p2.addPoint(x1 + 41, y1 + 73);
                        
                        // Triangle 1 point
                        p2.addPoint(x1 + 47, y1 + 58);
                        
                        p2.addPoint(x1 + 53, y1 + 73);
                        
                        p2.addPoint(x1 + 69, y1 + 73);
                        
                        p2.addPoint(x1 + 56, y1 + 83);
                        
                        p2.addPoint(x1 + 61, y1 + 98);
                        
                        //Point between triangle 4 and 3
                        p2.addPoint(x1 + 47, y1 + 88);
                        
                        // Triangle 4
                        p2.addPoint(x1 + 34, y1 + 98);
                        
                        //Point between triangle 5 and 4
                        p2.addPoint(x1 + 38, y1 + 83);
                        
                        g.setColor(Color.white);
                        g.fillPolygon(p2);
                        
                     
                        
			}
}