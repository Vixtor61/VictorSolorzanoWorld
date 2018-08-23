/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;

import razas.Race;
import razas.SelectRaceMenu;

/**
 *
 * @author victor
 */
public class Player {

    private String race;
    private Race r;
    private boolean defeat = false;

    public Player() {
        SelectRaceMenu ra = new SelectRaceMenu();
        r = ra.chooseRace();

    }

    public Race getR() {
        return r;
    }

    public void setR(Race r) {
        this.r = r;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isDefeat() {
        return defeat;
    }

    public void setDefeat(boolean defeat) {
        this.defeat = defeat;
    }

    public void update(Player enemi) {

        this.r.UPDATE(this);
        this.r.updateTropstatus(enemi);
        if (r.defeat) {
            System.out.print("gg");
            this.setDefeat(true);
        }

    }

}
