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
public class RaceChooser {

    ChooseRace type;
    racemaker trainer = new racemaker();

    public RaceChooser(ChooseRace type) {
        this.type = type;
    }

    public Race createrace() {
        switch (type) {
            case VAMPIRES:
                RaceBuilder NIGer = new VAMPIRO();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                Race nig = trainer.getTropa();
                return nig;

            case OGROS:
                RaceBuilder JOOer = new OGRO();
                trainer.setTroopBuilder(JOOer);

                trainer.constructTRooP();

                Race joo = trainer.getTropa();
                return joo;

            case SPACECATS:
                RaceBuilder JOOe = new CAT();
                trainer.setTroopBuilder(JOOe);

                trainer.constructTRooP();

                Race joo1 = trainer.getTropa();
                return joo1;

            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
    }

}
