package playwiththread;

/**
 *
 * @author Dell
 */
public class Worker1 implements Runnable {

    private int data[];

    public Worker1(int[] data) {
        this.data = data;
    }

    public void run() {
        if (data == null || data.length == 0) {
            return;
        }
        int len = data.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += data[i];
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        Result.sum = sum;
    }

}
