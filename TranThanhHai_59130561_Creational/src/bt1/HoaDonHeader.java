/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class HoaDonHeader {
    String maHoaDon;
    LocalDate ngayBan;
    String tenKhachHang;
    
    public HoaDonHeader()
    {}
       
    // Constructor
    public HoaDonHeader(String maHoaDon, LocalDate ngayBan, String tenKhachHang) 
    {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }
    
    // getter/setter

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(LocalDate ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
                 
}