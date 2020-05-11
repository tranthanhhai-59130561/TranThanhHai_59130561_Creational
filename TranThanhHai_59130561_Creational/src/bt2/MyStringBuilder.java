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
public class MyStringBuilder {
    String str;

    // constructor
    public MyStringBuilder(String str) {
        this.str = str;
    }
   
    //Phương thức addString(String s):
    //Thêm chuỗi s vào sau chuỗi str và trả về kiểu MyStringBuilder.
    public MyStringBuilder addString(String s) {
        str += s;
        return this;
    }
    
    //Phương thức addFloat(float f): 
    //Thêm số s vào sau chuỗi str và trả về kiểu MyStringBuilder.
    public MyStringBuilder addFloat(float f) {
        str += f;
        return this;
    }
    
    //Phương thức addBool(boolean b): 
    //Thêm giá trị b vào sau chuỗi str và trả về kiểu MyStringBuilder.
    public MyStringBuilder addBool(boolean b) {
        str += b;
        return this;
    }

    @Override
    public String toString() {
        return str;
    }
    
    

}
