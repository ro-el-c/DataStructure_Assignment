package week7;

public class MainBinTree {
    public static void main(String[] args) throws Exception {
        MyBinTree mbt = new MyBinTree();
        mbt.addRoot("+");
        mbt.addNode("X");
        mbt.addNode("X");
        mbt.insertLeft(mbt.root().left(), "2");
        mbt.insertRight(mbt.root().left(), "-");
        mbt.insertLeft(mbt.root().left().right(), "3");
        mbt.insertRight(mbt.root().left().right(), "1");
        mbt.insertLeft(mbt.root().right(), "3");
        mbt.insertRight(mbt.root().right(), "2");

        mbt.inOrder(mbt.root());
        System.out.print("\n= ");
        System.out.println(mbt.postOrder(mbt.root()));
    }
}
