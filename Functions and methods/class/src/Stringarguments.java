public class Stringarguments {
    public static void main(String[] args) {
        String personalised = greeting("mia khalifa");
        System.out.println(personalised);
    }

    static String greeting(String name) {
        String message = "hello " + name;
        return message;
    }
}
