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
public class mainBT3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory sF = new ShapeFactory();
        Shape shapeRect = sF.createShape(ShapeType.rectangle);
        Shape shapeCir = sF.createShape(ShapeType.circle);
        Shape shapeTri = sF.createShape(ShapeType.triangle);
        
        // test singleton
        Shape shapeRect1 = sF.createShape(ShapeType.rectangle);
        shapeRect1.setBrush("new Rectangle-brush");
        
        System.out.println(shapeRect.draw());
        System.out.println(shapeCir.draw());
        System.out.println(shapeTri.draw());
    }
}
