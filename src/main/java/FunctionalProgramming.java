@FunctionalInterface
interface Greeting {
    String greet(String name);
}
//
//interface Greeting<T, R> {
//    R greet(T name);
//}

@FunctionalInterface
interface Greeting2 {
    void greet(String lang, String name);
}

class EnglishGreeting implements Greeting {
    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}

public class FunctionalProgramming {

    public static void main(String[] args) {

        // Named class to implement interface
        EnglishGreeting englishGreeting = new EnglishGreeting(); // creates instance or object
        String result = englishGreeting.greet("Eve");

        System.out.println(result);

        // Anonymous class to implement interface
        // new InterfaceName() : anonymous class implements interface

        Greeting spanishGreeting = new Greeting() {
            @Override
            public String greet(String name) {
                return "Hola " + name;
            }
        };

        String result2 = spanishGreeting.greet("John");
        System.out.println(result2);

        // Lambda Expression

        Greeting frenchGreeting = (String name) -> "Bonjour " + name;

        String result3 = frenchGreeting.greet("Ben");
        System.out.println(result3);

        Greeting2 greeting = (String lang, String name) -> {
            switch(lang) {
                case "eng": {
                    System.out.println("Hello " + name);
                    break;
                }
                case "french": {
                    System.out.println("Bonjour " + name);
                    break;
                }
                default:{
                    System.out.println("Hi " + name);
                    break;
                }
            }
        };

        greeting.greet("swahili", "Paul");

    }

}
