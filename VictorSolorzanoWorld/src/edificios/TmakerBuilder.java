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
abstract class TmakerBuilder {

    protected TroopMakerBuilding r;

    public TroopMakerBuilding getTropa() {
        return r;
    }

    public void createNewRtypeProduct() {
        r = new TroopMakerBuilding();
    }

    public abstract void buildrace();

    public abstract void buildtype();

    public abstract void buildvida();

    public abstract void buildBUILD();

    public abstract void buildCost();

}

/* "ConcreteBuilder" */
class tmaker1 extends TmakerBuilder {

    @Override
    public void buildrace() {
        r.race("JOO");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    @Override
    public void buildtype() {
        r.type("especial");
    }

    @Override
    public void buildvida() {
        r.vida(45);
    }

    @Override
    public void buildBUILD() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

class tmaker2 extends TmakerBuilder {

    @Override
    public void buildrace() {
        r.race("NIG");
        System.out.print("THE NIG SAYS MONEY \n");
    }

    @Override
    public void buildtype() {
        r.type("especial");
    }

    @Override
    public void buildvida() {
        r.vida(45);
    }

    @Override
    public void buildBUILD() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

/* "Director" */
class Ttypemaker {

    private TmakerBuilder rtypebuilder;

    public void setTroopBuilder(TmakerBuilder pb) {
        rtypebuilder = pb;
    }

    public TroopMakerBuilding getTropa() {
        return rtypebuilder.getTropa();
    }

    public void constructTRooP() {
        rtypebuilder.createNewRtypeProduct();
        rtypebuilder.buildvida();
        rtypebuilder.buildrace();
        rtypebuilder.buildtype();
        rtypebuilder.buildBUILD();
        rtypebuilder.buildCost();
    }
}
