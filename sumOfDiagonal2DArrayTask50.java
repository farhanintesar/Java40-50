public class sumOfDiagonal2DArrayTask50 {


    public static void main (String[] args){
        System.out.println("Welcome to diagonal sum\n");
        int [][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println("Sum of diagonals is : " + sum);
    }

    public static long sumOfDiagonals(int[][] numArr){
        long leftSum = sumOfLeftDiagonals(numArr);
        long rightSum = sumOfRightDiagonals(numArr);
        long sum = leftSum + rightSum ;
        if (numArr.length % 2 != 0) {
            int index = numArr.length/2;
            sum -= numArr[index][index];
        }

        return sum;

    }
    public static long sumOfLeftDiagonals(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;

    }
    public static long sumOfRightDiagonals(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < (numArr.length )) {  // (numArr.length - 1)  means last index
            int col = numArr.length -1 -i;
            sum += numArr[i][col] ;
            i++;
        }
        return sum;
    }


}
