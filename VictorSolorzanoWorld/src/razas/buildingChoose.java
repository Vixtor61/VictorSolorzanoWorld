/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;


import edificios.EDChoser;
import edificios.choseEd;
import edificios.rtype;
import edificios.troopmaker;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class buildingChoose {

    public void chosea(JOOS a){
        int  p;
        Scanner ax = new Scanner(System.in);
        System.out.print("1- new troopmaker \n");
        System.out.print("2- new rtype1 \n");
        System.out.print("3- new rtype2 \n");
        System.out.print("4- new rtype3 \n");
        System.out.print("5 -volver\n");
        p=ax.nextInt();
        
        switch(p){
        case 1:
            EDChoser tmaker = new EDChoser(choseEd.tmaker);
            troopmaker t= tmaker.createTmaker();
            if(a.getResources()>=t.getCost()){
                a.setResources(a.getResources()-t.getCost());
                a.tropmakerList.add(t);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            
            break;
        case 2:
            EDChoser rtype1 = new EDChoser(choseEd.rtype1);
            rtype r1 = rtype1.createtropp();
            if(a.getResources()>=r1.getCost()){
                a.setResources(a.getResources()-r1.getCost());
                a.rtypeList.add(r1);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            break;
        case 3:
            EDChoser rtype2 = new EDChoser(choseEd.rtype2);
     
            rtype r2 = rtype2.createtropp();
            if(a.getResources()>=r2.getCost()){
                a.setResources(a.getResources()-r2.getCost());
                a.rtypeList.add(r2);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            break;
        case 4:
            EDChoser rtype3 = new EDChoser(choseEd.rtype3);
     
            rtype r3 = rtype3.createtropp();
            if(a.getResources()>=r3.getCost()){
                a.setResources(a.getResources()-r3.getCost());
                a.rtypeList.add(r3);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            break;
       
        default:
            System.out.print("not valid\n");
            break;
                  
                        
                        
    } 
}
    public void chosea(NIG a){
        int  p;
        Scanner ax = new Scanner(System.in);
        System.out.print("1- new troopmaker2 \n");
        System.out.print("2- new rtype4 \n");
        System.out.print("3- new rtype5 \n");
        System.out.print("4- new rtype6 \n");
        
        p=ax.nextInt();
        
        switch(p){
        case 1:
            EDChoser tmaker = new EDChoser(choseEd.tmaker2);
            troopmaker t= tmaker.createTmaker();
            if(a.getResources()>=t.getCost()){
                a.setResources(a.getResources()-t.getCost());
                a.tropmakerList.add(t);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            
            break;
        case 2:
            EDChoser rtype1 = new EDChoser(choseEd.rtype4);
            rtype r1 = rtype1.createtropp();
            if(a.getResources()>=r1.getCost()){
                a.setResources(a.getResources()-r1.getCost());
                a.rtypeList.add(r1);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            break;
        case 3:
            EDChoser rtype2 = new EDChoser(choseEd.rtype5);
     
            rtype r2 = rtype2.createtropp();
            if(a.getResources()>=r2.getCost()){
                a.setResources(a.getResources()-r2.getCost());
                a.rtypeList.add(r2);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            break;
        case 4:
            EDChoser rtype3 = new EDChoser(choseEd.rtype6);
     
            rtype r3 = rtype3.createtropp();
            if(a.getResources()>=r3.getCost()){
                a.setResources(a.getResources()-r3.getCost());
                a.rtypeList.add(r3);   
            }
            else{
                System.out.print("sorry m8 u need moar "+a.getRtype1name()+"\n");
            }
            break;
        
        default:
            System.out.print("not valid\n");
            break;
                  
                        
                        
    } 
}
    
}
