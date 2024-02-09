import java.util.concurrent.*;

class ExecutorTester{

public static void main(String[] args){

Runnable job = new MyRunnable();

ExecutorService executor = Executors.newSingleThreadExecutor();

executor.execute(job);


System.out.println(Thread.currentThread().getName() + ": back in main");

Thread.dumpStack();

executor.shutdown();

}

}
