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
    public void menu(String a,player play,player enemi){
    int tp=1;
    Scanner p = new Scanner(System.in);
    
    
    //System.out.print(a);
    while(tp!=0){
    System.out.print("1 - buildings\n");
    System.out.print("2 - atacar/defender\n");
    System.out.print("3 - Show resources\n");
    System.out.print("4 - terminar Turno\n");
    
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
               play.getJ().SelectTrop(enemi);
            }
            if(a=="razas.NIG"){
               play.getN().SHOW();
               play.getJ().SelectTrop(enemi);
            }
            break;
        case 3:
            if(a=="razas.JOOS"){
               play.getJ().ShowResource();
            }
            if(a=="razas.NIG"){
               play.getN().ShowResource();
            }
            break;
        case 4:
            tp = 0;
            break;
        default:
            System.out.print("not valid\n");
            
                
                        
    }    
    }
    
}
    
}
