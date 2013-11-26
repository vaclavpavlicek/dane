/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dane;

/**
 *
 * @author Venda
 */
public class Dane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vydelekKoruny = 23455;  // Deklarace proměné vydelekKoruny na 23455.
        int vydelekHalere = vydelekKoruny * 100 ;
      
        System.out.println("Výdělek v korunách: " + vydelekKoruny);
        System.out.println("Výdělek v haléřích: " + vydelekHalere);
        
        int danKoruny = vydelekKoruny / 100 * 35 ;
        int danHalere = danKoruny * 100 ;
        
        System.out.println("Daň v korunách " + danKoruny );
        System.out.println("Daň v haléřích " + danHalere );
        
        int zbytekKoruny = vydelekKoruny - danKoruny;
        int zbytekHalere = vydelekHalere - danHalere;
        
        System.out.println("Zbytek po odečtení daně v korunách " + zbytekKoruny);
        System.out.println("Zbytek po odečtení daně v haléřích " + zbytekHalere);
        
    }
    
}
