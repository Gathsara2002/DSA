package stack;

/**
 * @author : Gathsara
 * created : 3/5/2026 -- 8:07 PM
 **/

public class StackImplOne {

    int[] arr = new int[5];
    int top = 0;

    public void push(int value) {
        arr[top] = value;
        top++;
    }

    public void show(){
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
