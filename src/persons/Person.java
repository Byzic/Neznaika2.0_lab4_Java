package persons;

import places.*;

public abstract class Person {
    private Balloon place = null;
    private boolean conflict=false;

    public abstract String getName();
    public void say(String str){
        System.out.println(getName()+" сказал: "+str);
    }
        public void argue(Person person){
        System.out.println(getName()+" начал спорить с "  + person.getName());
        conflict=true;
        person.conflict=true;
    }

    public void stopConflict(){
        if (getPlace()==null){
            System.out.println(getName()+" не присутствовал, никто не мог остановить конфликт");
            conflict=true;
        }
        else {
            System.out.println(getName()+" присутствовал, знатно порешал конфликт");
            conflict=false;
        }
    }
    public void continueConflict(Person person){ //можно узнать, что происходит с конфликтом
        if ((conflict) && (person.conflict)){
            System.out.println(getName()+" и " + person.getName()+" не умолкали");
        }
        else {
            System.out.println(getName()+" и " + person.getName()+" уже уладили ситуацию");
        }
    }
    public Balloon getPlace() {
        return place;
    }

    public void setPlace(Balloon place) {
        this.place = place;
    }


}


