import java.util.*;
import java.util.stream.*;

class Person{
    public int id;
    public String name;
    public int hashCode(){
        return id;
    }

    public static void main(String args[]){
        Set<Person> set = new HashSet<>();
        Person p = new Person();
        set.add(p);
        System.out.println(set.size());
        Person p2 = p;
        //IntStream.rangeClosed(0,100).forEach(i -> {
        //    p2.id = i;
        //    set.add(p2);
        //    System.out.println(set.size());
        //});            
        p2.id = 5;
        set.add(p2);
        System.out.println(set.size());
        //p2.id = 7;
        //set.add(p2);
        //System.out.println(set.size());
        Person p1 = new Person();
        set.add(p1);
        System.out.println("p=p2" + p.equals(p2) + "hascodes " + p.hashCode() + " " + p2.hashCode() + "p1=p " + p1.equals(p));
        System.out.println(set.size());

    }
}


