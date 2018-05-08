package ua.org.oa.Hw3;


import java.util.Arrays;

public class GenericStorage<T> {
    private T[] storage;
    private int size;
    private int index;

    public GenericStorage () {
        storage = (T[]) new Object[10];
    }

    public GenericStorage(int size) {
        storage=(T[]) new Object[size];
    }


    public void add(T obj){
        storage[index]=obj;
        size++;
        if (++index==storage.length){
            T[] newStorage = (T[]) new Object [storage.length * 2];
            System.arraycopy(storage, 0, newStorage, 0, storage.length);
            storage = newStorage;
        }
    }

    public T get(int index){
        if (index >=0 && index < size) {
            if (index < storage.length)
                return storage[index];
            else
                return null;
        }
        else {
            System.out.println("Incorrect index");
            return null;
        }
    }

    public  T[] getAll(){
        System.out.println(Arrays.toString(storage));
        return storage;
    }

    public void update(int index, T obj){
        if (index >=0 && index < size) {
            if (storage[index] != null)
                storage[index] = obj;
        }
        else
            System.out.println("Incorrect index");
    }

    public void delete(int index) {
        if (index >=0 && index < size) {
            storage[index] = null;
            int numMoved = size - index - 1;
            if (numMoved > 0)
                System.arraycopy(storage, index + 1, storage, index,
                        numMoved);
            storage[--size] = null;
        }
        else
            System.out.println("Incorrect index");
    }

    public void delete(T obj) {
        for (int i = 0; i <storage.length ; i++) {
            if (storage[i]==obj)
                delete(i);
        }
    }

    public int getSize() {

        return size;
    }
}
