package org.vishal.dsa.Impl.array;

public class ArrayListImpl {

    private int[] arr;
    private int capacity;
    private int current;

    public ArrayListImpl(){
        arr = new int[1];
        capacity = 1;
        current = 0;
    }

    public void push(int element){
        if (current == capacity){
            int[] temp = new int[2 * capacity];
            if (capacity >= 0) System.arraycopy(arr, 0, temp, 0, capacity);
            capacity *= 2;
            arr = temp;
        }
        arr[current] = element;
        current++;
    }

    public void push(int element, int index) {
        if (current == capacity){
            push(element);
        }else {
            arr[index] = element;
        }
    }

    public int get(int index){
        if (index > - 1 && index < current){
            return arr[index];
        }
        return -1;
    }

    public int pop(){
        if (current > 0){
            int element = arr[current - 1];
            arr[current - 1] = 0;
            current--;
            return element;
        }
        return -1;
    }

    public int size(){
        return current;
    }

    public int getCapacity(){
        return capacity;
    }

    public void print(){
        for (int i = 0; i < current; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayListImpl arrayList = new ArrayListImpl();
        System.out.println("get at index : " + arrayList.get(1));
        System.out.println("capacity : " + arrayList.getCapacity());
        arrayList.push(1);
        arrayList.push(11);
        System.out.println("capacity : " + arrayList.getCapacity());
        System.out.println("size : " + arrayList.size());
        arrayList.push(13);
        arrayList.push(15);
        arrayList.push(18);
        System.out.println("capacity : " + arrayList.getCapacity());
        System.out.println("size : " + arrayList.size());
        System.out.println("get at index : " + arrayList.get(0));
        System.out.println("pop : " + arrayList.pop());

        arrayList.print();
    }
}
