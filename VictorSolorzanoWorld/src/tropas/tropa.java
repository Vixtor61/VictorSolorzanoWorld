/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tropas;

/**
 *
 * @author victor
 */
public class tropa{
    private int vida = 0;
    private String race = "";
    private String type= "";
    private int atackt = 0;
    private boolean isA;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isIsA() {
        return isA;
    }

    public void setIsA(boolean isA) {
        this.isA = isA;
    }

    public void vida(int vida) {
        this.vida = vida;
    }

    public void race(String race) {
        this.race = race;
        //System.out.print("adding race");
    }

    public void type(String type) {
        this.type = type;
    }
    public void attack(int attack){
        this.atackt = attack;
    }
    public String getrace(){
        return race;
    }

    public int getVida() {
        return vida;
    }

    public String getType() {
        return type;
    }

    public int getAtackt() {
        
        return atackt;
        
    }
    public void restlife(int rest){
        vida = vida-rest;
                
    }
    
}

/* "Abstract Builder" */
abstract class troopBuilder {
    protected tropa tropa;

    public tropa getTropa() {
        return tropa;
    }

    public void createNewtropaProduct() {
        tropa = new tropa();
    }

    public abstract void buildrace();
    public abstract void buildtype();
    public abstract void buildvida();
    public abstract void buildattack();
    public abstract void buildstatus();
}

/* "ConcreteBuilder" */
class JOOBuilder extends troopBuilder {
    
    public void buildrace() {
        tropa.race("JOO ");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    public void buildtype() {
        tropa.type("especial");
    }

    public void buildvida() {
        tropa.vida(45);
    }
    public void buildattack() {
        tropa.attack(4);
    }

   
    public void buildstatus() {
        tropa.setIsA(false);
    }
}

/* "ConcreteBuilder" */
class NIGBuilder extends troopBuilder {
    
    public void buildrace() {
        tropa.race("NIG ");
        System.out.print("THE NIG SAYS ASHHHH \n");
    }

    public void buildtype() {
        tropa.type("especial");
    }

    public void buildvida() {
        tropa.vida(15);
    }
    public void buildattack() {
        tropa.attack(3);
    }
    
    public void buildstatus() {
        tropa.setIsA(false);
    }
}
class NIGarmy extends troopBuilder {
    
    public void buildrace() {
        tropa.race("NIG");
        System.out.print("THE NIG SAYS ASHHHH \n");
    }

    public void buildtype() {
        tropa.type("army");
    }

    public void buildvida() {
        tropa.vida(11);
    }
    public void buildattack() {
        tropa.attack(3);
    }
    
    public void buildstatus() {
        tropa.setIsA(false);
    }
}
class JOOSarmy extends troopBuilder {
    
    public void buildrace() {
        tropa.race("JOO");
        System.out.print("THE JOO SAYS Money \n");
    }

    public void buildtype() {
        tropa.type("army");
    }

    public void buildvida() {
        tropa.vida(17);
    }
    public void buildattack() {
        tropa.attack(2);
    }
 
    public void buildstatus() {
        tropa.setIsA(false);
    }
}

/* "Director" */
class training {
    private troopBuilder troopBuilder;

    public void setTroopBuilder(troopBuilder pb) {
        troopBuilder = pb;
    }

    public tropa getTropa() {
        return troopBuilder.getTropa();
    }

    public void constructTRooP() {
        troopBuilder.createNewtropaProduct();
        troopBuilder.buildvida();
        troopBuilder.buildrace();
        troopBuilder.buildtype();
        troopBuilder.buildattack();
        troopBuilder.buildstatus();
    }
}
