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
public class MainInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        kotakBalok k = new kotakBalok();
        persegiKubus p = new persegiKubus();
        lingkaranBola l = new lingkaranBola();
        
        System.out.println("kotakBalok");
        System.out.println("Luas kotak\t\t= "+k.getluas());
        System.out.println("Volume balok\t\t= "+k.getvolume());
        System.out.println("\npersegiKubus");
        System.out.println("Luas persegi\t\t= "+p.getluas());
        System.out.println("Volume kubus\t\t= "+p.getvolume());
        
    }
    
}
