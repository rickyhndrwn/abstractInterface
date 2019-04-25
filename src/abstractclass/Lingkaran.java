/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;
import java.text.DecimalFormat;
/**
 *
 * @author HNDRWN
 */
public class Lingkaran extends  AbstractShape{
    DecimalFormat df = new DecimalFormat("#.##");
    private final double pi = 3.14;
    private final double r = 10;
    @Override
    void getLuas(){
        super.luas = pi * (r * r);
        System.out.println("Luas Ligkaran\t\t= " + df.format(luas));
    }
    
    @Override
    void getKeliling(){
        super.keliling = r * 2 * pi;
        System.out.println("Keliling Ligkaran\t= " + df.format(keliling));
    }
}
