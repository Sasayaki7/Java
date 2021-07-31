public class AlfredTest{

    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGuestGreeting = alfredBot.guestGreeting("Harley Quinn", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Ay Alexa, order me some of that chicken");
        String alfredTest = alfredBot.respondBeforeAlexis("Alfred, could you do this for me?");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Give me some  potato");

        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}