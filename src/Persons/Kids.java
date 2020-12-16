package Persons;
import Persons.Person;
import Places.Balloon;

public class Kids extends Person {
    public void grab(Balloon.Parachute par){
        System.out.print(getName()+" ухватились за "+ par.getName()) ;
    }
    public void changeLocation(Person person,Balloon place){
        System.out.println(" перетащили "+ person.getName()+" в "+ place.getName()) ;
        person.setPlace(place);
    }
    @Override
    public String getName() {
        return "Малыши";
    }
}
