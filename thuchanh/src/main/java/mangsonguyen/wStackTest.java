package mangsonguyen;

import java.util.Arrays;
import java.util.Stack;

public class wStackTest {
    public static void main(String[] args) {
        String s = "thu sau ngay 13";
        System.out.println(s);
        System.out.println("sau khi dao nguoc");
        System.out.println(turn(s));
    }

    public static String turn(String str) {
        Stack<String> stack1 = new Stack<>();

        String[] arr = str.split(" ");

        for (String j : arr) {
            stack1.push(j);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack1.pop();
        }
        return Arrays.toString(arr);
    }

//    public static void pops(Stack st, int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) st.pop();
//        }
//        System.out.println(Arrays.toString(arr));
//    }
}
