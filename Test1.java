class Foo{

static String text = "Foo";

}


class Bar extends Foo{

void printText(){

System.out.println(Foo.text);

}

}

class Test1{

public static void main(String[] args){

System.out.println(Bar.text);

String text = "hiheyhello";

int index = text.lastIndexOf("h",4);

System.out.println(index);

char ch = '\utea';

System.out.println(ch);

char ch1 = 'tea';

System.out.println(ch);

char cr = \u0223;

System.out.println(cr);

}

}
