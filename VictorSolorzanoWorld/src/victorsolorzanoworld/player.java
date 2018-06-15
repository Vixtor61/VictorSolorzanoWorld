/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;

import razas.JOOS;
import razas.NIG;
import razas.RACE;
import razas.menuchooseR;

/**
 *
 * @author victor
 */
public class player {
    private JOOS j = null;
private NIG n = null;
private String race;
private RACE r;
private boolean defeat= false;

    public player() {
    menuchooseR ra =new menuchooseR();
    r =ra.chooseRace();
    
    }

    public RACE getR() {
        return r;
    }

    public void setR(RACE r) {
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
        
            this.r.UPDATE(this);
            this.r.updateTropstatus(enemi);
            if(r.defeat){
                System.out.print("gg");
                this.setDefeat(true);
            }
        
        
        
        
    }

}

