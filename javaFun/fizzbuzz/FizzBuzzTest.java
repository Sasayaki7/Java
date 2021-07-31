public class FizzBuzzTest{

    public static void main(String[] args) {
        FizzBuzz test = new FizzBuzz();
        System.out.println(test.fizzBuzz(9));
        System.out.println(test.fizzBuzz(10));
        System.out.println(test.fizzBuzz(15));
        System.out.println(test.fizzBuzz(21));
        System.out.println(test.fizzBuzz(22));
        System.out.println(test.fizzBuzz(2));
        System.out.println(test.fizzBuzz(9, "Mew", "Two", "Mewtwo"));
        System.out.println(test.fizzBuzz(10, "Pika", "Chu", "Pikachu"));
        System.out.println(test.fizzBuzz(15, "OWO", "UWU", "OWOUWU"));
        System.out.println(test.fizzBuzz(2, "Meow", "Roar", "Squeak"));
    }
}