package playwiththread;

/**
 *
 * @author Dell
 */
public class Worker2 implements Runnable {

    private int data[];

    public Worker2(int[] data) {
        this.data = data;
    }

    public void run() {
        if (data == null || data.length == 0) {
            return;
        }
        int len = data.length;
        int mul = 1;
        for (int i = 0; i < len; i++) {
            mul *= data[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        Result.multi = mul;
    }
}
