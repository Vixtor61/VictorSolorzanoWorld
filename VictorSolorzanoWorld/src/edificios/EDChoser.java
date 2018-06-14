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
public class EDChoser {

    choseEd type;
    Rtypemaker trainer = new Rtypemaker();
    Ttypemaker trainer1 = new Ttypemaker();

    public EDChoser(choseEd type) {
        this.type = type;
    }

    public rtype createtropp() {
        switch (type) {
            case rtype1:
                Eresource_Builder NIGer = new rtype1();
                trainer.setTroopBuilder(NIGer);
                trainer.constructTRooP();

                rtype nig = trainer.getTropa();
                return nig;

            case rtype2:
                Eresource_Builder JOOer = new rtype2();
                trainer.setTroopBuilder(JOOer);

                trainer.constructTRooP();

                rtype joo = trainer.getTropa();
                return joo;
                
            case rtype3:
                Eresource_Builder JOOe = new rtype3();
                trainer.setTroopBuilder(JOOe);

                trainer.constructTRooP();

                rtype joo1 = trainer.getTropa();
                return joo1;
             case rtype4:
                Eresource_Builder JOO4 = new rtype4();
                trainer.setTroopBuilder(JOO4);

                trainer.constructTRooP();

                rtype joo4 = trainer.getTropa();
                return joo4;
            case rtype5:
                Eresource_Builder JOO5 = new rtype5();
                trainer.setTroopBuilder(JOO5);

                trainer.constructTRooP();

                rtype joo5 = trainer.getTropa();
                return joo5;
            case rtype6:
                Eresource_Builder JOO6 = new rtype6();
                trainer.setTroopBuilder(JOO6);

                trainer.constructTRooP();

                rtype joo6 = trainer.getTropa();
                return joo6;

            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
    }

    public troopmaker createTmaker() {
        switch (type) {
            case tmaker:
                Tmaker_Builder JOOSS= new tmaker1();
                trainer1.setTroopBuilder(JOOSS);
                trainer1.constructTRooP();
                
                troopmaker joel = trainer1.getTropa();
                System.out.print("LOOOOOOOOOOOOOL");
                return joel;
            case tmaker2:
                Tmaker_Builder NIGer = new tmaker2();
                trainer1.setTroopBuilder(NIGer);
                trainer1.constructTRooP();

                troopmaker nig = trainer1.getTropa();
                return nig;    
         

            default:
                System.out.println("OII m8 there are no troops with that name");
                break;
        }
        return null;
    }
}
