import java.util.*;

class MixForLoops{

public static void main(String[] args){

List<Integer> nums = List.of(1,2,3,4,5);

String output = "";

/*
for(int i = 1;i < nums.size();i++){

output += nums.get(i) + " ";

}
*/

/*
for(Integer num : nums){

output += nums + " ";

}
*/

/*
for(int i = 0;i <= nums.length;i++){

output += nums.get(i) + " ";

}
*/

/*
for(int i = 0;i <= nums.size();i++){

output += nums.get(i) + " ";

}
*/

nums.forEach((num) -> System.out.print(num + " "));

System.out.println(output);

}

}
