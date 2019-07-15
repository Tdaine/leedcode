package choice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author abaka
 * @date 2019/7/15 17:01
 */

class Mythread implements Callable<String>{
    private int ticket = 100;

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
        FutureTask<String> task = new FutureTask<String>(new Mythread());
        FutureTask<String> task1 = new FutureTask<String>(new Mythread());

        new Thread(task,"1").start();
        new Thread(task1,"2").start();
        System.out.println(task.get());
    }
}
