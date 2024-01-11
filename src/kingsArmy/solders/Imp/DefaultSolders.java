package kingsArmy.solders.Imp;

import kingsArmy.Gender;
import kingsArmy.solders.Solders;
import kingsArmy.solders.Weapons;

public class DefaultSolders implements Solders {
    private String name;
    private Gender gender;
    private Weapons weapon;

    public DefaultSolders(String name,Gender gender){
        this.name=name;
        this.gender=gender;
        grabWeapon(gender,name);
        System.out.println("my name is "+this.name+" gender is "+ gender+" I grab a "+weapon);
    }

    private final String startLetters ="acd";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public String getStartLetters() {
        return startLetters;
    }

    @Override
    public void grabWeapon(Gender gender, String name) {
        if(gender==null||name==null||name.isEmpty()){
            throw new RuntimeException("invalid solder");
        }
        try {
            if (gender.equals(Gender.MALE) && startLetters.indexOf(name.charAt(0))>0){
                this.weapon=Weapons.Knife;
            }else if(gender.equals(Gender.MALE)){
                this.weapon=Weapons.Spear;
            }else{
                this.weapon=Weapons.Bow_And_Arrow;
            }
        }catch (Exception e){
            throw e;
        }

    }
}
