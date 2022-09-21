import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ATC implements Runnable {

    protected BlockingQueue<Integer> calls = new ArrayBlockingQueue<>(20);
    protected int timeSleep = 100;
    protected int valuesCalls = 60;

    @Override
    public void run() {
        for (int i = 0; i < valuesCalls; i++) {
            try {
                calls.offer(i + 1);
                Thread.sleep(timeSleep);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
