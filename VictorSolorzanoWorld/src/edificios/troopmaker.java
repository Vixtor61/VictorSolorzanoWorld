/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

import java.util.ArrayList;
import razas.JOOS;
import razas.NIG;
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
    public void maketroop(JOOS JO,String Type){
        if(Type == "especial"){
            chooseTrop f= new chooseTrop(chose.JOOespecial);
            this.making.add(f.createtropp());
            }
        if(Type == "army"){
            /*
            chooseTrop f= new chooseTrop(chose.JOOarmy);
        JO.TropList.add(f.createtropp());
*/        
}
        
    }
    public void maketroop(NIG nig,String Type){
        if(Type == "especial"){
              chooseTrop f= new chooseTrop(chose.NIGespecial);
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
                        if(this.getrace()=="JOO"){
                    p.getJ().TropList.add(tactual);
                    
                }
                if(this.getrace()=="NIG"){
                    p.getN().TropList.add(tactual);
                }
                
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
