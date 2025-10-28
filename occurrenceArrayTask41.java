import java.util.Scanner;

public class occurrenceArrayTask41 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array occurrence\n");
        int[] numArr =ArrayUtility.inputArray();  //accessing inputArray method from array utility
                                                   //we use this to input an array
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = numOfOccurrences(numArr,num);
        System.out.println("Your number is found " + occurrences + " times in the array.");

    }

    public static int numOfOccurrences(int[] numArr , int num){  //it doesn't necessarily need to same as before
               int occ = 0;
               int i = 0;
               while (i < numArr.length){
                   if (numArr[i] == num){
                       occ++;
                   }
                   i++;
               }

        return occ;
    }
}
