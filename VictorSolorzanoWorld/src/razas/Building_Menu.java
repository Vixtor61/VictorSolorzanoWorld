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
        Scanner g = new Scanner(System.in);
        
        System.out.print("1 - create a building\n");
        System.out.print("2 - troopmakerbuilding\n");
        System.out.print("3 - vehiclemaker building\n");
        System.out.print("4 - resource building\n");
        System.out.print("5 - salir\n");
        p=g.nextInt();
        //System.out.print(race);
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
                if(race == "razas.JOOS"){
                play.getJ().SHOWTMAKER();    
                }
                if(race == "razas.NIG"){
                play.getN().SHOWTMAKER();    
                }
                break;
            case 3:
                
                break;
            case 4:
                break;
            default:
                break;
                
        }
    }
}
