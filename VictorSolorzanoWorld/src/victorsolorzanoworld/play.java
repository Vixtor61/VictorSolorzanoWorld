/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;


import edificios.EDChoser;
import edificios.choseEd;
import edificios.edificio;
import edificios.rtype;
import edificios.troopmaker;
import edificios.vehiclemaker;
import razas.JOOS;
import razas.NIG;
import tropas.tropa;

/**
 *
 * @author victor
 */
public class play {
 private int fasecounter;
 private int turn;
 private player p = new player();
 private player p2 = new player();
private String current;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

 public void Start(){
     
     racemenu s =  new racemenu();
     
     while(!p.getJ().defeat && !p2.getN().defeat){
         current=p.getJ().getClass().getName();
         s.menu(current,p);
         p.getJ().UPDATE();
         current = p2.getN().getClass().getName();
         
         s.menu(current,p2);
         p2.getN().UPDATE();
     }
 }

    public int getFasecounter() {
        return fasecounter;
    }

    public void setFasecounter(int fasecounter) {
        this.fasecounter = fasecounter;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    

    
 public void atack(JOOS atacker,NIG atacked, int index){
     int a = atacker.getTrop(index).getAtackt();
     atacked.restlife(index, a
     );
    
   
}
 
 public void atack(tropa ataked,int g){
     ataked.restlife(g);
 }
 public void atack(rtype ataked,int g){
     ataked.restlife(g);
 }
 public void atack(troopmaker ataked,int g){
     ataked.restlife(g);
 }
 public void atack(vehiclemaker ataked,int g){
     ataked.restlife(g);
 }   
   

 public void addB(JOOS a){
     EDChoser d = new EDChoser(choseEd.tmaker);
     
     a.tropmakerList.add(d.createTmaker());
 }
 public void addB(NIG a){
     EDChoser d = new EDChoser(choseEd.tmaker);
     
     a.tropmakerList.add(d.createTmaker());
 }
}
