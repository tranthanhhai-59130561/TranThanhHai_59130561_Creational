/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
// Alt + Enter
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class mainBT1 {
    
    public static LocalDate getDateFromString(String string, DateTimeFormatter format) { // tham khao tren GeeksforGeeks 
        // Convert the String to Date in the specified format 
        LocalDate date = LocalDate.parse(string, format); 
        // return the converted date 
        return date; 
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        HoaDonHeader hdh = new HoaDonHeader("HD01", getDateFromString("31/3/1999", format),"Trần Thanh Hải");
        CTHD cthd1 = new CTHD("Ram 32 GB", 1, 85000, 0.5);
        CTHD cthd2 = new CTHD("Ram 8 GB", 2, 100000, 0.8);
        CTHD cthd3 = new CTHD("Ram 4 GB ", 4, 150000, 0.8);
        CTHD cthd4 = new CTHD("Ram 16 GB", 2, 140000, 1.4);
        
        HoaDon hd = new HoaDon.Builder()
                .addHoaDonHeader(hdh)
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .addCTHD(cthd3)
                .addCTHD(cthd4)
                .build();
       System.out.println(hd.toString());
    }
    
}
