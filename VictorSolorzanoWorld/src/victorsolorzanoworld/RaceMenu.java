/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;

import java.util.Scanner;
import razas.BuildingMenu;

/**
 *
 * @author victor
 */
public class RaceMenu {

    public void menu(String a, Player play, Player enemi) {
        int tp = 1;
        Scanner p = new Scanner(System.in);

        //System.out.print(a);
        while (tp != 0) {
            System.out.print("1 - buildings\n");
            System.out.print("2 - atacar/defender\n");
            System.out.print("3 - Show resources\n");
            System.out.print("4 - terminar Turno\n");

            tp = p.nextInt();
            switch (tp) {
                case 1:
                    BuildingMenu MB = new BuildingMenu();

                    MB.menuEdificio(play);

                    break;
                case 2:

                    play.getR().SHOW();
                    play.getR().SelectTrop(enemi);
                    break;

                case 3:

                    play.getR().ShowResource();

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
