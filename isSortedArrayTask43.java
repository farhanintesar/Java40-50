public class isSortedArrayTask43 {
    public static void main(String[] args){
        System.out.println("Welcome to Array Sorting checkpost.");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isdec = isDecreasing(numArr);
        if (isInc || isdec){
            System.out.println("Your Array is sorted.");
        } else {
            System.out.println("Your Array is not sorted.");
        }

    }

    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while (i < numArr.length){
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while (i < numArr.length){
            if (numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }




}
