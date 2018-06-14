/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

/**
 *
 * @author victor
 */

public class edificio{
    private int vida = 0;
    private String race = "";
    private String type= "";
    private int fasesTOBUILD=0;
    private int FasestoBuildA=0;
    private boolean building = true;
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isBuilding() {
        return building;
    }

    public void setBuilding(boolean building) {
        this.building = building;
    }
    

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getFasesTOBUILD() {
        return fasesTOBUILD;
    }

    public void setFasesTOBUILD(int fasesTOBUILD) {
        this.fasesTOBUILD = fasesTOBUILD;
    }

    public int getFasestoBuildA() {
        return FasestoBuildA;
    }

    public void setFasestoBuildA(int FasestoBuildA) {
        this.FasestoBuildA = FasestoBuildA;
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

    public String getrace(){
        return race;
    }

    public int getVida() {
        return vida;
    }

    public String getType() {
        return type;
    }
    public void restlife(int rest){
        vida = vida-rest;
                
    }
    public void UPDATE(){
        this.FasestoBuildA = this.FasestoBuildA+1;
        if(this.FasestoBuildA >= this.fasesTOBUILD){
            this.setBuilding(false);
        }
    }

    
}
