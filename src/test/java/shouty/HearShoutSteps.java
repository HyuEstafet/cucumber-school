package shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Before;
import shoutyMain.Network;
import shoutyMain.Person;

import java.util.HashMap;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HearShoutSteps {
   private Person lucy;
   private Person sean;
   private String messageFromSean;
   private Network network;
   private HashMap <String, Person> people;

    @Before
    public void createNetwork() {
        network = new Network(); // Creating a new network before each scenario runs
        people = new HashMap<>(); // So we can store a key
    }

    @Given("a person named {word}")
    public void a_person_named(String name) {
        people.put(name,new Person(network));
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) throws Throwable {
        people.get("Sean").shout(message);
        messageFromSean = message;
    }

    @Then("Lucy should hear Sean's message")
    public void lucy_hears_sean_s_message() throws Throwable {
        assertEquals(asList(messageFromSean),people.get("Lucy").getMessagesHeard());
    }
}
