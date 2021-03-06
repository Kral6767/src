package day14_String;

import java.util.Arrays;

public class SubstringEx3 {
    public static void main(String[] args) {
        String str1="Java is fun, Java is cool, I love Java";
        String word1=str1.substring(0,str1.indexOf(","));
        System.out.println(word1); //Java is fun

        String word2=str1.substring(str1.indexOf(" J")+1,str1.lastIndexOf(","));
        System.out.println(word2);//Java is cool

        String word3=str1.substring(str1.indexOf(" I")+1);
        System.out.println(word3);//I love Java
        String[]strings =str1.split(" ");

        // self study
        System.out.println(Arrays.toString(strings));
        int count=0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("Java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
