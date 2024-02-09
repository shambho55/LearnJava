public class LinkedList{

private static Node convertArrToLL(int [] arr){

Node head = new Node(arr[0]);

Node mover = head;

for(int i = 1;i < arr.length;i++){

Node temp = new Node(arr[i]);

mover.next = temp;

mover = temp;

}

return head;

}

private static int len(Node head){

Node temp = head;

int count = 0;

while(temp != null){

count++;

temp = temp.next;

}

return count;

}

private static void print(Node head){

Node temp = head;

while(temp != null){

System.out.print(temp.data + " ");

temp = temp.next;

}

System.out.println();

}

private static Node removeHead(Node head){

if(head == null) return head;

head = head.next;

return head;

}

private static Node removeTail(Node head){

if(head == null || head.next == null) return null;

Node temp = head;

while(temp.next.next != null){

temp = temp.next;

}

temp.next = null;

return head;

}

public static void main(String[] args){

int [] arr = {3,5,8,9};

/*
Node y = new Node(arr[0]);

System.out.println(y.data);
System.out.println(y.next);
*/

Node head = convertArrToLL(arr);

System.out.println(head.data);
System.out.println(head.next.data);

Node temp = head;

while(temp != null){

System.out.print(temp.data + " ");

temp = temp.next;

}

System.out.println();

int lenOfLL = len(head);

System.out.println("Length of LL " + lenOfLL);

print(head);

Node rhead = removeHead(head);

print(rhead);

print(head);

Node rtail = removeTail(head);

print(rtail);

}

}
