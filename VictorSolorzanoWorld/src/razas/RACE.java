/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

import edificios.rtype;
import edificios.troopmaker;
import java.util.ArrayList;
import java.util.Scanner;
import tropas.tropa;
import victorsolorzanoworld.player;

/**
 *
 * @author victor
 */
public class RACE {
    private String rtype1name;
    private String rtype2name;
    private String rtype3name;
    private int resources1;
    private int resources2;
    private int resources3;
    private int live;
    public boolean defeat = false;
    public ArrayList<tropa> TropList = new ArrayList<tropa>();
    public ArrayList<rtype> rtypeList = new ArrayList<rtype>();
    public ArrayList<troopmaker> tropmakerList = new ArrayList<troopmaker>();

    public String getRtype1name() {
        return rtype1name;
    }

    public void setRtype1name(String rtype1name) {
        this.rtype1name = rtype1name;
    }

    public String getRtype2name() {
        return rtype2name;
    }

    public void setRtype2name(String rtype2name) {
        this.rtype2name = rtype2name;
    }

    public String getRtype3name() {
        return rtype3name;
    }

    public void setRtype3name(String rtype3name) {
        this.rtype3name = rtype3name;
       
    }
    
    public int getResources() {
        return resources1;
    }

    public void setResources(int resources) {
        this.resources1 = resources;
    }

    public int getLive() {
        return live;
    }

    public int getResources2() {
        return resources2;
    }

    public void setResources2(int resources2) {
        this.resources2 = resources2;
    }

    public int getResources3() {
        return resources3;
    }

    public void setResources3(int resources3) {
        this.resources3 = resources3;
    }

    public void setLive(int live) {
        this.live = live;
    }
    
    public void SHOW(){
        System.out.print("Showing all trops: \n");
        for (tropa TropList : TropList){
            
            System.out.print("trop race:"+TropList.getrace()+" troop type:"+TropList.getType()+ " troop atacck:"+TropList.getAtackt()+" troop life:"+TropList.getVida()+" \n");
            
        
        }
    }
    public void SHOWTMAKER(){
        System.out.print("Showing all tropmakers: \n");
        for (troopmaker TropList : tropmakerList){
            
            System.out.print("tropmaker race:"+TropList.getrace()+" troopmaker type:"+TropList.getType()+" troopmaker life:"+TropList.getVida()+ " Status "+ TropList.isBuilding() +"\n");
            
        
        }
    }
    public void SHOWRTYPES(){
        System.out.print("Showing all rtypes: \n");
        for (rtype rtypeLists : rtypeList){

            System.out.print("rtype race:"+rtypeLists.getrace()+" troopmaker type:"+rtypeLists.getType()+" rtype life:"+rtypeLists.getVida()+ " Status:"+rtypeLists.isBuilding() +"\n");
                
            
            
        
        }
    }
    public troopmaker getTropMaker(int index){
        int aux;
        for (troopmaker tropList : tropmakerList){
            aux = tropmakerList.indexOf(tropList);
           
            
            if(index == aux){
                System.out.print("AHOOOOOOY");
                return tropList;
            }
        
        }
        return null;
    }
    public void UPDATE(player p){
        for (rtype rtypeLists : rtypeList){
            rtypeLists.update();
            rtypeLists.UPDATE();
            
        
        }
        for (troopmaker TropLists : tropmakerList){
            TropLists.UPDATE();
            TropLists.update(p);
            System.out.print("updating");
             TropLists.setFasestoBuildA(TropLists.getFasestoBuildA()+1);
            
               
        
        
        
    }
        
            
        }
    public void useTmakerBuilding(int a,player p ){
        int contA=0;
        for (troopmaker TropLists : tropmakerList){
            if(!TropLists.isBuilding() && contA==a){
                if(p.getRace()=="razas.JOOS"){
                    TropLists.maketroop(p.getJ(), "especial");
                }
                if(p.getRace()=="razas.NIG"){
                    TropLists.maketroop(p.getN(), "especial");
                }
                
                
            }
            else{
                System.out.print("TMAKER NOT AVADIBLE\n");
            }
               contA++;
        
        
        
    }
        
            
        }
        public void useRtypeBuilding(int a,player p ){
        int contA=0;
        for (rtype resourceB : rtypeList){
            if(!resourceB.isBuilding() && contA==a){
                if(p.getRace()=="razas.JOOS"){
                 
                    System.out.print(resourceB.getType()+"  fgfkgjhktghfgkjfdslkfkf");
                    if(resourceB.getType()=="rtype1"){
                        System.out.print("sdgfsdgfd");
                       this.resources1 = this.resources1 + resourceB.make(); 
                    }
                    if(resourceB.getType()=="rtype2"){
                       this.resources2 = this.resources2 + resourceB.make(); 
                    }
                    if(resourceB.getType()=="rtype3"){
                       this.resources3 = this.resources3 + resourceB.make(); 
                    }
                    
                    
                }
                if(p.getRace()=="razas.NIG"){
                    if(resourceB.getType()=="rtype4"){
                       this.resources1 = this.resources1 + resourceB.make(); 
                    }
                    if(resourceB.getType()=="rtype5"){
                       this.resources2 = this.resources2 + resourceB.make(); 
                    }
                    if(resourceB.getType()=="rtype6"){
                       this.resources3 = this.resources3 + resourceB.make(); 
                    }}
                
                
            }
            else{
                System.out.print("TMAKER NOT AVADIBLE\n");
            }
               contA++;
        
        
        
    }
    }
    public void restlife(int index,int rest){
        int aux;
        int aux2;
        for (tropa tropList : TropList){
            aux = TropList.indexOf(tropList);
            
           
            if(index == aux){
                
                aux2 = tropList.getVida();
                
                tropList.vida(aux2 - rest);
                System.out.print(this.getClass().getName() + " "+ rest + " of life left \n");
            }
        
        }
    }
       
        public tropa getTrop(int index){
        int aux;
        for (tropa tropList : TropList){
            aux = TropList.indexOf(tropList);
           
            System.out.print(tropList.getrace()+" troop type:"+tropList.getType()+ " troop atacck:"+tropList.getAtackt()+" troop life:"+tropList.getVida()+" ");
            if(index == aux){
                return tropList;
            }
        
        }
        return null;
    }
        
    public void ShowResource(){
        System.out.print(this.rtype1name+": "+this.resources1+"\n");
        System.out.print(this.rtype2name+": "+this.resources2+"\n");
        System.out.print(this.rtype3name+": "+this.resources3+"\n");
    }
        
        
        
    }
    
    

