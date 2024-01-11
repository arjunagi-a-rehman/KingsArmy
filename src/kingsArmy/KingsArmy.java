package kingsArmy;

import kingsArmy.solders.Imp.DefaultSolders;
import kingsArmy.solders.Solders;
import kingsArmy.solders.Weapons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KingsArmy {
    private List<Solders> solders;
    private int arrow=0;
    private int knife=0;
    private int spare =0;
    Scanner sc;
    public KingsArmy(){
        sc=new Scanner(System.in);
        solders=new ArrayList<>();
        populateSolders();
        System.out.println("the kings army consists of "+knife+" male knife"+" "+ arrow+" female bow and arrow "+ spare +" male spare");

    }

    public void populateSolders(){
        System.out.println("enter the number of solders needed");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Gender gender;
            System.out.println("enter the gener i.e. M for Male,and F for Female");
            char gen='0';
            while (gen!='M' && gen!='F'){
                 gen=sc.nextLine().charAt(0);
                System.out.println(gen);
                if(gen!='M' && gen!='F') System.out.println("it should be M or F retry");
            }

            if(gen=='M')gender=Gender.MALE;
            else gender=Gender.FEMALE;

            System.out.println("please enter name");
            String name=sc.nextLine();

            Solders solder=new DefaultSolders(name,gender);
            if(solder.getWeapon().equals(Weapons.Bow_And_Arrow)){
                arrow++;
            }else if(solder.getWeapon().equals(Weapons.Spear)) spare++;
            else knife++;
            solders.add(solder);
        }
    }
    public List<Solders> getSolders(){
        return this.solders;
    }
    public void setSoliders(Solders solder){
        this.solders.add(solder);
    }


}
