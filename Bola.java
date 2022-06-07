/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kegiatan1;

public class Bola extends BangunRuang {

    public double lpb;
    public double volb;
    
    int r =14;
    double phi=3.14;
    @Override
    float getLuasPermukaan() {
        lpb = 4*phi*r*r;
        System.out.println("Luas permukaan bola= "+lpb);
    return (float)lpb;
    }

    @Override
    float getVolume() {
        volb = 4/3*phi*r*r*r;
        System.out.println("Volume bola ="+volb);
    return (float)volb;
    }     
   
  
}
