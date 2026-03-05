package stack;

import java.util.Stack;

/**
 * @author : Gathsara
 * created : 3/5/2026 -- 8:02 PM
 **/

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(9);
        stack.push(6);
        stack.push(4);
        System.out.println(stack.peek());   //get last value
        stack.pop();    //remove last value
        System.out.println(stack);
    }
}
