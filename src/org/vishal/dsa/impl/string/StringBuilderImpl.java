package org.vishal.dsa.impl.string;

public class StringBuilderImpl {

    private char[] internalBuffer;
    private int length;
    private int capacity;

    public StringBuilderImpl() {
        capacity = 10;
        length = 0;
        this.internalBuffer = new char[capacity];
    }

    @Override
    public String toString() {
        return new String(internalBuffer, 0, length);
    }

    public StringBuilderImpl append(String string) {
        char[] charArray = string.toCharArray();
        ensureInternalCapacity(charArray.length);
        for (char c : charArray) {
            internalBuffer[length] = c;
            length++;
        }
        return this;
    }

    private void ensureInternalCapacity(int lengthRequired) {
        while (length + lengthRequired > capacity) expandInternalBuffer();
    }

    private void expandInternalBuffer() {
        capacity *= 2;
        char[] tmpBuffer = new char[capacity];
        System.arraycopy(internalBuffer, 0, tmpBuffer, 0, internalBuffer.length);
        internalBuffer = tmpBuffer;
    }

    public StringBuilderImpl append(Character ch) {
        internalBuffer[length] = ch;
        length++;
        return this;
    }

    public StringBuilderImpl deleteCharAt(int index) {
        if (index < 0 || index >= internalBuffer.length) throw new IllegalArgumentException("Invalid index");
        System.arraycopy(this.internalBuffer, index + 1, this.internalBuffer, index, this.length - index - 1);
        --this.length;
        return this;
    }

    public Boolean isEmpty() {
        return length == 0;
    }

    public Integer size() {
        return length;
    }

    public static void main(String[] args) {
        StringBuilderImpl stringBuilder = new StringBuilderImpl();
        stringBuilder.append('a').append("abc");
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);
    }
}
