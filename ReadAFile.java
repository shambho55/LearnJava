import java.io.*;
import java.util.stream.*;

class ReadAFile{

public static void main(String[] args){

try{

/*
File myFile = new File("MyText.txt");



FileReader fileReader = new FileReader(myFile);


BufferedReader reader = new BufferedReader(fileReader);

String line;

while((line = reader.readLine()) != null){

System.out.println(line);

}

reader.close();
*/

Files.lines(Path.of("MyText.txt"))
     .forEach(line -> System.out.println(line));

}

catch(IOException e){

e.printStackTrace();

}

}

}
