/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{

    private static Shape rectangle;

    //Constructor
    public Rectangle() {
    }
    //Constructor
    public Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    
       
    public static Shape createRectangle() {
        if (rectangle == null) {
            rectangle = new Rectangle();
        }
        return rectangle;
    }
    //implement
    @Override
    public String draw() {
        return "Vẽ hình chữ nhật: " + getBrush() + ", " + getPaper() + ", " + getFrame();    
    }
    
}
