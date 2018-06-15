/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

import java.util.ArrayList;
import razas.JOOS;
import razas.NIG;
import razas.RACE;
import tropas.chooseTrop;
import tropas.chose;
import tropas.tropa;
import victorsolorzanoworld.player;


/**
 *
 * @author UCA
 */
public class troopmaker extends edificio {
    int fasesactual = 0;
    int fases=0;
    private int troopMax = 5;
    private ArrayList<tropa>  making= new ArrayList<tropa>();
    boolean isMaking;
    public void maketroop(RACE JO,String Type){
        if(Type == "especial"){
            chooseTrop f= new chooseTrop(chose.JOOespecial);
            this.making.add(f.createtropp());
            }
     
            
                    if(Type == "army"){
              chooseTrop f= new chooseTrop(chose.JOOarmy);
        this.making.add(f.createtropp());
        }
        if(Type == "vehicle"){
              chooseTrop f= new chooseTrop(chose.JOOSvehicle);
        this.making.add(f.createtropp());
        }
    }
   
    public void update(player p){
        int cont=0;
        int[] arrayIndex;
        int contE=0;
                
        arrayIndex = new int[troopMax];
        for(tropa tactual:making){
            tactual.updateTraining();
        }
        for(tropa tactual:making){
            if(tactual.isIsA()){
               // System.out.print("fdfdfdfdfdfDFDFDFDFD");
                     
                    p.getR().TropList.add(tactual);
                    
                
              
                
                arrayIndex[contE]=cont;
                contE++;
            }
            cont++;
        }
        for(int i=0;i<contE;i++ ){
            
            making.remove(arrayIndex[i]);
        }
    }
    
}
