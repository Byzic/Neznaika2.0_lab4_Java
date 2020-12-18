import interfaces.ForRope;
import persons.*;
import places.*;
import nature.*;
public class Main {
    public static void main(String[] args) {
        TimeOfDay time= TimeOfDay.MORNING;
        Sun sun=new Sun();
        Wind wind=new Wind();


        Grumbler grumbler= new Grumbler();
        Neznaika neznaika= new Neznaika();
        Neznaika.Pocket pocket=neznaika.new Pocket();
        Neznaika.Finger finger=neznaika.new Finger();
        Neznaika.Forehead forehead=neznaika.new Forehead();
        Znaika znaika=new Znaika();
        Toropyzhka toropyzhka=new Toropyzhka();
        Ponchik ponchik=new Ponchik(100);
        Syrop syrop=new Syrop(150);
        Kids kids= new Kids();
        Kids.Hands hands=kids.new Hands();
        Balloon balloon=new Balloon();
        Balloon.Bench bench= balloon.new Bench();

        Balloon.Parachute parachute=new Balloon.Parachute();
        kids.grab(parachute,hands);
        kids.drag(toropyzhka,balloon);

        grumbler.setPlace(balloon);
        neznaika.setPlace(balloon);
        neznaika.see();
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
        neznaika.think(finger.getName(),forehead.getName());

        try {
            balloon. setHeight(balloon.goDown());
        } catch (HeightException e) {
            System.err.println(e.getMessage()+" он упал и разбился :(");
        }

        kids.circle(ponchik,syrop);


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
                System.out.println(person.getName()+" измерил талию для "+person1.getName()+" и "+person2.getName());
                try{System.out.println("Оказалось, что "+person1.getName()+" в "+compareTheWaistSize(person1, person2)+" толще чем "+person2.getName());}
                catch (ZeroException zero){

                    System.err.println(person2.getName()+" лишком худой, его талия <=0");
                }

            }
        };

        pocket.take(rope.getName());
        rope.printComparison(neznaika,syrop,ponchik);





    }

}