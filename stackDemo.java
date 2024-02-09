import java.util.*;


class stackDemo{

public static void main(String[] args){


Stack<Integer> stack1 = new Stack<Integer>();

stack1.push(2);
stack1.push(1);
stack1.push(5);
stack1.push(6);

System.out.println(stack1);
System.out.println("Element at top : " + stack1.peek());
System.out.println("Element popped out : " + stack1.pop());
System.out.println("Element at top : " + stack1.peek());
System.out.println(stack1);

while(!stack1.empty()){

System.out.println(stack1.pop() + " element popped.");

}

System.out.println(stack1.empty());

}

}
