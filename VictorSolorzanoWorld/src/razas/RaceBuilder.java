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
abstract class RaceBuilder {

    protected Race r;

    public Race getTropa() {
        return r;
    }

    public void createNewRtypeProduct() {
        r = new Race();
    }

    public abstract void racename();

    public abstract void rsource1();

    public abstract void rsource2();

    public abstract void rsource3();

    public abstract void rsource1name();

    public abstract void rsource2name();

    public abstract void rsource3name();

}

/* "ConcreteBuilder" */
class VAMPIRO extends RaceBuilder {

    @Override
    public void rsource1() {
        r.setResources(250);

    }

    @Override
    public void rsource2() {
        r.setResources2(150);
    }

    @Override
    public void rsource3() {
        r.setResources3(17);
    }

    @Override
    public void rsource1name() {
        r.setRtype1name("Sheckels");
    }

    @Override
    public void rsource2name() {
        r.setRtype2name("Dollars");
    }

    @Override
    public void rsource3name() {
        r.setRtype3name("metal");
    }

    @Override
    public void racename() {
        r.setRacename("VAMPIRES");
    }

}

class OGRO extends RaceBuilder {

    @Override
    public void rsource1() {
        r.setResources(230);

    }

    @Override
    public void rsource2() {
        r.setResources2(160);
    }

    @Override
    public void rsource3() {
        r.setResources3(15);
    }

    @Override
    public void rsource1name() {
        r.setRtype1name("GOLD");
    }

    @Override
    public void rsource2name() {
        r.setRtype2name("SILVER");
    }

    @Override
    public void rsource3name() {
        r.setRtype3name("WOOOD");
    }

    @Override
    public void racename() {
        r.setRacename("OGROS");
    }

}

class CAT extends RaceBuilder {

    @Override
    public void rsource1() {
        r.setResources(500);

    }

    @Override
    public void rsource2() {
        r.setResources2(500);
    }

    @Override
    public void rsource3() {
        r.setResources3(500);
    }

    @Override
    public void rsource1name() {
        r.setRtype1name("UNIVERSE");
    }

    @Override
    public void rsource2name() {
        r.setRtype2name("CATNIPS");
    }

    @Override
    public void rsource3name() {
        r.setRtype3name("STALINIUM");
    }

    @Override
    public void racename() {
        r.setRacename("SPACECATS");
    }

}

/* "Director" */
class racemaker {

    private RaceBuilder raceebuilder;

    public void setTroopBuilder(RaceBuilder pb) {
        raceebuilder = pb;
    }

    public Race getTropa() {
        return raceebuilder.getTropa();
    }

    public void constructTRooP() {
        raceebuilder.createNewRtypeProduct();
        raceebuilder.racename();
        raceebuilder.rsource1();
        raceebuilder.rsource2();
        raceebuilder.rsource3();
        raceebuilder.rsource1name();
        raceebuilder.rsource2name();
        raceebuilder.rsource3name();

    }
}
