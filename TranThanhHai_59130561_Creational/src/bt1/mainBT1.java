/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
// Alt + Enter
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Admin
 */
public class mainBT1 {   
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        HoaDonHeader hoaDonHeader = new HoaDonHeader("HD01", formatDate.parse("31/3/1999"), "Trần Thanh Hải");
        CTHD cthd1 = new CTHD("Ram 16 GB", 2, 1800000, 12);
        CTHD cthd2 = new CTHD("Ram 4 GB", 4, 1700000, 15);
        CTHD cthd3 = new CTHD("Ram 32 GB", 1, 3500000, 12);
        CTHD cthd4 = new CTHD("Ram 8 GB", 3, 2300000, 10);
        
        HoaDon hoaDon = new HoaDon.Builder()
                            .addHoaDonHeader(hoaDonHeader)
                            .addCTHD(cthd1)
                            .addCTHD(cthd2)
                            .addCTHD(cthd3)
                            .addCTHD(cthd4)
                            .build();
        System.out.println(hoaDon.toString());
    }
       
}
