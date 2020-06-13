package com.pht.tree;

public class BinaryTree {
    public static void main(String[] args) {
        final int[] values = { 1, 3, 4, 5, 2, 8, 6, 7, 9, 0 };
        Node node= null;
        for (int i = 0; i < values.length; i++) {
            node= createBinaryTree(node,values[i]);
        }
        inOrderTransval(node);

    }
    //添加节点
    public static Node createBinaryTree(Node node, int value) {
        if(node == null){
            return  new Node(value);
        }
        Node newnode= new Node(value);
        if(value < node.getValue()){
            node.setLeft(createBinaryTree(node.getLeft(),value));
        }else{
            node.setRight(createBinaryTree(node.getRight(),value));
        }
        return node;
        // TODO:
    }
    //递归中序遍历
    public static void inOrderTransval(Node node) {
        if(node ==null){
            return;
        }
        inOrderTransval(node.getLeft());
        System.out.print(node.getValue()+",");
        inOrderTransval(node.getRight());
        // TODO:
    }
}
class Node {

    // 节点值
    private int value;

    // 左节点
    private Node left;

    // 右节点
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    // TODO:
}