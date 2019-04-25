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
public class kotakBalok implements bangunRuang{
    private final double p = 10, l = 10, t = 10;
    @Override
    public double getluas() {
        double luas = p * l;
        return luas;
    }

    @Override
    public double getvolume() {
        double volume = p * l * t;
        return volume;
    }
}
