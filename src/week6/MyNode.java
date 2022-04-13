package week6;

import java.util.ArrayList;

public class MyNode {
    private Object element;
    private MyNode parent;
    private ArrayList children;

    public MyNode(){
        this.element = null;
        this.parent = null;
        this.children = null;
    }
    public MyNode(Object obj){
        this.element = obj;
        this.parent = null;
        this.children = null;
    }

    public Object element(){
        return this.element;
    }

    public MyNode parent(){
        return this.parent;
    }

    public ArrayList children(){
        return this.children;
    }

    public void setElement(Object obj){
        this.element = obj;
    }

    public void setParent(MyNode par){
        this.parent = par;
    }

    public void setChildren(ArrayList child) {
        this.children = child;
    }
}
