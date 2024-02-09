import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int maxi = 0;
            for(int i = 0;i < s.length();i++){
                maxi = Math.max(maxi,(int)s.charAt(i));
            }
            boolean caught = false;
            String ans = "";
            for(int i = 0;i < s.length();i++){
                if((int)s.charAt(i) == maxi && !caught){
                    caught = true;
                }
                else{
                    ans += s.charAt(i);
                }
            }
            System.out.println(ans);
            t--;
        }
	}
}
