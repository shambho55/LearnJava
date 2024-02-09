import java.util.*;

public class isPalindrome{

private static boolean isPalindromeFunc(String s){

int n = s.length();

boolean check = true;

for(int i = 0,j = n - 1;i < j;i++,j--){

if(s.charAt(i) != s.charAt(j)){

check = false;

break;

}

}

return check;

}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

String s = sc.next();

boolean ans = isPalindromeFunc(s);

System.out.println("Is String Palindrome ? " + ans);

}

}
