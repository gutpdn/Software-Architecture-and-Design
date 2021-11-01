import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Flow;

public class NumberSubscriber extends StringSubscriber{

    private String filename = "";

    NumberSubscriber(String subscribe) {
        try {
            this.filename = subscribe;
            File file = new File(subscribe + ".txt");
            if(file.createNewFile()) {
                System.out.println("File created : " + file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {}

    @Override
    public void onNext(String item) {
        try {
            FileWriter fileWriter = new FileWriter(filename + ".txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf(item + "\n");
            printWriter.close();
            System.out.println("\t\tIt was received by Number Subscriber.");
        } catch (IOException ex) {
            this.onError(ex);
        }
    }

    @Override
    public boolean checkContains(String item) {
        return item.matches(".*[0-9].*");
    }
}