package persons;

public class Neznaika extends Person {
   /* public void setPlaceInBalloon(Bench place){

    }*/

    public void think(String str1,String str2){
        System.out.println(getName()+" приложил "+str1+" к "+str2+" и начал думать");
    }
    public void see(){
        System.out.println(getName()+" увидел:");
    }
    @Override
    public void say(String str){
       System.out.println(getName()+" закричал: "+str);
    }

    @Override
    public String getName() {
        return "Незнайка";
    }

    public class Pocket{
        public String getName(){
            return "карман";
        }
        public void take(String str){
            System.out.println(Neznaika.this.getName()+" достал из "+getName()+" "+str);
        }
    }
    public class Forehead{
        public String getName(){
            return "лоб";
        }
    }
    public class Finger{
        public String getName(){
            return "палец";
        }
    }
}
