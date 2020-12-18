package persons;



public class Grumbler extends Person  {

    public void lookDown(){
        System.out.println(getName()+" посмотрел вниз");
    }


    @Override
    public String getName() {
        return "Ворчун";
    }
}
