package Lesson11;

import java.util.Stack;

public class StackReverseString {
    public static void main(String[] args) {
    String str = "uoyevoli";
    Stack<Character> stack = new Stack<>();
    char[] chars = str.toCharArray();

    for(int i = 0; i< chars.length;i++) {
        stack.push(chars[i]);
        }
        System.out.println(stack);

    for(int i = 0; i< chars.length; i++){
        chars[i] = stack.pop();
        }

    str = new String(chars);
    System.out.println(str);
    }
}
