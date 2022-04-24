package OOP;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Container<E> implements Collection<E> {

    List<E> newCustomList;
    private int numberOfChanges;

    public int getNumberOfChange() {
        return numberOfChanges;
    }

    public Container() {
        this.newCustomList = new LinkedList<>();
        this.numberOfChanges = 0;
    }

    @Override
    public int size() {
        return 0;
    }

    public void printArray(){
        for (E value : newCustomList){
            System.out.println(value);
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(E addValue) {
        try {
            newCustomList.add(addValue);
            numberOfChanges++;
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean remove(Object o) {
        try {
            newCustomList.remove(o);
            numberOfChanges++;
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }


    
}
