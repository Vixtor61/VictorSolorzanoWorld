/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;

import razas.JOOS;
import razas.NIG;

/**
 *
 * @author victor
 */
public class player {
    private JOOS j = null;
private NIG n = null;
private String race;
private boolean defeat= false;

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

    public player(int a) {
        
        
        switch(a){
            case 1:
                j = new JOOS();
                race = j.getClass().getName();
                break;
            case 2:
                n = new NIG();
                race = n.getClass().getName();
                break;
            default:
                System.out.print("not valid\n");
        }
    }


    public JOOS getJ() {
        return j;
    }

    public void setJ(JOOS j) {
        this.j = j;
    }

    public NIG getN() {
        return n;
    }


    public void setN(NIG n) {
        this.n = n;
    }
    public void update(player enemi){
        if(race.equals("razas.JOOS")){
            this.j.UPDATE(this);
            this.j.updateTropstatus(enemi);
            if(j.defeat){
                System.out.print("gg");
                this.setDefeat(true);
            }
        }
        if(race.equals("razas.NIG")){
            this.n.UPDATE(this);
            this.n.updateTropstatus(enemi);
            if(n.defeat){
                this.setDefeat(true);
            }
        }
        
        
        
    }

}

