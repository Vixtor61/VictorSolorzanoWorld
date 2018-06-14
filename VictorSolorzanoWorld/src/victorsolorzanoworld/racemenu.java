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
    int tp;
    Scanner p = new Scanner(System.in);
    
    System.out.print("1 - buildings\n");
    System.out.print("2 - atacar\n");
    System.out.print("3 - terminar Turno\n");
    tp = p.nextInt();
    //System.out.print(a);
    while(tp!=0){
    switch(tp){
        case 1:
            Building_Menu MB = new Building_Menu();
            if(a=="razas.JOOS"){
               MB.menuEdificio(a,play); 
            }
            if(a=="razas.NIG"){
               MB.menuEdificio(a,play); 
            }
            System.out.print(" AMD FOR THE WIN\n");
            tp=p.nextInt();
            break;
        case 2:
        case 3:
            tp = 0;
            break;
        default:
            System.out.print("not valid");
            System.out.print(" AMD FOR THE WIN\n");
            tp=p.nextInt();
                
                        
    }    
    }
    
}
    
}
