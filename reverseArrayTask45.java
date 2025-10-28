public class reverseArrayTask45 {
    static void main(String[] args) {
        System.out.println("Welcome to reverse array\n");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("your REVersed ARRAY is ");
        ArrayUtility.displayArray(numArr);
    }
    public static void reverse (int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];                   //here i stored the first element
            arr[i] = arr [(arr.length -1) -i];   //replaced the first element with the last
            arr [(arr.length -1) -i] = swap;     //making last element with first elament
            i++;
        }

    }

}
