public class LinkedQueueDemo{

public static void main(String a[]){

Queue<Integer> q = new LinkedQueue<Integer>();

q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
q.enqueue(50);
q.enqueue(60);
q.enqueue(70);

System.out.println("Dequeue an item from the queue : " + q.dequeue());

System.out.println("Size of the queue : " + q.size());

System.out.println("How item are popped from a queue? , see below!");

for(Integer i : q){

System.out.println("Item popping : " + q.dequeue());

}

System.out.println("is Queue Empty ? " + q.isEmpty());

}

}
