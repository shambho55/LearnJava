import java.util.*;

public class Jukebox7{

public static void main(String[] args){

new Jukebox7().go();

}

public void go(){

List<SongV3> songList = MockMoreSongs.getSongsV3();

System.out.println(songList);

songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));

System.out.println(songList);

songList.sort((one,two) -> one.getArtist().compareTo(two.getArtist()));

System.out.println(songList);

BpmCompare bpmCompare = new BpmCompare();

songList.sort(bpmCompare);

for(SongV3 s:songList){

System.out.print(s.getBpm() + " ");

}

System.out.println();
//songList.sort((one,two) -> compare(one.getBpm(),two.getBpm()));

System.out.println(songList);

}

}
