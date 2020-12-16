package Interfaces;

import Persons.Person;
import Persons.Ponchik;
import Persons.Syrop;
import Places.ZeroException;

public interface ForRope {
    public String getName();
    public double compareTheWaistSize(Syrop person1, Ponchik person2) throws ZeroException;//сравниваем талию двух людей при помощи веревки
    public void printComparison(Person person, Syrop person1, Ponchik person2);//печатаем, кто худее

}
