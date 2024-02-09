import java.util.*;

public class BpmCompare implements Comparator<SongV3>{

public int compare(SongV3 one,SongV3 two){

	return one.getBpm() > two.getBpm() ? 0 : 1;

}

}
