/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;


import edificios.EDChoser;
import edificios.choseEd;
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
            a.tropmakerList.add(t);
            break;
        case 2:
            EDChoser rtype1 = new EDChoser(choseEd.rtype1);
     
            a.tropmakerList.add(rtype1.createTmaker());
            
            break;
        case 3:
            EDChoser rtype2 = new EDChoser(choseEd.rtype2);
     
            a.tropmakerList.add(rtype2.createTmaker());
            break;
        case 4:
            EDChoser rtype3 = new EDChoser(choseEd.rtype3);
     
            a.tropmakerList.add(rtype3.createTmaker());
            break;
        case 5:
            break;
        default:
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
     
            a.tropmakerList.add(tmaker.createTmaker());
            
            break;
        case 2:
            EDChoser rtype1 = new EDChoser(choseEd.rtype4);
     
            a.tropmakerList.add(rtype1.createTmaker());
            
            break;
        case 3:
            EDChoser rtype2 = new EDChoser(choseEd.rtype5);
     
            a.tropmakerList.add(rtype2.createTmaker());
            break;
        case 4:
            EDChoser rtype3 = new EDChoser(choseEd.rtype6);
     
            a.tropmakerList.add(rtype3.createTmaker());
            break;
        default:
            break;
                  
                        
                        
    } 
}
    
}
