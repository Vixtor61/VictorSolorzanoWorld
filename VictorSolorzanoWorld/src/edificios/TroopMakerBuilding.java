/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

import java.util.ArrayList;
import razas.Race;
import tropas.ChooseTroop;
import tropas.Choose;
import tropas.Tropa;
import victorsolorzanoworld.Player;

/**
 *
 * @author UCA
 */
public class TroopMakerBuilding extends Building {

    int fasesactual = 0;
    int fases = 0;
    private int troopMax = 5;
    private ArrayList<Tropa> making = new ArrayList<Tropa>();
    boolean isMaking;

    public void maketroop(Race JO, String Type) {
        if (Type == "especial") {
            ChooseTroop f = new ChooseTroop(Choose.JOOespecial);
            this.making.add(f.createtropp());
        }

        if (Type == "army") {
            ChooseTroop f = new ChooseTroop(Choose.JOOarmy);
            this.making.add(f.createtropp());
        }
        if (Type == "vehicle") {
            ChooseTroop f = new ChooseTroop(Choose.JOOSvehicle);
            this.making.add(f.createtropp());
        }
    }

    public void update(Player p) {
        int cont = 0;
        int[] arrayIndex;
        int contE = 0;

        arrayIndex = new int[troopMax];
        for (Tropa tactual : making) {
            tactual.updateTraining();
        }
        for (Tropa tactual : making) {
            if (tactual.isIsA()) {
                // System.out.print("fdfdfdfdfdfDFDFDFDFD");

                p.getR().TropList.add(tactual);

                arrayIndex[contE] = cont;
                contE++;
            }
            cont++;
        }
        for (int i = 0; i < contE; i++) {

            making.remove(arrayIndex[i]);
        }
    }

}
