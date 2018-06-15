/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

/**
 *
 * @author victor
 */
public class racechoser {

    chooserace type;
    racemaker trainer = new racemaker();
    
    public racechoser(chooserace type) {
        this.type = type;
    }

    public RACE createrace() {
        switch (type) {
            case VAMPIRES:
                raceBuilder NIGer = new VAMPIRO();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                RACE nig = trainer.getTropa();
                return nig;

            case OGROS:
                raceBuilder JOOer = new OGRO();
                trainer.setTroopBuilder(JOOer);

                trainer.constructTRooP();

                RACE joo = trainer.getTropa();
                return joo;
                
            case SPACECATS:
                raceBuilder JOOe = new CAT();
                trainer.setTroopBuilder(JOOe);

                trainer.constructTRooP();

                RACE joo1 = trainer.getTropa();
                return joo1;
             
            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
    }

    
}
