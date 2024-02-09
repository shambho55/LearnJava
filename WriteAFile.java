import java.io.*;

class WriteAFile{

public static void main(String[] args){

try{

FileWriter writer = new FileWriter("Foo.txt");

writer.write("Hello foo!");

writer.close();


//throw new Exception();

}

catch(Exception ex){

ex.printStackTrace();

}

}

}
