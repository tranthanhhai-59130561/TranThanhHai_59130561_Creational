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

    //implement
    @Override
    public String draw() {
        return "Draw rectangle: " + getBrush() + ", " + getPaper() + ", " + getFrame();    
    }
    
}