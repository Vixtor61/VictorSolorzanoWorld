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
public player(){
j = new JOOS();
     n = new NIG();
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

}

