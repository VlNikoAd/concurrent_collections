import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {

        ATC atc = new ATC();
        new Thread(atc).start();

        Operator operator1 = new Operator(atc);
        new Thread(operator1).start();
        Operator operator2 = new Operator(atc);
        new Thread(operator2).start();

    }
}
