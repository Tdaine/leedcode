package choice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author abaka
 * @date 2019/7/15 17:01
 */

class Mythread implements Callable<String>{
    private int ticket = 10;

    @Override
    public String call() throws Exception {
        while (this.ticket > 0){
            System.out.println(Thread.currentThread().getName() + "剩余票数:" + this.ticket--);
        }
        return "票卖完了";
    }
}


public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<String>(new Mythread());

        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());
    }
}
