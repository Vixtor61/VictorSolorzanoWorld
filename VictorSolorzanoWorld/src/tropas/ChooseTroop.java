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
import tropas.Choose;
import tropas.training;

public class ChooseTroop {

    Choose type;
    training trainer = new training();

    public ChooseTroop(Choose type) {
        this.type = type;
    }

    public Tropa createtropp() {
        switch (type) {
            case NIGespecial:
                troopBuilder NIGer = new NIGBuilder();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                Tropa nig = trainer.getTropa();
                return nig;

            case JOOespecial:
                troopBuilder JOOer = new JOOBuilder();
                trainer.setTroopBuilder(JOOer);

                trainer.constructTRooP();

                Tropa joo = trainer.getTropa();
                return joo;

            case JOOarmy:
                troopBuilder JOOar = new JOOSarmy();
                trainer.setTroopBuilder(JOOar);

                trainer.constructTRooP();

                Tropa joos = trainer.getTropa();
                return joos;
            case NIGarmy:
                troopBuilder NIGar = new NIGarmy();
                trainer.setTroopBuilder(NIGar);

                trainer.constructTRooP();

                Tropa niga = trainer.getTropa();
                return niga;
            case NIGvehicle:
                troopBuilder NIGars = new NIGvehicle();
                trainer.setTroopBuilder(NIGars);

                trainer.constructTRooP();

                Tropa nigass = trainer.getTropa();
                return nigass;
            case JOOSvehicle:
                troopBuilder jjj = new JOOSvehicle();
                trainer.setTroopBuilder(jjj);

                trainer.constructTRooP();

                Tropa jj = trainer.getTropa();
                return jj;

            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
    }
}
