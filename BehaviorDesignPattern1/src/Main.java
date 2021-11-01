import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringPublisher publisher = new StringPublisher();

        StringSubscriber alphabetSubscriber = new AlphabetSubscriber("Alphabet");
        StringSubscriber numberSubscriber = new NumberSubscriber("Number");
        StringSubscriber symbolSubscriber = new SymbolSubscriber("Symbol");

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);

        Scanner input = new Scanner(System.in);
        String str = "";

        while (true) {
            System.out.println("##Type exit if you want to exit##");
            System.out.print("Enter text : ");
            str = input.nextLine();
            if (str.equals("exit")) {
                break;
            }
            publisher.publish(str);
        }

        if(str.equals("exit"))
            System.exit(0);

    }
}