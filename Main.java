package Task7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// Program to reverse a string in java
        reverseString();
        //Program to find the first non-repeated character in the String
        firstNonRepeated();
       // Program to find the intersection of two arrays in java
        intersection();
      //  Program to find if String has all Unique Characters?
        String a = "hhgfdshuudhf";
        String b = "hadgreoka";
        String c = "hegfmndsj";
        System.out.println();
        System.out.println(uniqueCharacters(a));
        System.out.println(uniqueCharacters(b));
        System.out.println(uniqueCharacters(c));
        //Program to Count the number of words in the String
        String countString = "India is a Democratic country.";
        System.out.println( "Count is: " +  countStringWords(countString));
// find Armstrong number
        int number = 123;
        System.out.println(armstrong(number));
          //Print all permutations of the String or combination of string using recursion
        String word = "abc";
        String[] Array = word.split("");
        permutation(Array,Array.length);

    }
    public static void reverseString(){
            String a= "National";
            for(int i=a.length()-1;i>=0;i--)
            {
                System.out.print(a.charAt(i));//charAt() so that it return the index for i

            }
        System.out.println();
        }
        public static void firstNonRepeated(){
        String a = "aanghhger";
         for (int i =0;i<a.length();i++){
             boolean singleCharacter = true;
             for(int j=0; j<a.length();j++){
                 if(i!= j && a.charAt(i)== a.charAt(j)){
                   singleCharacter = false;
                   break;
                 }
             }
             if(singleCharacter){
                 System.out.println(a.charAt(i));
                 break;
             }
         }
        }
        public static void intersection(){
        String a ="aabhgyt";
        String b = "gjjtcfr";

        for(int i =0;i<a.length();i++){
            for(int j =0; j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)) {
                    System.out.print(a.charAt(i));
                }
                }
           }
        }
        public static boolean uniqueCharacters(String x){
        Set<Character> set = new HashSet<>();
        for(Character c: x.toCharArray()){
            if(set.contains(c)){
                return false;
            }
              set.add(c);
        }
        return true;
        }




    public static int countStringWords(String str) {
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            // If the current char is space and next char is not a space then increment count
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        return count;
    }
    public static int armstrong(int x)
    {
        int count = 0;

        for(int i = 1; i <= Integer.MAX_VALUE; i++)
        {
            int number = i, remaing, digit = 0, total = 0;

            //Copy the value for num in num
            number = i;

            // Find total digits in num
            digit = (int) Math.log10(number) + 1;

            // Calculate sum of power of digits
            while(number > 0)
            {
                remaing = number % 10;
                total = total + (int)Math.pow(remaing, digit);
                number = number / 10;
            }

            // Check for Armstrong number
            if(i == total)
                count++;
            if(count == number)
                return i;
        }
        return x;
    }
    private static void swap(String[] array, int right, int left) {
        String temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    public static void permutation(String[] Array, int currentPosition) {
        if (currentPosition == 1) {
            System.out.println(Arrays.toString(Array));
        } else {
            for (int i = 0; i < currentPosition; i++) {
                // subtract one from the last position (here is where you are
                // selecting the the next last item
                permutation(Array, currentPosition - 1);

                // if it's odd position
                if (currentPosition % 2 == 1) {
                    swap(Array, 0, currentPosition - 1);
                } else {
                    swap(Array, i, currentPosition - 1);
                }
            }
        }
    }




}



