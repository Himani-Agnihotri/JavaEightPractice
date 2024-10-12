import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferencePractice2 {
    static Function<String,String> f1 = name -> name.toUpperCase();
    static Function<String,String> f2 = String::toUpperCase;

    static Predicate<Person> p1 = per -> per.height>100;
    static BiPredicate<Person,Integer> p2 = MethodReferencePractice2::heightCheckWithParam;

    public static void main(String args[]){
        System.out.println("RESULT 1 IS: "+f1.apply("himani"));
        System.out.println("RESULT 2 IS: "+f2.apply("himani"));
        Person p3 = new Person();
        p3.setName("himani");
        p3.setAge(29);
        p3.setHeight(160);
        System.out.println("RESULT 3 IS: "+p2.test(p3,200));
    }
    static boolean heightCheck(Person person){
        return person.height>=100;
    }
    static boolean heightCheckWithParam(Person person, Integer height){
        return person.height>=height;
    }
}
