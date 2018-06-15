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
public class Building_Menu {
    public void menuEdificio(player play){
        int p;
        int chooseRype;
        Scanner r = new Scanner(System.in);
        Scanner g = new Scanner(System.in);
        
        System.out.print("1 - create a building\n");
        System.out.print("2 - troopmakerbuilding\n");
        System.out.print("3 - resource building\n");
        
        System.out.print("4 - salir\n");
        p=g.nextInt();
        switch(p){
            case 1:
                buildingChoose b = new buildingChoose();
          
                b.chosea(play.getR());
                
                
             
             
                
                break;
            case 2:
                System.out.print("USE TMAKER: \n");
                
                play.getR().SHOWTMAKER();
                chooseRype = r.nextInt();
                play.getR().useTmakerBuilding(chooseRype, play);
                
                
                break;
            case 3:
                System.out.print("USE RTYPE: \n");
            
                play.getR().SHOWRTYPES();
                chooseRype = r.nextInt();
                
                play.getR().useRtypeBuilding(chooseRype, play);
                
                
                break;
                
                        
            case 4:
                break;
            default:
                break;
                
        }
    }
}
