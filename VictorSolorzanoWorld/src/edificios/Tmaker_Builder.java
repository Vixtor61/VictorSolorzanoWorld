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

abstract class Tmaker_Builder {
    protected troopmaker r;

    public troopmaker getTropa() {
        return r;
    }

    public void createNewRtypeProduct() {
        r = new troopmaker();
    }

    public abstract void buildrace();
    public abstract void buildtype();
    public abstract void buildvida();
    

}

/* "ConcreteBuilder" */
class tmaker1 extends Tmaker_Builder{
    
    public void buildrace() {
        r.race("JOO");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    public void buildtype() {
        r.type("especial");
    }

    public void buildvida() {
        r.vida(45);
    }
    
    
}

class tmaker2 extends Tmaker_Builder{
    
    public void buildrace() {
        r.race("NIG");
        System.out.print("THE NIG SAYS MONEY \n");
    }

    public void buildtype() {
        r.type("especial");
    }

    public void buildvida() {
        r.vida(45);
    }
    
    
}

/* "Director" */
class Ttypemaker {
    private Tmaker_Builder rtypebuilder;

    public void setTroopBuilder(Tmaker_Builder pb) {
        rtypebuilder = pb;
    }

    public troopmaker getTropa() {
        return rtypebuilder.getTropa();
    }

    public void constructTRooP() {
        rtypebuilder.createNewRtypeProduct();
        rtypebuilder.buildvida();
        rtypebuilder.buildrace();
        rtypebuilder.buildtype();
     
       
    }
}
