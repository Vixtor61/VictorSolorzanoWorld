/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import edificios.BuildingChooser;
import edificios.ChooseBuilding;
import edificios.ResourceBuilding;
import edificios.TroopMakerBuilding;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class BuildingChooseMenu {

    public void chosea(Race a) {
        int p;
        Scanner ax = new Scanner(System.in);
        System.out.print("1- new troopmaker \n");
        System.out.print("2- new rtype1 \n");
        System.out.print("3- new rtype2 \n");
        System.out.print("4- new rtype3 \n");
        System.out.print("5 -volver\n");
        p = ax.nextInt();

        switch (p) {
            case 1:
                BuildingChooser tmaker = new BuildingChooser(ChooseBuilding.tmaker);
                TroopMakerBuilding t = tmaker.createTmaker();
                if (a.getResources() >= t.getCost()) {
                    a.setResources(a.getResources() - t.getCost());
                    a.tropmakerList.add(t);
                } else {
                    System.out.print("sorry m8 u need moar " + a.getRtype1name() + "\n");
                }

                break;
            case 2:
                BuildingChooser rtype1 = new BuildingChooser(ChooseBuilding.rtype1);
                ResourceBuilding r1 = rtype1.createtropp();
                if (a.getResources() >= r1.getCost()) {
                    a.setResources(a.getResources() - r1.getCost());
                    a.rtypeList.add(r1);
                } else {
                    System.out.print("sorry m8 u need moar " + a.getRtype1name() + "\n");
                }
                break;
            case 3:
                BuildingChooser rtype2 = new BuildingChooser(ChooseBuilding.rtype2);

                ResourceBuilding r2 = rtype2.createtropp();
                if (a.getResources() >= r2.getCost()) {
                    a.setResources(a.getResources() - r2.getCost());
                    a.rtypeList.add(r2);
                } else {
                    System.out.print("sorry m8 u need moar " + a.getRtype1name() + "\n");
                }
                break;
            case 4:
                BuildingChooser rtype3 = new BuildingChooser(ChooseBuilding.rtype3);

                ResourceBuilding r3 = rtype3.createtropp();
                if (a.getResources() >= r3.getCost()) {
                    a.setResources(a.getResources() - r3.getCost());
                    a.rtypeList.add(r3);
                } else {
                    System.out.print("sorry m8 u need moar " + a.getRtype1name() + "\n");
                }
                break;

            default:
                System.out.print("not valid\n");
                break;

        }
    }

}
