import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int countJump1=0, countJump2=0;
        int countDist1=x1, countDist2=x2;
        String s="NO";
    for(int i=0; i<10000; i++){
        countDist1+=v1;
        countDist2+=v2;
        countJump1++;
        countJump2++;
            if(countJump1==countJump2 && countDist1==countDist2)
                s="YES";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
