package stack;

import java.util.Stack;

/**
 * @author : Gathsara
 * created : 3/5/2026 -- 8:02 PM
 **/

public class Main {
    public static void main(String[] args) {

        //in built
       /* Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(9);
        stack.push(6);
        stack.push(4);
        System.out.println(stack.peek());   //get last value
        stack.pop();    //remove last value
        System.out.println(stack);*/

        //stack implementation with static array
        /*StackImplOne stackImplOne = new StackImplOne();
        stackImplOne.push(4);
        stackImplOne.push(5);
        stackImplOne.push(6);
        stackImplOne.push(7);
        stackImplOne.push(8);
        System.out.println(stackImplOne.size());
        stackImplOne.show();
        stackImplOne.pop();
        stackImplOne.show();
        System.out.println(stackImplOne.peek());
        System.out.println(stackImplOne.size());
        System.out.println(stackImplOne.isEmpty());*/

        //stack implementation with dynamic array
        StackImplTwo stackImplTwo = new StackImplTwo();
        stackImplTwo.push(3);
        stackImplTwo.push(1);
        stackImplTwo.push(9);
        stackImplTwo.push(5);
        stackImplTwo.show();
        System.out.println();
        stackImplTwo.push(7);
        stackImplTwo.show();
        System.out.println();
        stackImplTwo.pop();
        stackImplTwo.pop();
        stackImplTwo.pop();
        stackImplTwo.show();
    }
}
