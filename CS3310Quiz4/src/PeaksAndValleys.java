//Samuel Shin
//Quiz 4, Question 1: Peaks and Valleys

public class PeaksAndValleys {
    public static void main(String[] args){
        PeaksAndValleys pv = new PeaksAndValleys();
        int[] arr = {4,3,7,1,1,7,4,7,0,6,54,-34,7,36,7};
        int len = arr.length;
        pv.peakAndValley(arr, len);
        for(int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");

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
}
