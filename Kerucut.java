/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kegiatan1;

/**
 *
 * @author tazkia
 */
public class Kerucut extends BangunRuang {
  
   public double lpk;
   public double volk;

   int r =7;
   int s=9;
   int t=7;
   
   @Override
    float getLuasPermukaan() {
        lpk= Math.PI*r*(r+s);
        System.out.println("Luas Permukaan Kerucut="+lpk);
       return (float) lpk;
    }

    @Override
    float getVolume() {
        volk= 1.0/3.0*Math.PI*r*r*t;
        System.out.println("Volume Kerucut :"+volk);
    return (float) volk;
    }
    
}
