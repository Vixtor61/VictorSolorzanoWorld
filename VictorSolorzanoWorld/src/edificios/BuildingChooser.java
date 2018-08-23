/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

/**
 *
 * @author UCA
 */
public class BuildingChooser {

    ChooseBuilding type;
    Rtypemaker trainer = new Rtypemaker();
    Ttypemaker trainer1 = new Ttypemaker();

    public BuildingChooser(ChooseBuilding type) {
        this.type = type;
    }

    public ResourceBuilding createtropp() {
        switch (type) {
            case rtype1:
                EresourceBuilder NIGer = new rtype1();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                ResourceBuilding nig = trainer.getTropa();
                return nig;

            case rtype2:
                EresourceBuilder JOOer = new rtype2();
                trainer.setTroopBuilder(JOOer);

                trainer.constructTRooP();

                ResourceBuilding joo = trainer.getTropa();
                return joo;

            case rtype3:
                EresourceBuilder JOOe = new rtype3();
                trainer.setTroopBuilder(JOOe);

                trainer.constructTRooP();

                ResourceBuilding joo1 = trainer.getTropa();
                return joo1;
            case rtype4:
                EresourceBuilder JOO4 = new rtype4();
                trainer.setTroopBuilder(JOO4);

                trainer.constructTRooP();

                ResourceBuilding joo4 = trainer.getTropa();
                return joo4;
            case rtype5:
                EresourceBuilder JOO5 = new rtype5();
                trainer.setTroopBuilder(JOO5);

                trainer.constructTRooP();

                ResourceBuilding joo5 = trainer.getTropa();
                return joo5;
            case rtype6:
                EresourceBuilder JOO6 = new rtype6();
                trainer.setTroopBuilder(JOO6);

                trainer.constructTRooP();

                ResourceBuilding joo6 = trainer.getTropa();
                return joo6;

            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
    }

    public TroopMakerBuilding createTmaker() {
        switch (type) {
            case tmaker:
                TmakerBuilder JOOSS = new tmaker1();
                trainer1.setTroopBuilder(JOOSS);
                trainer1.constructTRooP();

                TroopMakerBuilding joel = trainer1.getTropa();
                return joel;
            case tmaker2:
                TmakerBuilder NIGer = new tmaker2();
                trainer1.setTroopBuilder(NIGer);
                trainer1.constructTRooP();

                TroopMakerBuilding nig = trainer1.getTropa();
                return nig;

            default:
                System.out.println("OII m8 there are no Buildings with that name");
                break;
        }
        return null;
    }
}
