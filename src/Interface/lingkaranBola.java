/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author HNDRWN
 */
public class lingkaranBola implements bangunRuang, Bola {
    private final double pi = 3.14;
    double r;
    @Override
    public double getluas() {
        double luas = pi * (r * r);
        return luas;
    }

    @Override
    public double getvolume(){
        double volume = 4 / 3 * pi * (r * r * r);
        return volume;
    }

    @Override
    public void setJari2(double r) {
        r = 10;
    }

    @Override
    public double getJari2() {
        return r;
    }
}
