import java.util.*;

public class Jukebox5{

public static void main(String[] args){

new Jukebox5().go();

}

public void go(){

List<SongV3> songList = MockSongs.getSongsV3();

System.out.println(songList);

//TitleCompare titleCompare = new TitleCompare();

//songList.sort(titleCompare);

FooBar foobar = new FooBar();

songList.sort(foobar);

System.out.println(songList);

ArtistCompare artistCompare = new ArtistCompare();

//System.out.println(songList);

songList.sort(artistCompare);

System.out.println(songList);


}

}
