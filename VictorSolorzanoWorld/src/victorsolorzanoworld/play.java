/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorsolorzanoworld;


import edificios.EDChoser;
import edificios.choseEd;
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
 
private String current;

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

 public void Start(){
    player p= new player(1);
    player p2= new player(2);
     racemenu s =  new racemenu();
     
     while(!p.isDefeat() && !p2.isDefeat()){
         
         s.menu(p.getRace(),p,p2);
         p.update(p2);
         System.out.print("TURN P1 ENDED\n");
         
         s.menu(p2.getRace(),p2,p);
         p2.update(p);
         System.out.print("TURN p2 ENDED\n");
         System.out.print("FASE ENDED\n");
         this.fasecounter++;
     }
     
     System.out.print("GAME ENDED\n");
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
