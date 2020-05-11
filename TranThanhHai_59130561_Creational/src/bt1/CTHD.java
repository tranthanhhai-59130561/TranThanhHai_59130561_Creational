/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Admin
 */
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    float chiecKhau;
    
    // constructor
    public CTHD(String sanPham, int soLuong, double donGia, float chiecKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chiecKhau = chiecKhau;
        
        
    }
    // getter/setter
    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public float getChiecKhau() {
        return chiecKhau;
    }

    public void setChiecKhau(float chiecKhau) {
        this.chiecKhau = chiecKhau;
    }
    
    
}
