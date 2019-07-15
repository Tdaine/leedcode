package choice;


import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author abaka
 * @date 2019/7/15 20:10
 */

class Mutex implements Lock{
    private Sync sync = new Sync();

    ////////////////////////////////////
    static class Sync extends AbstractQueuedSynchronizer{
        @Override
        protected boolean tryAcquire(int arg) {
            if (arg != 1){
                throw new RuntimeException("信号量不为1!");
            }

            if (compareAndSetState(0,1)){
                //当前线程成功获得锁
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            if (getState() == 0){
                throw new IllegalMonitorStateException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }
        Condition newCondition(){
            return new ConditionObject();
        }
    }
    //------------------------------------------

    //Lock接口实现方法
    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
}

public class MyLock {
    private static Mutex mutex = new Mutex();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            Thread thread = new Thread(() -> {
                mutex.lock();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    mutex.unlock();
                }
            });
            thread.start();
        }
    }
}
