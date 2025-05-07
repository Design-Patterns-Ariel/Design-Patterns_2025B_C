package Prototype;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() {{
            for (int i = 0; i < 10; i++) {
                add(i);
            }
        }};

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);

        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

        Stack<Integer> stCopy = new Stack<>();
        Stack<Integer> stTemp = new Stack<>();

        while (!st.isEmpty()) {
            int temp = st.pop();
            stTemp.add(temp);
        }


        while (!stTemp.isEmpty()) {
            int temp = stTemp.pop();
            st.add(temp);
            stCopy.add(temp);
        }
        System.out.println(st);
        System.out.println(stCopy);

        stCopy = (Stack<Integer>) st.clone();
    }
}
