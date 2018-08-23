/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import edificios.ResourceBuilding;
import edificios.TroopMakerBuilding;
import java.util.ArrayList;
import java.util.Scanner;
import tropas.ChooseAtaked;
import tropas.Tropa;
import victorsolorzanoworld.Player;

/**
 *
 * @author victor
 */
public class Race {

    private String racename;
    private String rtype1name;
    private String rtype2name;
    private String rtype3name;
    private int resources1;
    private int resources2;
    private int resources3;
    private int live;
    public boolean defeat = false;
    public ArrayList<Tropa> TropList = new ArrayList<Tropa>();
    public ArrayList<Tropa> TropListA = new ArrayList<Tropa>();
    public ArrayList<ResourceBuilding> rtypeList = new ArrayList<ResourceBuilding>();
    public ArrayList<TroopMakerBuilding> tropmakerList = new ArrayList<TroopMakerBuilding>();

    public String getRacename() {
        return racename;
    }

    public void setRacename(String racename) {
        this.racename = racename;
    }

    public String getRtype1name() {
        return rtype1name;
    }

    public void setRtype1name(String rtype1name) {
        this.rtype1name = rtype1name;
    }

    public String getRtype2name() {
        return rtype2name;
    }

    public void setRtype2name(String rtype2name) {
        this.rtype2name = rtype2name;
    }

    public String getRtype3name() {
        return rtype3name;
    }

    public void setRtype3name(String rtype3name) {
        this.rtype3name = rtype3name;

    }

    public int getResources() {
        return resources1;
    }

    public void setResources(int resources) {
        this.resources1 = resources;
    }

    public int getLive() {
        return live;
    }

    public int getResources2() {
        return resources2;
    }

    public void setResources2(int resources2) {
        this.resources2 = resources2;
    }

    public int getResources3() {
        return resources3;
    }

    public void setResources3(int resources3) {
        this.resources3 = resources3;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public void SHOW() {
        System.out.print("Showing all trops: \n");
        for (Tropa TropList : TropList) {

            System.out.print("trop race:" + TropList.getrace() + " troop type:" + TropList.getType() + " troop atacck:" + TropList.getAtackt() + " troop life:" + TropList.getVida() + " \n");

        }
    }

    public void SelectTrop(Player enemi) {
        int p;
        int cont = 0;
        Scanner Ch = new Scanner(System.in);
        System.out.print("Showing all avadibletroops trops: \n");
        for (Tropa TropList : TropList) {

            System.out.print("trop race:" + TropList.getrace() + " troop type:" + TropList.getType() + " troop atacck:" + TropList.getAtackt() + " troop life:" + TropList.getVida() + " \n");

        }
        p = Ch.nextInt();

        for (Tropa TropListx : TropList) {
            if (cont == p) {
                ChooseAtaked a = new ChooseAtaked();
                a.menuattack(TropListx, enemi);

            }
            cont++;
        }
    }

    public void SHOWTMAKER() {
        System.out.print("Showing all tropmakers: \n");
        for (TroopMakerBuilding TropList : tropmakerList) {

            System.out.print("tropmaker race:" + TropList.getrace() + " troopmaker type:" + TropList.getType() + " troopmaker life:" + TropList.getVida() + " Status " + TropList.isBuilding() + "\n");

        }
    }

    public void SHOWRTYPES() {
        System.out.print("Showing all rtypes: \n");
        for (ResourceBuilding rtypeLists : rtypeList) {

            System.out.print("rtype race:" + rtypeLists.getrace() + " troopmaker type:" + rtypeLists.getType() + " rtype life:" + rtypeLists.getVida() + " Status:" + rtypeLists.isBuilding() + "\n");

        }
    }

    public TroopMakerBuilding getTropMaker(int index) {
        int aux;
        for (TroopMakerBuilding tropList : tropmakerList) {
            aux = tropmakerList.indexOf(tropList);

            if (index == aux) {
                System.out.print("AHOOOOOOY");
                return tropList;
            }

        }
        return null;
    }

    public void UPDATE(Player p) {
        for (ResourceBuilding rtypeLists : rtypeList) {
            rtypeLists.update();
            rtypeLists.UPDATE();

        }
        for (TroopMakerBuilding TropLists : tropmakerList) {
            TropLists.UPDATE();
            TropLists.update(p);
            System.out.print("updating");
            TropLists.setFasestoBuildA(TropLists.getFasestoBuildA() + 1);

        }

    }

    public void updateTropstatus(Player enemi) {

        for (Tropa TropLists : TropList) {
            System.out.print("updating");
            this.useAtacker(TropLists, enemi);

        }
    }

    public void useTmakerBuilding(int a, Player p) {
        int contA = 0;
        int choseTrop;
        Scanner Ch = new Scanner(System.in);

        for (TroopMakerBuilding TropLists : tropmakerList) {
            if (!TropLists.isBuilding() && contA == a) {

                System.out.print("Chose trop type\n 1-Especial\n 2-army\n 3-vehicle\n");
                choseTrop = Ch.nextInt();
                switch (choseTrop) {
                    case 1:
                        TropLists.maketroop(p.getR(), "especial");
                        break;
                    case 2:
                        TropLists.maketroop(p.getR(), "army");
                        break;
                    case 3:
                        TropLists.maketroop(p.getR(), "vehicle");
                        break;
                }

            } else {
                System.out.print("TMAKER NOT AVADIBLE\n");
            }
            contA++;

        }

    }

    public void useRtypeBuilding(int a, Player p) {

        int contA = 0;
        for (ResourceBuilding resourceB : rtypeList) {

            if (!resourceB.isBuilding() && contA == a) {
                if (contA == a) {

                    System.out.print(resourceB.getType());
                    if (resourceB.getType() == "rtype1") {
                        System.out.print("sdgfsdgfd");
                        this.resources1 = this.resources1 + resourceB.make();
                    }
                    if (resourceB.getType() == "rtype2") {
                        this.resources2 = this.resources2 + resourceB.make();
                    }
                    if (resourceB.getType() == "rtype3") {
                        this.resources3 = this.resources3 + resourceB.make();
                    }

                }
            } else {

                System.out.print("TMAKER NOT AVADIBLE\n");
            }
            contA++;

        }

    }

    public void updatedamege(int hash, int atack) {
        for (ResourceBuilding resourceB : rtypeList) {
            if (hash == resourceB.hashCode()) {
                resourceB.vida(resourceB.getVida() - atack);
            }
        }
        for (Tropa resourceB : TropList) {
            if (hash == resourceB.hashCode()) {
                resourceB.vida(resourceB.getVida() - atack);
            }
        }
        for (TroopMakerBuilding resourceB : tropmakerList) {
            if (hash == resourceB.hashCode()) {
                resourceB.vida(resourceB.getVida() - atack);
            }
        }
    }

    public void useAtacker(Tropa atacker, Player atacked) {

        if (atacker.isIsA()) {

            atacked.getR().updatedamege(atacker.getAtacking(), atacker.getAtackt());
        }

    }

    public void useAtackeRtype(int a, Tropa atackerp) {
        int contA = 0;
        int hash = 0;
        for (ResourceBuilding resourceB : rtypeList) {
            if (contA == a) {
                if (resourceB.getVida() > 0) {
                    resourceB.vida(resourceB.getVida() - atackerp.getAtackt());
                    hash = resourceB.hashCode();
                    atackerp.setAtacking(hash);
                    atackerp.setIsA(true);
                }

            }

            contA++;

        }

    }

    public void useAtackeTmaker(int a, Tropa atackerp) {
        int contA = 0;
        int hash = 0;
        for (TroopMakerBuilding tmaker12 : tropmakerList) {
            if (contA == a) {
                if (tmaker12.getVida() > 0) {
                    tmaker12.vida(tmaker12.getVida() - atackerp.getAtackt());
                    hash = tmaker12.hashCode();
                    atackerp.setAtacking(hash);
                    atackerp.setIsA(true);
                }

            }

            contA++;

        }
    }

    public void useAtackeTroop(int a, Tropa atackerp) {
        int contA = 0;
        int hash = 0;
        for (Tropa tropp : TropList) {
            if (contA == a) {
                if (tropp.getVida() > 0) {
                    tropp.vida(tropp.getVida() - atackerp.getAtackt());
                    hash = tropp.hashCode();
                    atackerp.setAtacking(hash);
                }

            }

            contA++;

        }

    }

    public void restlife(int index, int rest) {
        int aux;
        int aux2;
        for (Tropa tropList : TropList) {
            aux = TropList.indexOf(tropList);

            if (index == aux) {

                aux2 = tropList.getVida();

                tropList.vida(aux2 - rest);
                System.out.print(this.getClass().getName() + " " + rest + " of life left \n");
            }

        }
    }

    public Tropa getTrop(int index) {
        int aux;
        for (Tropa tropList : TropList) {
            aux = TropList.indexOf(tropList);

            System.out.print(tropList.getrace() + " troop type:" + tropList.getType() + " troop atacck:" + tropList.getAtackt() + " troop life:" + tropList.getVida() + " ");
            if (index == aux) {
                return tropList;
            }

        }
        return null;
    }

    public void ShowResource() {
        System.out.print(this.rtype1name + ": " + this.resources1 + "\n");
        System.out.print(this.rtype2name + ": " + this.resources2 + "\n");
        System.out.print(this.rtype3name + ": " + this.resources3 + "\n");
    }

    public void deleteALLTROPS() {
        this.TropList.remove(0);
    }

}
