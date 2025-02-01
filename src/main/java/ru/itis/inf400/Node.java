package ru.itis.inf400.theory2;

public class Node implements ITree{
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }

    public String toString() {
        return String.valueOf(value);
    }
}
