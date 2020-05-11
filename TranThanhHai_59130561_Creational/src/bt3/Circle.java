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
public class Circle extends Shape {

    protected static Shape circle;
    
    protected Circle() {
        super("Circle-brush", "Circle-paper", "Circle-frame");
    };
    
    
    public static Shape createCircle() {
        if (circle == null) {
            circle = new Circle();
        }
        return circle;
    }
    
    //implement
    @Override
    public String draw() {
        return "Draw circle: " + getBrush() + 
                ", " + getPaper() + ", " + getFrame();    
    }
    
}
