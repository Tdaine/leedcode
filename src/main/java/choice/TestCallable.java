package choice;

import java.util.concurrent.*;

/**
 * @author abaka
 * @date 2019/7/15 17:01
 */

class Mythread implements Callable<String>{
    private int ticket = 10;

    @Override
    public String call() throws Exception {
        while (this.ticket > 0){
            for (int i = 0; i < 100; i++){
                this.sale();
            }
        }
        return "票卖完了";
    }
    private synchronized void sale(){
        if (this.ticket > 0){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "剩余票数:" + this.ticket--);
        }

    }
}


public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Mythread mythread = new Mythread();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++){
            Future future = executorService.submit(mythread);
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
