/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

/**
 *
 * @author UCA
 */
public class ResourceBuilding extends Building {

    int resourceP = 0;
    String type = "";
    int fases = 0;
    int fasesactual = 0;
    private int rActual = 0;
    private int resourcepmax = 500;
    private boolean collect = true;

    int RTOTAL;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getResourceP() {
        return resourceP;
    }

    public void setResourceP(int resourceP) {
        this.resourceP = resourceP;
    }

    public void makeresource() {
        if (this.fasesactual == this.fases) {
            RTOTAL = RTOTAL + resourceP;
        } else {
            System.out.print("SORRY pero faltan " + (this.fases - this.fasesactual) + " fases para poder recolectar");
        }

    }

    public int make() {
        int a = this.rActual;
        if (collect == true) {
            collect = false;
            this.rActual = 0;
            return a;
        }
        System.out.print("you already collected this turn");
        return 0;
    }

    public void update() {
        if (this.rActual + this.resourceP <= this.resourcepmax) {
            this.rActual = this.rActual + this.resourceP;
        }
        this.collect = true;
    }
}
