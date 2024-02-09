import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class LostUpdate{

public static void main(String[] args) throws InterruptedException{

ExecutorService pool = Executors.newFixedThreadPool(6);


Balance balance = new Balance();

for(int i = 0;i < 1000;i++){

pool.execute(() -> balance.increment());

}

pool.shutdown();

if(pool.awaitTermination(1,TimeUnit.MINUTES)){

System.out.println("balance = " + balance.balance);

}

}

}


class Balance{

AtomicInteger balance = new AtomicInteger(0);

public void increment(){

balance.incrementAndGet();

}

}
