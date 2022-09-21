public class Operator implements Runnable{

    protected int timeSleep = 300;
    protected ATC atc;

    Operator(ATC atc) {
        this.atc = atc;
    }

    @Override
    public void run() {
        for (int i=0; i<atc.valuesCalls; i++) {
            if (!atc.calls.isEmpty()) {
                try {
                    System.out.println("Новый оператор взял звонок " + atc.calls.take());
                    Thread.sleep(timeSleep);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
