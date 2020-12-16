package Persons;

public class Ponchik extends Person {
    private double waist;
    public Ponchik(double waist){
        this.waist=waist;
    }

    public double getWaist(){
        return waist;}
    @Override
    public String getName(){
        return "Пончик";
    }
}
