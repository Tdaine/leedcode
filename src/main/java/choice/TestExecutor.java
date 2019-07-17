package choice;

/**
 * @author abaka
 * @date 2019/7/16 20:59
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CachedTesk implements Runnable{


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TestExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++){
            executorService.submit(new CachedTesk());
        }
        executorService.shutdown();
    }
}

