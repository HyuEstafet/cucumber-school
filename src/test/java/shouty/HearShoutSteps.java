package shouty;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HearShoutSteps {
   Person lucy = new Person();// In the video it is "Person lucy = new Person("Lucy");" --> Why?
   Person sean = new Person ();// In the video it is "Person lucy = new Person("Lucy");" --> Why?
   private String messageFromSean;

    @Given("{person} is located/standing {int} metre(s) from Sean")
    public void lucy_is_located_metres_from_sean(Person person, Integer distance) {
        throw new PendingException(String.format("Lucy is %d centimetres from Sean", distance*100));
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        assertEquals(asList(messageFromSean),lucy.getMessagesHeard());
    }
}
