package mangsonguyen;
import java.util.Arrays;
import java.util.Stack;
public class StackTest {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9, 0};
        pushs(array);
        System.out.println(pushs(array));
        pops(pushs(array), array);
    }


        public static Stack pushs(int[] arr) {
            java.util.Stack<Integer> stack1 = new Stack<>();
            for (int j : arr) {
                stack1.push(j);
            }
            return stack1;
        }

        public static void pops(Stack st, int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) st.pop();
            }
            System.out.println(Arrays.toString(arr));
        }
    }
