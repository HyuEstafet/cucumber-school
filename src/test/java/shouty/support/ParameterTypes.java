package shouty.support;
import shouty.Person;
import io.cucumber.java.ParameterType;

public class ParameterTypes {

    @ParameterType("Lucy|Sean")
    public Person person(String name) {
        return new Person(); // In the video it is "return new Person(name);" --> Why?
    }
}