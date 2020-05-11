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
public class Triangle extends Shape {
    private static Shape triangle;
    
    //Constructor
    public Triangle() {
    }

    //Constructor
    public Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    
    
    public static Shape createTriangle() {
        if (triangle == null) {
            triangle = new Triangle();
        }
        return triangle;
    }
    
    @Override
    public String draw() {
        return "Draw triangle: " + getBrush() + ", " + getPaper() + ", " + getFrame();
    }
    
}
