package persons;
import places.Balloon;

public class Kids extends Person {
    public void grab(Balloon.Parachute par, Hands hands){
        System.out.println(getName()+" ухватились, используя "+hands.getName()+", за "+ par.getName()) ;
    }
    public void drag(Person person,Balloon place){
        System.out.println(" перетащили "+ person.getName()+" в "+ place.getName()) ;
        person.setPlace(place);
    }

    public void circle(Person p1,Person p2){
        class All extends Person {
            @Override
            public String getName() {
                return "Все";
            }
        }
        All all=new All();
        System.out.println(all.getName()+" окружили "+p1.getName()+" и "+p2.getName());
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
