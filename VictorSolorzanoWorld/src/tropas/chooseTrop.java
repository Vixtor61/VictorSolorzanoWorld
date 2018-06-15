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
import tropas.chose;
import tropas.training;

public class chooseTrop {
    chose type;
training trainer = new training();
    public chooseTrop(chose type) {
        this.type = type;
    }
    
    public tropa createtropp() {
        switch (type) {
            case NIGespecial:
                troopBuilder NIGer = new NIGBuilder();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                tropa nig = trainer.getTropa();
                return nig;
                
                    
            case JOOespecial:
                troopBuilder JOOer = new JOOBuilder();
                trainer.setTroopBuilder(JOOer);
                
                trainer.constructTRooP();

                tropa joo = trainer.getTropa();
                return joo;
             
            case JOOarmy:
                troopBuilder JOOar = new JOOSarmy();
                trainer.setTroopBuilder(JOOar);
                
                trainer.constructTRooP();

                tropa joos = trainer.getTropa();
                return joos;            
            case NIGarmy:
                troopBuilder NIGar = new NIGarmy();
                trainer.setTroopBuilder(NIGar);
                
                trainer.constructTRooP();

                tropa niga = trainer.getTropa();
                return niga;
            case NIGvehicle:
                troopBuilder NIGars = new NIGvehicle();
                trainer.setTroopBuilder(NIGars);
                
                trainer.constructTRooP();

                tropa nigass = trainer.getTropa();
                return nigass;
            case JOOSvehicle:
                troopBuilder jjj = new JOOSvehicle();
                trainer.setTroopBuilder(jjj);
                
                trainer.constructTRooP();

                tropa jj = trainer.getTropa();
                return jj;
                
                
                
                        
            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
}
   }
