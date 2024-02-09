import java.util.*;
import java.util.stream.Collectors;

class SongSearch{

private final List<Song> songs = new Songs().getSongs();

void printTopFiveSongs(){

List<String> topFive = songs.stream()
			    .sorted(Comparator.comparingInt(Song::getTimesPlayed))
			    .map(Song -> Song.getTitle())
			    .limit(5)
			    .collect(Collectors.toList());

System.out.println(topFive);

}

void search(String artist){

Optional<Song> result = songs.stream()
			     .filter(Song -> Song.getArtist().equals(artist))
			     .findFirst();

if(result.isPresent()){

System.out.println(result.get().getTitle());

}

else{

System.out.println("No songs found by: " + artist);

}

}

}
