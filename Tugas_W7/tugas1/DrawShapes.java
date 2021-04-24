/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w7.tugas1;

/**
 *
 * @author Ilham Nugraha
 */
import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init(){
        font = new Font("Arial", Font.ITALIC,18);
        redColor = Color.red;
        backgroundColor = Color.orange;
        blueColor = new Color(0,0,122);
        setBackground(backgroundColor);
    }
    public void stop(){
    }
    public void paint(Graphics graph){
        //set font
        graph.setFont(font);
        //create a title
        graph.drawString("Draw Shapes",90,20);
        
        //set the color for the first shape
        graph.setColor(blueColor);
        
        //draw a retangle using drawRect(int x, int y, int width, int weight, int startAngle, int arcAngle)
        graph.drawRect(120,120,120,120);
        
        //this will fill a retangle
        graph.fillRect(115,115,90,90);
        
        //set the color for the next shape
        graph.setColor(redColor);
        
        //draw a circle using drawArc
        graph.fillArc(110,110, 50, 50, 0, 360);
        
        //set color for the next shape
        graph.setColor(Color.CYAN);
        
        //this will filla retangle
        graph.fillRect(50,50,60,50);
    }
}