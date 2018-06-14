/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;

import java.util.Scanner;
import razas.Building_Menu;
import razas.JOOS;

/**
 *
 * @author victor
 */
public class racemenu {
    public void menu(String a,player play){
    int tp=1;
    Scanner p = new Scanner(System.in);
    
    
    //System.out.print(a);
    while(tp!=0){
    System.out.print("1 - buildings\n");
    System.out.print("2 - atacar\n");
    System.out.print("3 - terminar Turno\n");
    tp = p.nextInt();
    switch(tp){
        case 1:
            Building_Menu MB = new Building_Menu();
            if(a=="razas.JOOS"){
               MB.menuEdificio(a,play); 
            }
            if(a=="razas.NIG"){
               MB.menuEdificio(a,play); 
            }
            
            break;
        case 2:
            if(a=="razas.JOOS"){
               play.getJ().SHOW(); 
            }
            if(a=="razas.NIG"){
               play.getN().SHOW();
            }
            break;
        case 3:
            tp = 0;
            break;
        default:
            System.out.print("not valid\n");
            
                
                        
    }    
    }
    
}
    
}
