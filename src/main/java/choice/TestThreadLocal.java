package choice;

/**
 * @author abaka
 * @date 2019/7/15 18:16
 */
public class TestThreadLocal {
    private static String commstr;
    private static ThreadLocal<String> threadStr = new ThreadLocal<String>();

    public static void main(String[] args) {
        commstr = "main";
        threadStr.set("main");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                commstr = "thread";
                threadStr.set("thread");
            }
        });

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(commstr);
        System.out.println(threadStr.get());
    }
}
