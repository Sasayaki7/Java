import java.util.Date;
public class AlfredQuotes{

    public String guestGreeting(String name, String dayPeriod){
        
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String dateAnnouncement(){
        Date today = new Date();
        return "The current date is " + today;
    }

    public String respondBeforeAlexis (String conversation){
        if (conversation.indexOf("Alexa") != -1){
            return "Yeah lemme handle that. That wench ain't useful.";
        }
        else if (conversation.indexOf("Alfred")!=-1){
            return "Yes master. Your wish is my bidding";
        }
        else{
            return "... as I drift into my hidey-hole into the corner...";
        }
    }
}