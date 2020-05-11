/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Admin
 */
public class mainBT2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyStringBuilder str = new MyStringBuilder()
                .addString("Trần Thanh Hải")
                .addString("59130561")
                .addFloat(7.0f)
                .addBool(true);
        System.out.println(str.toString());               
    }
}
