/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import java.util.Scanner;
import victorsolorzanoworld.player;

/**
 *
 * @author victor
 */
public class menuchooseR {
    public RACE chooseRace(){
        
        int p;
        Scanner h = new Scanner(System.in);
        System.out.print("Choose your race\n");
        System.out.print("1-Vampires\n");
        System.out.print("2-Ogros\n");
        System.out.print("3-SpaceCats\n");
        p = h.nextInt();
        switch(p){
            case 1:
                racechoser tmaker = new racechoser(chooserace.VAMPIRES);
            RACE t= tmaker.createrace();
            
        return t;
               
            case 2:
                racechoser tmaker1 = new racechoser(chooserace.OGROS);
            RACE t2= tmaker1.createrace();
            
        return t2;
               
            case 3:
                racechoser tmaker2 = new racechoser(chooserace.SPACECATS);
            RACE t3= tmaker2.createrace();
            
            return t3;
                
            default:
                break;
        }
        return null;
    }
}
