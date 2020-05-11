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
    ArrayList<CTHD> dsCT = new ArrayList<>();
    
    public HoaDon(Builder builder) // public static class Builder{} 
    {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.dsCT = builder.dsCT ;
    }
    
    public static class Builder{
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> dsCT = new ArrayList<>();
          
        public Builder()
        {}
        
        public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd){
            this.dsCT.add(cthd);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }

        //toString
        @Override
        public String toString() {
            String s = hoaDonHeader.toString();
            for(int i=0; i<dsCT.size(); i++){
            s += "\n"+dsCT.get(i).toString();
            }
            return s;
        }
                 
    }
    
}
