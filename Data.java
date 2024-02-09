import java.util.*;
import java.util.concurrent.*;

final class Data{

private final List<String> letters = new /*CopyOnWrite*/ArrayList<>();

public List<String> getLetters(){

return letters;

}

public synchronized void addLetter(char letter){

letters.add(String.valueOf(letter));

}

}
