import java.util.Scanner;

public class StackOperations{

public static void main(String[] args){

int choice = 0;

Scanner sc = new Scanner(System.in);

Stack s = new Stack();

while(choice != 5){

System.out.println("Chose from below options.");

System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Show\n5.Exit");

System.out.println("Enter your choice : ");

choice = sc.nextInt();

switch(choice){

case 1:
{

s.push(sc);

break;

}

case 2:
{

s.pop();

break;

}

case 3:
{

int a = s.peek();

System.out.println(a);

}

case 4:
{

s.display();

break;

}

case 5:
{


System.out.println("Exiting...");

System.exit(0);

break;

}

default:
{

System.out.println("Please Enter valid choice.");

}

}

}

}

}
