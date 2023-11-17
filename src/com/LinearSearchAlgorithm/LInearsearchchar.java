package com.LinearSearchAlgorithm;
import java.util.*;

public class LInearsearchchar {
    public static void main(String[] args) {
        String name = "nandish";
        char ch = 'd';
        int ans = linear3(name,ch);

        System.out.println(ans);



        System.out.print(Arrays.toString(name.toCharArray()));
    }

    static int linear3(String Name, char C) {
        if (Name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < Name.length(); i++) {

            if (C == Name.charAt(i)) {
                return i;
            }


        }
        return -1;
    }
}


