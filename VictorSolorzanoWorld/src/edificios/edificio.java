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
    

    
}
