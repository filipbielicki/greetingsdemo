/**
 * Created by Filip on 2017-11-24.
 */
public class Greeting {

    public String passGreetings(GreetingType greetingType){
        return greet(greetingType);
    }

    private String greet(GreetingType greetingType){
        String greeting = "";
        switch(greetingType){
            case HELLOWORLD:
                greeting = "Hello world!";
                break;
            case HELLOPEOPLE:
                greeting = "Hello people!";
                break;
            case HELLOGUYS:
                greeting = "Hello guys!";
                break;
            case HELLOKIDS:
                greeting = "Hello kids!";
                break;
            case HELLOEVERYBODY:
                greeting = "Hello everybody!";
                break;
        }
        return greeting;
    }
}
