/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Admin
 */
public class HoaDonHeader {
    String maHoaDon;
    Date ngayBan;
    String tenKhachHang;
    
    public HoaDonHeader()
    {}
       
    // Constructor
    public HoaDonHeader(String maHoaDon, Date ngayBan, String tenKhachHang) 
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

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    // toString
    @Override
    public String toString() {
        return "HoaDonHeader{" + "mã hóa đơn = " + maHoaDon + 
                ", ngày bán = " + ngayBan + ", tên khách hàng = " 
                + tenKhachHang + '}';
    }
    
    
                 
}
