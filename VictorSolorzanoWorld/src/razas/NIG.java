/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import tropas.tropa;


/**
 *
 * @author victor
 */
public class NIG extends RACE{
    

    
    
    public tropa getTrop(int index){
        int aux;
        for (tropa tropList : TropList){
            aux = TropList.indexOf(tropList);
           
            System.out.print(tropList.getrace()+" troop type:"+tropList.getType()+ " troop atacck:"+tropList.getAtackt()+" troop life:"+tropList.getVida()+" ");
            if(index == aux){
                return tropList;
            }
        
        }
        return null;
    }
    
}
