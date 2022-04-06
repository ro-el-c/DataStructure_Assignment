package week6;

import java.util.ArrayList;

public class MyTree {
    private MyNode root;
    private int treeSize;

    MyTree(){
        this.root = null;
        this.treeSize = 0;
    }
    MyTree(Object obj){
        this.root = new MyNode(obj);
        this.treeSize = 1;
        this.root.setChildren(new ArrayList());
    }

    public int size(){
        return this.treeSize;
    }

    public MyNode root(){
        return this.root;
    }

    public ArrayList children(MyNode v){
        return v.children();
    }

    public boolean isExternal(MyNode v){
        return v.children().size() == 0;
    }

    public MyNode addroot(Object obj){
        this.root = new MyNode(obj);
        this.treeSize = 1;
        this.root.setChildren(new ArrayList());

        return this.root;
    }

    public MyNode addNode(Object obj){
        MyNode newNode = new MyNode(obj);
        newNode.setParent(this.root);
        newNode.setChildren(new ArrayList());
        this.root.children().add(newNode);
        this.treeSize++;
        return newNode;
    }

    public MyNode addChild(MyNode v, Object obj){
        MyNode newNode = new MyNode(obj);
        newNode.setParent(v);
        newNode.setChildren(new ArrayList());
        v.children().add(newNode);
        this.treeSize++;
        return newNode;
    }

    public MyNode addChild(MyNode v, int i, Object obj){
        MyNode newNode = new MyNode(obj);
        newNode.setParent(v);
        newNode.setChildren(new ArrayList());
        v.children().add(i, newNode);
        this.treeSize++;
        return newNode;
    }

    public MyNode setChild(MyNode v, int i, Object obj){
        MyNode newNode = new MyNode(obj);
        v.children().add(i, newNode);
        newNode.setChildren(new ArrayList());
        v.children().set(i, newNode);
        return newNode;
    }

    public MyNode removeChild(MyNode v, int i){
        return (MyNode)v.children().remove(i);
    }

    public boolean isRoot(MyNode v){
        return v.parent() == null;
    }

    public int depth(MyTree t, MyNode v){
        if(t.isRoot(v))
            return 0;
        else
            return 1 + depth(t, v.parent());
    }
}
