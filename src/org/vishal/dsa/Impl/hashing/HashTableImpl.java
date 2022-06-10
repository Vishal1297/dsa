package org.vishal.dsa.Impl.hashing;

import java.util.ArrayList;
import java.util.Objects;

public class HashTableImpl<K, V> {

    private ArrayList<HashNode<K, V>> buckets;
    private Integer capacity;
    private Integer size;

    public HashTableImpl() {
        this(10);
        this.size = 0;
        // Create empty chains
        for (int i = 0; i < capacity; i++)
            buckets.add(null);
    }

    public HashTableImpl(int capacity) {
        this.capacity = capacity;
        this.buckets = new ArrayList<>();
        this.size = 0;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode (K key) {
        return Objects.hashCode(key);
    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = buckets.get(bucketIndex);
        while (head != null){
            if (head.key.equals(key) && head.hashCode == hashCode){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = buckets.get(bucketIndex);
        while (head != null){
            if (head.key.equals(key) && head.hashCode == hashCode){
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = buckets.get(bucketIndex);
        HashNode<K, V> node = new HashNode<>(key, value, hashCode);
        node.next = head;
        buckets.set(bucketIndex, node);

        if ((1.0 * size) / capacity >= 0.7) {
            ArrayList<HashNode<K, V>> temp = buckets;
            buckets = new ArrayList<>();
            capacity *= 2;
            size = 0;

            for (int i = 0; i < capacity; i++) {
                buckets.add(null);
            }

            for(HashNode<K, V> headNode : temp){
                while (headNode != null){
                    put(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = buckets.get(bucketIndex);
        HashNode<K, V> prevHead = null;

        while (head != null){
            if (head.key.equals(key) && head.hashCode == hashCode){
                break;
            }
            prevHead = head;
            head = head.next;
        }

        if (head == null)
            return null;

        size--;

        if (prevHead != null)
            prevHead.next = head.next;
        else
            buckets.set(bucketIndex, head.next);

        return head.value;
    }

    private int getBucketIndex(K key)
    {
        int index = hashCode(key) % capacity;
        // key.hashCode() could be negative.
        return index < 0 ? index * -1 : index;
    }

    private static class HashNode<K, V> {
        K key;
        V value;
        HashNode<K, V> next;
        final int hashCode;

        public HashNode(K key, V value, int hashCode) {
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
        }
    }

    /**
     * Runner method
     */
    public static void main(String[] args) {
        HashTableImpl<Integer, String> hashTable = new HashTableImpl<>();
        System.out.println("size of hashtable " + hashTable.getSize());
        System.out.println("capacity of hashtable " + hashTable.getCapacity());
        hashTable.put(2,"a");
        hashTable.put(3,"b");
        System.out.println("Is hashtable empty : " + hashTable.isEmpty());
        System.out.println("size of hashtable " + hashTable.getSize());
        System.out.println("removed value " + hashTable.remove(3));;
        System.out.println(hashTable.get(2));
    }
}
