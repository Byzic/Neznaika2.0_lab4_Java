import Interfaces.ForRope;
import Persons.*;
import Places.*;
import Nature.*;
public class Main {
    public static void main(String[] args) {
        TimeOfDay time= TimeOfDay.MORNING;
        Sun sun=new Sun();
        Wind wind=new Wind();

        Grumbler grumbler= new Grumbler();
        Neznaika neznaika= new Neznaika();
        Znaika znaika=new Znaika();
        Toropyzhka toropyzhka=new Toropyzhka();
        Ponchik ponchik=new Ponchik(100);
        Syrop syrop=new Syrop(150);
        Kids kids= new Kids();
        Balloon balloon=new Balloon();
        Balloon.Bench bench= balloon.new Bench();

        Balloon.Parachute parachute=new Balloon.Parachute();
        kids.grab(parachute);
        kids.changeLocation(toropyzhka,balloon);

        grumbler.setPlace(balloon);
        neznaika.setPlace(balloon);


        balloon.goUp();

        neznaika.say("Стойте. Теперь я буду главным!");
        grumbler.lookDown();
        grumbler.say("Ты? Не с твоей головой!");
        grumbler.argue(neznaika);
        znaika.stopConflict();
        time=TimeOfDay.EVENING;
        if (time == TimeOfDay.EVENING){
            sun.evening();
            wind.evening();
            balloon.evening();
        }
        else{
            sun.morning();
            wind.morning();
            balloon.morning();
        }
        sun.printCondition();
        wind.printCondition();
        grumbler.continueConflict(neznaika);


        bench.sit(neznaika);
        ForRope rope= new ForRope() {
            @Override
            public String getName() {
                return "веревка";
            }

            @Override
            public double compareTheWaistSize (Syrop person1, Ponchik person2) throws  ZeroException {  //сравниваем размер талии
                if (person2.getWaist()<=0d){
                    throw new ZeroException();
                }
                return  person1.getWaist()/person2.getWaist();

            }

            @Override
            public void printComparison(Person person, Syrop person1, Ponchik person2) {    //выводим результат сравнения
                System.out.println(person.getName()+" взял "+getName());
                System.out.println(person.getName()+" измерил талию для "+person1.getName()+" и "+person2.getName());
                try{System.out.println("Оказалось, что "+person1.getName()+" в "+compareTheWaistSize(person1, person2)+" толще чем "+person2.getName());}
                catch (ZeroException zero){
                    System.err.println(person2.getName()+" лишком худой, его талия <=0");
                }

            }
        };
        rope.printComparison(neznaika,syrop,ponchik);
        //System.out.println(neznaika.getPlace());




    }

}