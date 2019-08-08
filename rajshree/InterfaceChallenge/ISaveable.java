package javaExperiments.rajshree.InterfaceChallenge;


import java.util.ArrayList;

public interface ISaveable {
    public ArrayList<String> write();
    public void read(ArrayList<String> savedValues);
}
