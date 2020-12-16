package Persons;

public class All extends Person {
    public void circle(Person p1,Person p2){
        System.out.println(getName()+" окружили "+p1.getName()+" и "+p2.getName());
    }
    @Override
    public String getName() {
        return "Все";
    }
}
