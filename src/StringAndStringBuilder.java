import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        StringBuilder strg = new StringBuilder();
        String str ="";
        String name = "aBcdcba";
        System.out.println(ispalindrome(name));
        System.out.println(name.indexOf('d'));
        for(int i = 0;i<26;i++){
            char ch = (char)('a' + i);
            str = str+ch;
            strg.append(ch);

        }
        System.out.println(strg);
        System.out.println(str);
        System.out.println("a"+'b');
        System.out.println("b"+1);
        System.out.println("c" + new ArrayList<>());
        System.out.println(new ArrayList<>() + "" + new ArrayList<>());
    }
    static boolean ispalindrome(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }




}

