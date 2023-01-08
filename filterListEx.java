import java.util.ArrayList;
import java.util.List;

public class filterListEx {

    public static void main(String[] args) {

        var p1 = new person(34, "Michael", Gender.MALE);
        var p2 = new person(17, "Jane", Gender.FEMALE);
        var p3 = new person(28, "John", Gender.MALE);
        var p4 = new person(47, "Peter", Gender.MALE);
        var p5 = new person(27, "Lucy", Gender.FEMALE);

        var persons = List.of(p1, p2, p3, p4, p5);

        var result = new ArrayList<person>();

        for (person person: persons) {

            if (person.getSex() == Gender.FEMALE) {

                result.add(person);
            }
        }

        System.out.println(result);
    }
}