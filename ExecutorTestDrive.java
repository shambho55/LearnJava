import java.util.concurrent.*;

class ExecutorTestDrive{

public static void main(String[] args){

ExecutorService executor = Executors.newSingleThreadExecutor();

executor.execute(() -> System.out.println("top o' the stack"));

System.out.println("back in main");

executor.shutdown();

}

}
