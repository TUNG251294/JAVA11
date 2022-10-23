package Lesson11;

import java.util.Arrays;
import java.util.Stack;

public class StackReverseInt {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13};
        Stack<Integer> stack = new Stack<>();
        for(int e: arr){
            stack.push(e);
        }

        for(int i = 0; i< arr.length;i++){
            arr[i] = stack.pop();
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
