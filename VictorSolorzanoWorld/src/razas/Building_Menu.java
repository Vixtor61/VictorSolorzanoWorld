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
    public void menuEdificio(String race,player play){
        int p;
        int chooseRype;
        Scanner r = new Scanner(System.in);
        Scanner g = new Scanner(System.in);
        
        System.out.print("1 - create a building\n");
        System.out.print("2 - troopmakerbuilding\n");
        System.out.print("3 - vehiclemaker building\n");
        System.out.print("4 - resource building\n");
        System.out.print("5 - salir\n");
        p=g.nextInt();
        switch(p){
            case 1:
                buildingChoose b = new buildingChoose();
                if(race == "razas.JOOS"){
                b.chosea(play.getJ());
                
                }
                if(race == "razas.NIG"){
                b.chosea(play.getN());    
                }
                 
                
                break;
            case 2:
                System.out.print("USE TMAKER: \n");
                if(race == "razas.JOOS"){
                play.getJ().SHOWTMAKER();
                chooseRype = r.nextInt();
                play.getJ().useTmakerBuilding(chooseRype, play);
                }
                if(race == "razas.NIG"){
                play.getN().SHOWTMAKER();    
                chooseRype = r.nextInt();
                play.getN().useTmakerBuilding(chooseRype, play);
                }
                break;
            case 3:
                System.out.print("USE RTYPE: \n");
                if(race == "razas.JOOS"){
                play.getJ().SHOWRTYPES();
                chooseRype = r.nextInt();
                
                play.getJ().useRtypeBuilding(chooseRype, play);
                }
                if(race == "razas.NIG"){
                play.getN().SHOWTMAKER();    
                chooseRype = r.nextInt();
                play.getN().useTmakerBuilding(chooseRype, play);
                }
                break;
                
                        
            case 4:
                break;
            default:
                break;
                
        }
    }
}
