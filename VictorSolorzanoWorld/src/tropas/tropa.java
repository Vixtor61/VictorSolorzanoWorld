/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tropas;

import edificios.rtype;
import edificios.troopmaker;

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
    private int Tconstruccion;
    private int TconstruccionA=0;
    private int tAtacke;
    private boolean beingAtaked = false;
    int atacking;
    private troopmaker atackingt = null;
    private rtype Atacking = null;
    private tropa AtackingT = null;

    public int getAtacking() {
        return atacking;
    }

    public void setAtacking(int atacking) {
        this.atacking = atacking;
    }
    
    public void updateTraining(){
        this.TconstruccionA = this.TconstruccionA+1;
        if(this.TconstruccionA >= this.Tconstruccion){
            this.setIsA(true);
        }
    }

    public int getTconstruccionA() {
        return TconstruccionA;
    }

    public void setTconstruccionA(int TconstruccionA) {
        this.TconstruccionA = TconstruccionA;
    }
    
    public int getTconstruccion() {
        return Tconstruccion;
    }

    public void setTconstruccion(int Tconstruccion) {
        this.Tconstruccion = Tconstruccion;
    }

    public int gettAtacke() {
        return tAtacke;
    }

    public void settAtacke(int tAtacke) {
        this.tAtacke = tAtacke;
    }
    
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
    public abstract void buildTconst();
   
}

/* "ConcreteBuilder" */
class JOOBuilder extends troopBuilder {
    
    @Override
    public void buildrace() {
        tropa.race("JOO ");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    @Override
    public void buildtype() {
        tropa.type("especial");
    }

    @Override
    public void buildvida() {
        tropa.vida(45);
    }
    @Override
    public void buildattack() {
        tropa.attack(4);
    }

   
    @Override
    public void buildstatus() {
        tropa.setIsA(false);
    }

    @Override
    public void buildTconst() {
       
        tropa.setTconstruccion(3);    
    }
}

/* "ConcreteBuilder" */
class NIGBuilder extends troopBuilder {
    
    @Override
    public void buildrace() {
        tropa.race("NIG ");
        System.out.print("THE NIG SAYS ASHHHH \n");
    }

    @Override
    public void buildtype() {
        tropa.type("especial");
    }

    @Override
    public void buildvida() {
        tropa.vida(15);
    }
    @Override
    public void buildattack() {
        tropa.attack(3);
    }
    
    @Override
    public void buildstatus() {
        tropa.setIsA(false);
    }
    @Override
    public void buildTconst() {
       
tropa.setTconstruccion(2);    
    }
}
class NIGarmy extends troopBuilder {
    
    @Override
    public void buildrace() {
        tropa.race("NIG");
        System.out.print("THE NIG SAYS ASHHHH \n");
    }

    @Override
    public void buildtype() {
        tropa.type("army");
    }

    @Override
    public void buildvida() {
        tropa.vida(11);
    }
    @Override
    public void buildattack() {
        tropa.attack(3);
    }
    
    @Override
    public void buildstatus() {
        tropa.setIsA(false);
    }
    @Override
    public void buildTconst() {
       
tropa.setTconstruccion(2);    
    }
}
class JOOSarmy extends troopBuilder {
    
    @Override
    public void buildrace() {
        tropa.race("JOO");
        System.out.print("THE JOO SAYS Money \n");
    }

    @Override
    public void buildtype() {
        tropa.type("army");
    }

    @Override
    public void buildvida() {
        tropa.vida(17);
    }
    @Override
    public void buildattack() {
        tropa.attack(2);
    }
 
    @Override
    public void buildstatus() {
        tropa.setIsA(false);
    }
    @Override
    public void buildTconst() {
       
tropa.setTconstruccion(2);    
    }
}
class JOOSvehicle extends troopBuilder {
    
    @Override
    public void buildrace() {
        tropa.race("JOO");
        System.out.print("THE JOO SAYS Money \n");
    }

    @Override
    public void buildtype() {
        tropa.type("vehicle");
    }

    @Override
    public void buildvida() {
        tropa.vida(300);
    }
    @Override
    public void buildattack() {
        tropa.attack(2);
    }
 
    @Override
    public void buildstatus() {
        tropa.setIsA(false);
    }
    @Override
    public void buildTconst() {
       
tropa.setTconstruccion(2);    
    }
}
class NIGvehicle extends troopBuilder {
    
    @Override
    public void buildrace() {
        tropa.race("NIg");
        System.out.print("THE JOO SAYS Money \n");
    }

    @Override
    public void buildtype() {
        tropa.type("vehicle");
    }

    @Override
    public void buildvida() {
        tropa.vida(250);
    }
    @Override
    public void buildattack() {
        tropa.attack(2);
    }
 
    @Override
    public void buildstatus() {
        tropa.setIsA(false);
    }
    @Override
    public void buildTconst() {
       
tropa.setTconstruccion(2);    
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
        troopBuilder.buildTconst();
    }
}
