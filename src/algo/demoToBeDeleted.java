package algo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

//If I have a list containing [alice, bob, abigail, charlie] and I want to write
// an iterator such that it iterates
// over elements that begin with 'a'
public class demoToBeDeleted {
    public static void main(String[] args) {
        String[] arr = new String[]{"alice", "bob", "abigail", "charlie"};
        myIterator<String> itr  = (myIterator<String>) new myIterator(arr).iterator();
        

    }

}

class myIterator<E> implements Iterable<E> {
    private E[] arr;
    private int size;

    public myIterator(E[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size - 1 && arr[currentIndex] != null;
            }

            @Override
            public E next() {
                return arr[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return iterator;

    }

}
