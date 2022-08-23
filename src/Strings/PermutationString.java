package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationString {



    public boolean permutationString(String s, String t){

        char[]ch1 = s.toCharArray();
        Arrays.sort(ch1);
        char[]ch2 = t.toCharArray();
        Arrays.sort(ch2);

        for (int i=0;i<ch1.length;i++)
            if (ch1[i]!=ch2[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        PermutationString ps = new PermutationString();
        String st = "tejas";
        String ts = "sajet";

        System.out.println(ps.permutationString(st,ts));
    }
}
