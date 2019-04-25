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
public class persegiKubus implements bangunRuang {
    private final double s = 10;
    @Override
    public double getluas() {
        double luas = s * s;
        return luas;
    }

    @Override
    public double getvolume() {
        double volume = s * s * s;
        return volume;
    }
}
