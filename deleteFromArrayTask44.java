import java.util.Scanner;

public class deleteFromArrayTask44 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion\n");
        int[] numArr =ArrayUtility.inputArray();
        System.out.println("Now enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr,numToDelete);
        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArr);

    }


    public static int[]  deleteNumber(int[] numArr, int numToDelete){
         int occ =occurrenceArrayTask41.numOfOccurrences(numArr,numToDelete);
         if (occ == 0){
             return numArr;
         }

         int newSize = numArr.length - occ;
         int[] newArr = new int[newSize];

         int i = 0 ,j = 0;
         while (i < numArr.length){
             if (numArr[i] != numToDelete){
                 newArr[j] = numArr[i];  //we successfully copied the element
                 j++;
             }
             i++;
         }
         return newArr;
    }
}
