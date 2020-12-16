package Persons;
import Persons.Person;
import Places.Balloon;

public class Kids extends Person {
    public void grab(Balloon.Parachute par, Hands hands){
        System.out.println(getName()+" ухватились, используя "+hands.getName()+", за "+ par.getName()) ;
    }
    public void drag(Person person,Balloon place){
        System.out.println(" перетащили "+ person.getName()+" в "+ place.getName()) ;
        person.setPlace(place);
    }
    @Override
    public String getName() {
        return "Малыши";
    }

    public class Hands{
        public String getName(){
            return "руки";
        }
    }
}
