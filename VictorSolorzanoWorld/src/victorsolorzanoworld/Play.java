/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;

import edificios.BuildingChooser;
import edificios.ChooseBuilding;
import edificios.ResourceBuilding;
import edificios.TroopMakerBuilding;
import edificios.VehicleMakerBuilding;
import tropas.Tropa;

/**
 *
 * @author victor
 */
public class Play {

    private int fasecounter;
    private int turn;

    private String current;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public void Start() {
        Player p = new Player();
        Player p2 = new Player();
        RaceMenu s = new RaceMenu();

        while (!p.isDefeat() && !p2.isDefeat()) {

            s.menu(p.getRace(), p, p2);
            p.update(p2);
            System.out.print("P1 TURN ENDED\n");

            s.menu(p2.getRace(), p2, p);
            p2.update(p);
            System.out.print("P2 TURN ENDED\n");
            System.out.print("FASE ENDED\n");
            this.fasecounter++;
        }

        System.out.print("GAME ENDED\n");
    }

    public int getFasecounter() {
        return fasecounter;
    }

    public void setFasecounter(int fasecounter) {
        this.fasecounter = fasecounter;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void atack(Tropa ataked, int g) {
        ataked.restlife(g);
    }

    public void atack(ResourceBuilding ataked, int g) {
        ataked.restlife(g);
    }

    public void atack(TroopMakerBuilding ataked, int g) {
        ataked.restlife(g);
    }

    public void atack(VehicleMakerBuilding ataked, int g) {
        ataked.restlife(g);
    }

}
