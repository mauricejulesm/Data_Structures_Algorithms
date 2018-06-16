/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

/**
 *
 * @author Admin_M
 */
public class Palidrome {

    public static void main(String[] args) {

        //checking one word
        String word = "12321";
        if(checkPelidrome(word)){
            System.out.println("Correct, \"" + word + "\" is a Pelidrondrome!");
        }
        System.out.println("Sorry, \"" + word + "\" is not a Pelidrondrome!");
        

        //revealing pelidromes between x and y ex: 100 and 1000;
        randomPelidromes();
    }

    public static boolean checkPelidrome(String word) {
        char[] charArray = word.toCharArray();

        int v1 = 0;
        int v2 = charArray.length - 1;

        while (v2 > v1) {
            if (charArray[v1] != charArray[v2]) {
                //System.out.println("Sorry, \"" + word + "\" is not a Pelidrondrome!");

                return false;
            }

            v1++;
            v2--;
        }
        //System.out.println("Correct, \"" + word + "\" is a Pelidrondrome!");

        return true;
    }

    private static void randomPelidromes() {
        int count =0;

        for(int i = 700; i <= 801; i++) {
            if(checkPelidrome(Integer.toString(i))){
                System.out.println("" + i+ " is a pelidrome");
                count++;
            }
            //System.out.println("" + i+ " is not pelidrome");
        }
           System.out.println("Number of pelidromes found= "+count);
 
    }
}
