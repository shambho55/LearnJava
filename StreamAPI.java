import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI{

public static void main(String[] args){

List<String> strings = List.of("I","am","a","list","of","Strings");

Stream<String> stream = strings.stream();

Stream<String> limit = stream.limit(4);

//System.out.println(limit);

//long result = limit.count();

//System.out.println("result = " + result);

//List<String> result = limit.collect(Collectors.toList());

//System.out.println("result = " + result);

//List<String> result = strings.stream()
//			     .limit(4)
//			     .collect(Collectors.toList());

//System.out.println("result = " + result);

//List<String>  result = strings.stream()
//			      .sorted()
//                              .limit(4)
//                             .collect(Collectors.toList());

//System.out.println("result = " + result);

/*List<String> result = strings.stream()
                             .sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
                             .limit(4)
                             .collect(Collectors.toList());

System.out.println("result = " + result);
*/

/*
List<String> result = strings.stream()
			     .sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
			     .skip(2)
			     .limit(4)
                             .collect(Collectors.toList());

System.out.println("result = " + result);
*/

//List<String> result = limit.collect(Collectors.toList());
//List<String> result2 = limit.collect(Collectors.toList());

List<String> result = strings.stream()
			     .limit(4)
			     .collect(Collectors.toList());

System.out.println("Strings = " + strings);

System.out.println("result = " + result);

}

}
