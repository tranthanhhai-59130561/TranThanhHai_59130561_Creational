/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class HoaDon {
    HoaDonHeader hoaDonHeader = new HoaDonHeader();
    ArrayList<CTHD> cthd = new ArrayList<>();
    public static class Builder{
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> cthd = new ArrayList<>();
    }
    
}
