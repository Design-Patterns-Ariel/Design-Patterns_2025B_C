package Iterator;

import java.util.Iterator;
import java.util.Random;

public class Numbers<E> {

    private Object[] numbers;

    public Numbers() {
        this.numbers = new Object[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = new Random().nextInt(90000) + 10000;
        }
    }

    Iterator<E> iterator(){

        return new Iterator<E>() {

            int index=0;
            @Override
            public boolean hasNext() {
                return index<numbers.length;
            }

            @Override
            public E next() {
                E item = (E)numbers[index++];
                return item;
            }
        };




    }

}
