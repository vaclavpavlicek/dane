/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dane;

import java.util.Scanner;

/**
 *
 * @author Venda
 */
public class Objekty {
    
    int vydelekKoruny ;
    int vydelekHalere ;
    int dane ;
    int danKoruny ;
    int danHalere ;
    int zbytekKoruny ;
    int zbytekHalere ;
    String vydelekKorunyString ;
    String daneString ;
    
    Scanner sc = new Scanner(System.in, "UTF-8");
    
    public void prevodKorun(){
                            
        System.out.println("Napište svůj příjem:") ;
        
        vydelekKorunyString = sc.nextLine() ;
        
        vydelekKoruny = Integer.parseInt(vydelekKorunyString) ;
        
        vydelekHalere = vydelekKoruny * 100 ;
    
        System.out.println("Váš výdělek v korunách: " + vydelekKoruny);
        System.out.println("Váš výdělek v haléřích: " + vydelekHalere);
        
    }
    
    public void dane(){
    
        System.out.println("Napište daň:") ;
        
        daneString = sc.nextLine() ;
        
        dane = Integer.parseInt(daneString) ;
        
        danKoruny = vydelekKoruny / 100 * dane ;
        danHalere = danKoruny * 100 ;
        
        System.out.println("Daň v korunách " + danKoruny );
        System.out.println("Daň v haléřích " + danHalere );
        
    }
    
    public void zbytek(){
        
        zbytekKoruny = vydelekKoruny - danKoruny ;
        zbytekHalere = vydelekKoruny * 100 ;

        System.out.println("Zbytek po odečtení daně v korunách " + zbytekKoruny);
        System.out.println("Zbytek po odečtení daně v haléřích " + zbytekHalere);
        
    }
    
}
