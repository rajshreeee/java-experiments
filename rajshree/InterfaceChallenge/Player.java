package javaExperiments.rajshree.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "name "+ name;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.name);
        return values;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if(savedValues!= null && savedValues.size()>0 ){
            this.name = savedValues.get(0);
        }
    }



}
