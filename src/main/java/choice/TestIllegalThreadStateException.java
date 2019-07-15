package choice;

import java.util.concurrent.Callable;

/**
 * @author abaka
 * @date 2019/7/15 18:55
 */

class MythreadTwo implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {

        while (this.ticket > 0){
            for (int i = 0; i < 100; i++){
                this.sale();
            }
        }
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


public class TestIllegalThreadStateException {
    public static void main(String[] args) {
        MythreadTwo mythreadTwo = new MythreadTwo();
        MythreadTwo mythreadTwo1 = new MythreadTwo();
        MythreadTwo mythreadTwo3 = new MythreadTwo();
        new Thread(mythreadTwo,"1").start();
        new Thread(mythreadTwo1,"2").start();
        new Thread(mythreadTwo3,"3").start();
        //new Thread(mythreadTwo).start();
    }
}
