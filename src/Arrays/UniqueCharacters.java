package Arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

    Map<Character,Integer>map = new HashMap<>();


    int count=0;
    public boolean uniqueCharacters(String s){

        //base case
        if (s.length()==1){
            return true;
        }

        if (s.length()==0){
            return false;
        }
        char[]ch = s.toCharArray();
        for (int i=0;i<ch.length;i++){

            if (map.containsKey(ch[i])){
                return false;

            }else{
                map.put(ch[i],1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueCharacters ut = new UniqueCharacters();
        String str="tejas";
        System.out.println(ut.uniqueCharacters(str));
    }
}
