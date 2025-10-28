public class MargeTwoSortedArrayTask47 {
    static void main(String[] args) {
        System.out.println("Welcome to Merging Sorted Arrays\n");
        int[] arr1 =ArrayUtility.inputArray();
        int[] arr2 =ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1,arr2);
        System.out.println("Your merged array is: ");
        ArrayUtility.displayArray(mergedArr);
    }




public static int[] merge(int[] arr1,int[] arr2) {
    int[] newArr = new int[arr1.length + arr2.length] ;

    for(int i = 0 ; i< arr1.length ; i++ ) {
         newArr[i]=arr1[i];
    }
    for(int i = 0 ; i < arr2.length ; i++){
        newArr[i + arr1.length] =arr2[i];
    }

    return newArr;
}




    // public static int[] merge(int[] arr1,int[] arr2){
    //     int newSize = arr1.length + arr2.length ;
    //     int[] newArr = new int[newSize];

    //     int i = 0, j = 0,k = 0;
    //     while (i < arr1.length || i< arr2.length){
    //         if ( j == arr2.length ||
    //                 (i < arr1.length && arr1[i] < arr2[j]) ) {
    //             newArr[k] = arr1[i];
    //             i++;  
    //             k++;
    //         } else {
    //             newArr[k] = arr2[j];
    //             k++;
    //             j++;
    //         }
    //     }

    // return newArr;
    // }
}
