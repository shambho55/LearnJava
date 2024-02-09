class ThreadTestDrive{

public static void main(String[] args){

Thread myThread = new Thread(() -> System.out.println("top o' of the stack"));

myThread.start();

System.out.println("back in main");

}

}
