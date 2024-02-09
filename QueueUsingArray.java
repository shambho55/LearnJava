class QueueUsingArray{

private int maxSize;

private int[] queueArray;

private int front;

private int rear;

private int currentSize;

public QueueUsingArray(int size){

this.maxSize = size;

queueArray = new int[size];

front = 0;

rear = -1;

currentSize = 0;

}

boolean isEmpty(){

return currentSize == 0;

}

void enqueue(int d){

if(isFull()){

System.out.println("Queue is Full!");

return;

}

if(rear == maxSize - 1){

rear = -1;

}

queueArray[++rear] = d;

currentSize++;

}

int dequeue(){

if(isEmpty()){

throw new RuntimeException("Queue is Empty.");

}

int temp = queueArray[front++];

if(front == maxSize){

front = 0;

}

currentSize--;

return temp;

}

int peek(){

return queueArray[front];

}

boolean isFull(){

return currentSize == maxSize;

}

public static void main(String[] args){

QueueUsingArray q = new QueueUsingArray(3);

q.enqueue(2);

q.enqueue(3);

System.out.println("Element at top : " + q.peek());

q.dequeue();

System.out.println("Element at top : " + q.peek());

q.enqueue(5);

System.out.println("Element at top : " + q.peek());

System.out.println("Checking queue is empty or not ? " + q.isEmpty());

System.out.println("Checking queue is Full or not ? " + q.isFull());

q.dequeue();

q.dequeue();

System.out.println("Checking queue is Full or not ? " +  q.isEmpty());

}

}
