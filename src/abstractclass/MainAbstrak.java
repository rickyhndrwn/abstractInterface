/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;



/**
 *
 * @author HNDRWN
 */
public class MainAbstrak {
    public static void main(String[]args){
        
        AbstractShape lingkaran = new Lingkaran();
        AbstractShape persegi = new Persegi();
        lingkaran.getLuas();
        lingkaran.getKeliling();
        persegi.getLuas();
        persegi.getKeliling();
    }
}
