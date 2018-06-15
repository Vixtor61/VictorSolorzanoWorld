/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tropas;

import java.util.Scanner;
import victorsolorzanoworld.player;

/**
 *
 * @author estudiante
 */
public class ChooseAtaked {
    public void menuattack(tropa a,player enemi){
    int b;
    int index;
    Scanner K = new Scanner(System.in);
    Scanner I = new Scanner(System.in);
        System.out.print("1-attack rtype\n");
    System.out.print("2-attack troopmaker\n ");
    System.out.print("3-attacke trop\n");
    b = K.nextInt();
    switch(b){
        case 1:
           
                enemi.getR().SHOWRTYPES();
                index = I.nextInt();
                System.out.print("select enemy to atack\n");
                enemi.getR().useAtackeRtype(index, a);
                break;
                
        case 2:   
           
            enemi.getR().SHOWRTYPES();
                index = I.nextInt();
                System.out.print("select enemy to atack\n");
                enemi.getR().useAtackeTmaker(index, a);
                break;
        case 3:
            enemi.getR().SHOWRTYPES();
                index = I.nextInt();
                System.out.print("select enemy to atack\n");
                enemi.getR().useAtackeTroop(index, a);
                break;
    }
}
}
