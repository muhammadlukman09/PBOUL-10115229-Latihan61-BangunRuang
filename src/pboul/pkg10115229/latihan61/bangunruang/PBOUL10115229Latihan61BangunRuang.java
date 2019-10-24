/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan61.bangunruang;

/**
 *
 * @author Lukman
 */
public class PBOUL10115229Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    
    public void mainProgram(BangunRuang bangunRuang){
        bangunRuang.volume();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBOUL10115229Latihan61BangunRuang main =  new PBOUL10115229Latihan61BangunRuang();
        
        main.mainProgram(new BolaBasket (7));
        main.mainProgram(new Kerucut (14,9));
        main.mainProgram(new Tabung (10,21));
        
        
        
        
    }
    
}
