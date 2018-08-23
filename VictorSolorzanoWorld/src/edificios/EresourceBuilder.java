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
abstract class EresourceBuilder {

    protected ResourceBuilding r;

    public ResourceBuilding getTropa() {
        return r;
    }

    public void createNewRtypeProduct() {
        r = new ResourceBuilding();
    }

    public abstract void buildrace();

    public abstract void buildtype();

    public abstract void buildvida();

    public abstract void buildFASESB();

    public abstract void buildR();

    public abstract void buildCost();

}

/* "ConcreteBuilder" */
class rtype1 extends EresourceBuilder {

    @Override
    public void buildrace() {
        r.race("JOO");

        System.out.print("THE JOO SAYS MONEY \n");
    }

    @Override
    public void buildtype() {
        r.setType("rtype1");
        System.out.print("DFDFDFD");
    }

    @Override
    public void buildvida() {
        r.vida(45);
    }

    @Override
    public void buildR() {
        r.setResourceP(45);
    }

    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

class rtype2 extends EresourceBuilder {

    @Override
    public void buildrace() {
        r.race("JOO");
        System.out.print("THE JOO SAYS MONEY \n");

    }

    @Override
    public void buildtype() {
        r.setType("rtype2");
    }

    @Override
    public void buildvida() {
        r.vida(45);
    }

    @Override
    public void buildR() {
        r.setResourceP(45);
    }

    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

class rtype3 extends EresourceBuilder {

    @Override
    public void buildrace() {
        r.race("JOO");
        System.out.print("THE JOO SAYS MONEY \n");
    }

    @Override
    public void buildtype() {
        r.setType("rtype3");
    }

    @Override
    public void buildvida() {
        r.vida(45);
    }

    @Override
    public void buildR() {
        r.setResourceP(45);
    }

    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

class rtype4 extends EresourceBuilder {

    @Override
    public void buildrace() {
        r.race("NIG");
        System.out.print("THE NIG SAY OGHA BOOGA \n");
    }

    @Override
    public void buildtype() {
        r.setType("rtype4");
    }

    @Override
    public void buildvida() {
        r.vida(120);
    }

    @Override
    public void buildR() {
        r.setResourceP(46);
    }

    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

class rtype5 extends EresourceBuilder {

    @Override
    public void buildrace() {
        r.race("NIG");
        System.out.print("THE NIG SAYS GOHA \n");
    }

    @Override
    public void buildtype() {
        r.setType("rtype5");
    }

    @Override
    public void buildvida() {
        r.vida(165);
    }

    @Override
    public void buildR() {
        r.setResourceP(36);
    }

    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

class rtype6 extends EresourceBuilder {

    @Override
    public void buildrace() {
        r.race("NIG");

        System.out.print("THE NIG SAYS OGHA BOOga \n");
    }

    @Override
    public void buildtype() {
        r.setType("rtype6");
    }

    @Override
    public void buildvida() {
        r.vida(1000);
    }

    @Override
    public void buildR() {
        r.setResourceP(2);
    }

    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }

    @Override
    public void buildCost() {
        r.setCost(100);
    }

}

/* "Director" */
class Rtypemaker {

    private EresourceBuilder rtypebuilder;

    public void setTroopBuilder(EresourceBuilder pb) {
        rtypebuilder = pb;
    }

    public ResourceBuilding getTropa() {
        return rtypebuilder.getTropa();
    }

    public void constructTRooP() {
        rtypebuilder.createNewRtypeProduct();
        rtypebuilder.buildvida();
        rtypebuilder.buildrace();
        rtypebuilder.buildtype();
        rtypebuilder.buildR();
        rtypebuilder.buildFASESB();
        rtypebuilder.buildCost();
    }
}
