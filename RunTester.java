class RunTester{

public static void main(String[] args){

MyRunnable runnable = new MyRunnable();

runnable.run();

System.out.println(Thread.currentThread().getName() + ": back in main");

Thread.dumpStack();

}

}
