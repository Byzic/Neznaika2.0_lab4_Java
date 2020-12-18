package places;
import interfaces.*;
import persons.Person;

public class Balloon implements ConditionChecker,StatusSetter {
    private boolean cooldown = false;
    private int height=15;
    private int temperature=15;
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
         height=h;
    }

    public int goDown() throws HeightException{
        System.out.println(getName()+" стал спускаться вниз");
        if (height<=10){
            System.out.println("все быстрее и быстрее...");
        }
        height-=5;
        if (height<=0){
            throw new HeightException("Высота шара над землей <=0");
        }
        return height;

    }
    public int goUp(){
        System.out.println(getName()+" стал подниматься вверх");
        return height+5;
    }
    @Override
    public void morning() {

        temperature +=  6;
        cooldown = false;
        printCondition();
        height=goUp();

    }
    @Override
    public void evening() {
        temperature -=  6;
        cooldown = true;
        printCondition();
        try {
            height=goDown();
        } catch (HeightException e) {
            System.err.println(e.getMessage()+" он упал и разбился :(");
        }
    }
    @Override
    public boolean condition() {   //возвращаем остыл шар или нет
        return cooldown;
    }

    public String getName(){
        return "Воздушный шар";
    }

    @Override
    public void printCondition(){
        System.out.println(condition() ? "Шар остыл " : "Шар не остыл");
    }

    @Override
    public String toString() {
        return getName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balloon balloon = (Balloon) o;
        return cooldown == balloon.condition() ;
    }
     @Override
    public int hashCode() {
        return this.toString().length();
    }

    public class Bench extends Balloon {        // вложенный класс лавка в Шаре
        public String getName(){
            return "лавка";
        }
        public void sit(Person person){
            person.setPlace(this);
            System.out.println(person.getName()+" сел на "+getName());
        }
    }
    public static class Parachute{
        public String getName(){
            return "парашют";
        }

    }
}
