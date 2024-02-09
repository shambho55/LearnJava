import java.util.Scanner;

class Stack{

int top;

int maxsize = 10;

int[] arr = new int[maxsize];

int peek(){

if(top == -1){

System.out.println("Underflow.");

return -1;

}

else{

return arr[top];

}

}

boolean isEmpty(){

return (top < 0);

}

Stack(){

top = -1;

}

boolean push(Scanner sc){

if(top == maxsize - 1){

System.out.println("Overflow!");

return false;

}

else{

System.out.println("Enter Value");

int val = sc.nextInt();

top++;

arr[top] = val;

System.out.println("Item pushed");

return true;

}

}

boolean pop(){

if(top == -1){

System.out.println("Underflow!");

return false;

}

else{

top--;

System.out.println("Item popped.");

return true;

}

}

void display(){

for(int i = top;i >= 0;i--){

System.out.print(arr[i] + " ");

}

System.out.println();

}

}

