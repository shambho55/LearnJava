import java.util.*;

public class Jukebox6{

public static void main(String[] args){

new Jukebox6().go();

}

public void go(){

List<SongV3> songList = MockSongs.getSongsV3();

System.out.println(songList);

songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));

System.out.println(songList);

songList.sort((one,two) -> one.getArtist().compareTo(two.getArtist()));

System.out.println(songList);

BpmCompare bpmCompare = new BpmCompare();

songList.sort(bpmCompare);

System.out.println(songList);

songList.sort((one,two) -> one.getBpm() - two.getBpm());

System.out.println("Sorting by BPM");

for(SongV3 s:songList){

System.out.print(s.getBpm() + " ");

}

System.out.println();


System.out.println(songList);

System.out.println("Sorting by title in descending order : ");

songList.sort((one,two) -> two.getTitle().compareTo(one.getTitle()));

System.out.println(songList);

}

}
