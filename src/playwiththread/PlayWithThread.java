package playwiththread;

/**
 *
 * @author Dell
 */
public class PlayWithThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int data[] = new int[]{1, 2, 3, 4, 5};
        Thread t1 = new Thread(new Worker1(data));
        Thread t2 = new Thread(new Worker2(data));

        try {
            System.out.println("sum: " + Result.sum + "   mul: " + Result.multi);
            t1.start();
            t2.start();
            System.out.println("sum: " + Result.sum + "   mul: " + Result.multi);
            t2.join();
            t1.join();
            System.out.println("sum: " + Result.sum + "   mul: " + Result.multi);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
