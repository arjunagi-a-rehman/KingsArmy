package kingsArmy.solders;

import kingsArmy.Gender;

public interface Solders {
    void grabWeapon(Gender gender, String name);
    Weapons getWeapon();
    void setWeapon(Weapons weapon);
}
