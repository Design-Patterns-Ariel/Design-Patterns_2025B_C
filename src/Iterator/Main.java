package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(){{
            for (int i = 0; i < 10; i++) {
                add(i);
            }

        }};

        Iterator<Integer> iterLL = ll.iterator();

        while(iterLL.hasNext())
            System.out.println(iterLL.next());

        System.out.println(iterLL.next());

        Numbers<Integer> numbers = new Numbers<Integer>();

        Iterator<Integer> iter = numbers.iterator();
    if(iter.hasNext())
        System.out.println(iter.next());

        while(iter.hasNext()){

            System.out.println(iter.next());

        }
    }
}

