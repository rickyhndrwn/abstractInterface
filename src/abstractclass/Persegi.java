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
public class Persegi extends AbstractShape {
    DecimalFormat df = new DecimalFormat("#.##");
    private final double s = 10;
    @Override
    void getLuas(){
        super.luas = s * s;
        System.out.println("Luas Persegi\t\t= " + df.format(luas));
    }

    @Override
    void getKeliling() {
        super.keliling = 4 * s;
        System.out.println("Keliling Persegi\t= " + df.format(keliling));
    }
}
