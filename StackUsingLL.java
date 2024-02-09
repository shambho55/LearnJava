class Node{

int data;
Node next;

Node(int d){

data = d;

next = null;

}

}

class StackUsingLL{

Node head;

void push(int x){

Node temp = new Node(x);

if(head == null){

head = temp;

}

else{

temp.next = head;

head = temp;

}

}

int pop(){

if(head == null){

System.out.println("Stack is empty.");

return -1;

}

else{

Node temp = head;

head = head.next;

return temp.data;

}

}

int top(){

if(head == null){

System.out.println("Stack is empty.");

return -1;

}

else{

return head.data;

}

}

void display(){

Node curr = head;

System.out.println("Printing Stack Elements: ");

while(curr != null){

System.out.print(curr.data + " ");

curr = curr.next;

}

System.out.println();

}


}

