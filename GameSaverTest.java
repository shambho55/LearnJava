import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class GameSaverTest{

public static void main(String[] args){


GameCharacter one = new GameCharacter(50,"Elf",new String[]{"bow","sword","dust"});

GameCharacter two = new GameCharacter(200,"Troll",new String[]{"bare hands","big ax"});

GameCharacter three = new GameCharacter(120,"Magician",new String[]{"spells","invisibility"});

/*
List<GameCharacter> l = List.of(new GameCharacter(50,"Elf",new String[]{"bow","sword","dust"}),
				new GameCharacter(200,"Troll",new String[]{"bare hands","big ax"}),
				new GameCharacter(120,"Magician",new String[]{"spells","invisibility"}));
*/

ArrayList<GameCharacter> l = new ArrayList<GameCharacter>();

l.add(one);

l.add(two);

l.add(three);


try{



ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));

os.writeObject(l);

/*
os.writeObject(two);

os.writeObject(three);
*/

os.close();

}

catch(IOException ex){

ex.printStackTrace();

}

try{

ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));

ArrayList<GameCharacter> l1 = (ArrayList<GameCharacter>) is.readObject();

//GameCharacter twoRestore = (GameCharacter)is.readObject();

//GameCharacter threeRestore = (GameCharacter) is.readObject();

System.out.println("One's type : " + l1.get(0).getType());

System.out.println("Two's type : " + l1.get(1).getType());

System.out.println("Three's type : " + l1.get(2).getType());

}

catch(Exception ex){

ex.printStackTrace();

}

}

}
