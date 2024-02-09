class StackOperationsUsingLL{

public static void main(String[] args){

StackUsingLL s = new StackUsingLL();

s.push(9);

System.out.println(s.top());

s.push(10);

s.push(11);

s.push(12);

s.display();

System.out.println(s.top());

s.pop();

System.out.println(s.top());

s.pop();

s.pop();

System.out.println(s.top());

s.pop();

System.out.println(s.top());

}

}
