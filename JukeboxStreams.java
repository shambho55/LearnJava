import java.util.*;
import java.util.stream.Collectors;

public class JukeboxStreams{

public static void main(String[] args){

List<Song> songs = new Songs().getSongs();

/*List<Song> rockSongs = songs.stream()
		.filter((song) -> song.getGenre().equals("Rock"))
		.collect(Collectors.toList());

System.out.println(rockSongs);
*/

/*
List<Song> rockSongs = songs.stream()
			    .filter((song) -> song.getGenre().contains("Rock"))
			    .collect(Collectors.toList());

System.out.println(rockSongs);
*/

/*
List<Song> beatlesSong = songs.stream()
			      .filter((song) -> song.getArtist().equals("The Beatles"))
			      .collect(Collectors.toList());

System.out.println(beatlesSong);
*/

/*
List<Song> startsWithH = songs.stream()
			      .filter((song) -> song.getTitle().startsWith("H"))
			      .collect(Collectors.toList());

System.out.println(startsWithH);
*/

/*
List<Song> mostRecent1995 = songs.stream()
				 .filter((song) -> song.getYear() > 1995)
				 .collect(Collectors.toList());

System.out.println(mostRecent1995);
*/

/*
List<String> genres = songs.stream()
			   .map(song -> song.getGenre())
			   .collect(Collectors.toList());

System.out.println(genres);
*/

/*
List<String> genres = songs.stream()
			   .map(song -> song.getGenre())
			   .distinct()
			   .collect(Collectors.toList());

System.out.println(genres);
*/

/*
String songTitle = "With a Little Help from My Friends";

List<String> result = songs.stream()
			      .filter(song -> song.getTitle().equals(songTitle))
			      .map(song -> song.getArtist())
			      .filter(artist -> !artist.equals("The Beatles"))
			      .collect(Collectors.toList());

System.out.println(result);
*/

/*
List<Song> result = songs.stream()
			 .sorted((o1,o2) -> o1.getYear() - o2.getYear())
			 .collect(Collectors.toList());

System.out.println(result);
*/

/*
List<Song> result = songs.stream()
			 .sorted(Comparator.comparingInt(Song::getYear))
			 .collect(Collectors.toList());

System.out.println(result);
*/

/*
Set<String> genres = songs.stream()
			  .map(song -> song.getGenre())
			  .collect(Collectors.toSet());

System.out.println(genres);
*/

/*
boolean result = songs.stream()
		      .anyMatch(s -> s.getGenre().equals("R&B"));

System.out.println(result);

Optional<Song> results = songs.stream()
			     .filter(s -> s.getYear() == 1995)
			     .findFirst();

System.out.println(results);
*/

/*
long result = songs.stream()
		   .map(Song::getArtist)
		   .distinct()
		   .count();

System.out.println(result);
*/

Optional<String> result = songs.stream()
			       .sorted()
 			       .map(Song::getTitle)
			       .findFirst();

System.out.println(result);


}

}
