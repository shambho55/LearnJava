import java.util.*;

public class Jukebox4{

public static void main(String[] args){

new Jukebox4().go();

}

public void go(){

List<SongV3> songs = MockSongs.getSongsV3();

System.out.println(songs);

Collections.sort(songs);

System.out.println(songs);

ArtistCompare artistCompare = new ArtistCompare();

songs.sort(artistCompare);

System.out.println(songs);

for(SongV3 s:songs){

System.out.println(s.getArtist());

}

}

}

