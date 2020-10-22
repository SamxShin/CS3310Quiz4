//Samuel Shin
//Quiz 4, Question 1: Peaks and Valleys

import java.util.Random;

public class PeaksAndValleys {
    public static int[] anArray;

    public static void main(String[] args){
        long start, end, duration, totalDur = 0;

        PeaksAndValleys pv = new PeaksAndValleys();
        //showing that the algorithm does make it peaks and valleys
        int[] arr = {4,3,7,1,1,7,4,7,0,6};
        int len = arr.length;
        pv.peakAndValley(arr, len);
        for(int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");

        //test case for array size 100
        for(int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
        for(int i = 0; i < 100; i++){
            int arr100[] = list(100);
            int len100 = arr100.length;
            start = System.nanoTime();
            pv.peakAndValley(arr100, len100);
            end = System.nanoTime();
            duration = (end - start)/100;
            totalDur = totalDur + duration;
        }
        System.out.printf("\nAverage time to solve an array of size 100 is: %d nanoseconds",totalDur);
        totalDur = 0;


        //test case for array size 1,000
        for(int i = 0; i < 100; i++){
            int arr1000[] = list(1000);
            int len1000 = arr1000.length;
            start = System.nanoTime();
            pv.peakAndValley(arr1000, len1000);
            end = System.nanoTime();
            duration = (end - start)/100;
            totalDur = totalDur + duration;
        }
        System.out.printf("\nAverage time to solve an array of size 1,000 is: %d nanoseconds\t\t\t",totalDur);
        totalDur = 0;


        //test case for array size 10,000
        for(int i = 0; i < 100; i++){
            int arr10000[] = list(10000);
            int len10000 = arr10000.length;
            start = System.nanoTime();
            pv.peakAndValley(arr10000, len10000);
            end = System.nanoTime();
            duration = (end - start)/100;
            totalDur = totalDur + duration;
        }
        System.out.printf("\nAverage time to solve an array of size 10,000 is: %d nanoseconds\t\t",totalDur);
        totalDur = 0;


        //test case for array size 100,000
        for(int i = 0; i < 100; i++){
            int arr100000[] = list(100000);
            int len100000 = arr100000.length;
            start = System.nanoTime();
            pv.peakAndValley(arr100000, len100000);
            end = System.nanoTime();
            duration = (end - start)/100;
            totalDur = totalDur + duration;
        }
        System.out.printf("\nAverage time to solve an array of size 100,000 is: %d nanoseconds\t",totalDur);
        totalDur = 0;


        //test case for array size 1,000,000
        for(int i = 0; i < 100; i++){
            int arr1000000[] = list(1000000);
            int len1000000 = arr1000000.length;
            start = System.nanoTime();
            pv.peakAndValley(arr1000000, len1000000);
            end = System.nanoTime();
            duration = (end - start)/100;
            totalDur = totalDur + duration;
        }
        System.out.printf("\nAverage time to solve an array of size 1,000,000 is: %d nanoseconds\t",totalDur);
        totalDur = 0;

        System.out.println("\n\nTEST FOR DIFFERENT SIZED ARRAYS");
        int[] testArr50 = list(50);
        pv.peakAndValley(testArr50, testArr50.length);
        for(int i = 0; i < testArr50.length; i++)
            System.out.print(testArr50[i] + " ");

        System.out.println();

        int[] testArr100 = list(100);
        pv.peakAndValley(testArr100, testArr100.length);
        for(int i = 0; i < testArr100.length; i++)
            System.out.print(testArr100[i] + " ");

    }
    void swap(int input[], int a, int b){        //doing a swap
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
    void peakAndValley(int input[], int len){
        for(int i = 0; i < len; i += 2){  //we use i +=2 so we only focus on areas where "peaks" should be

            //we swap it if the element before is greater than current
            //under the condition if it's not the first element of the array
            if(i > 0 && input[i-1] > input[i])
                swap(input, i-1, i);

            // if the next element is bigger than the current element
            if(i < len -1 && input[i] < input[i+1])
                swap(input, i, i+1);
        }
    }
    //fill the arrays with random numbers
    public static int randomFill(){
        Random rand = new Random();
        int randomNum = rand.nextInt();
        return randomNum;
    }

    //make an array of given size and fill with random numbers
    public static int[] list(int size){
        anArray = new int[size];
        for(int i = 0; i < anArray.length; i++){
            anArray[i] = randomFill();
        }
        return anArray;
    }

}
