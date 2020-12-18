package persons;

public class Syrop extends Person {
    private double waist;
    public Syrop(double waist){
        this.waist=waist;
    }
    public double getWaist(){
        return waist;
    }
    @Override
    public String getName() {
        return "Сиропчик";
    }
}
