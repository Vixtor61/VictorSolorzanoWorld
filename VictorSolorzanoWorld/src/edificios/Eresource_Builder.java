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

abstract class Eresource_Builder {
    protected rtype r;

    public rtype getTropa() {
        return r;
    }

    public void createNewRtypeProduct() {
        r = new rtype();
    }

    public abstract void buildrace();
    public abstract void buildtype();
    public abstract void buildvida();
    public abstract void buildFASESB();
    public abstract void buildR();
    

}

/* "ConcreteBuilder" */
class rtype1 extends Eresource_Builder{
    
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
    public void buildR() {
        r.setResourceP(45);
    }

    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }
    
}

class rtype2 extends Eresource_Builder{
    
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
    public void buildR() {
        r.setResourceP(45);
    }
    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }
    
    
}
class rtype3 extends Eresource_Builder{
    
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
    public void buildR() {
        r.setResourceP(45);
    }
    @Override
    public void buildFASESB() {
        r.setFasesTOBUILD(2);
    }
    
    
}
class rtype4 extends Eresource_Builder{
    
    @Override
    public void buildrace() {
        r.race("NIG");
        System.out.print("THE NIG SAY OGHA BOOGA \n");
    }

    @Override
    public void buildtype() {
        r.type("especial");
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
    
    
}
class rtype5 extends Eresource_Builder{
    
    @Override
    public void buildrace() {
        r.race("NIG");
        System.out.print("THE NIG SAYS GOHA \n");
    }

    @Override
    public void buildtype() {
        r.type("especial");
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
    
    
    
}
class rtype6 extends Eresource_Builder{
    
    @Override
    public void buildrace() {
        r.race("NIG");
        System.out.print("THE NIG SAYS OGHA BOOga \n");
    }

    @Override
    public void buildtype() {
        r.type("especial");
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
    
    
}




/* "Director" */
class Rtypemaker {
    private Eresource_Builder rtypebuilder;

    public void setTroopBuilder(Eresource_Builder pb) {
        rtypebuilder = pb;
    }

    public rtype getTropa() {
        return rtypebuilder.getTropa();
    }

    public void constructTRooP() {
        rtypebuilder.createNewRtypeProduct();
        rtypebuilder.buildvida();
        rtypebuilder.buildrace();
        rtypebuilder.buildtype();
        rtypebuilder.buildR();
       rtypebuilder.buildFASESB();
    }
}
