/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import java.util.Scanner;
import victorsolorzanoworld.Player;

/**
 *
 * @author victor
 */
public class SelectRaceMenu {

    public Race chooseRace() {

        int p;
        Scanner h = new Scanner(System.in);
        System.out.print("Choose your race\n");
        System.out.print("1-Vampires\n");
        System.out.print("2-Ogros\n");
        System.out.print("3-SpaceCats\n");
        p = h.nextInt();
        switch (p) {
            case 1:
                RaceChooser tmaker = new RaceChooser(ChooseRace.VAMPIRES);
                Race t = tmaker.createrace();

                return t;

            case 2:
                RaceChooser tmaker1 = new RaceChooser(ChooseRace.OGROS);
                Race t2 = tmaker1.createrace();

                return t2;

            case 3:
                RaceChooser tmaker2 = new RaceChooser(ChooseRace.SPACECATS);
                Race t3 = tmaker2.createrace();

                return t3;

            default:
                break;
        }
        return null;
    }
}
