package week6;

public class TreePostorder {
    private static MyTree tree = new MyTree("cs16/");
    private static int num=0, totalNum=0;

    public static void postOrder(MyNode v){
        if(v.children() == null)
            return;

        for(Object obj : v.children()){
            postOrder((MyNode)obj);
        }

        if(tree.isExternal(v)){
            int temp = tree.depth(tree, v);
            num += (int)((Object[])v.element())[1];
            totalNum += (int)((Object[])v.element())[1];
        }
        else if(tree.isRoot(v))
            System.out.printf("%s = %dKB\n", v.element().toString(), totalNum);
        else{
            System.out.printf("%s = %dKB\n", v.element().toString(), num);
            num=0;
        }
    }
    public static void main(String[] args) {
        MyNode hw = tree.addNode("homeworks/");
        MyNode pg = tree.addNode("programs/");
        tree.addNode(new Object[]{"todo.txt", 1});

        tree.addChild(hw, new Object[]{"h1c.doc", 3});
        tree.addChild(hw, new Object[]{"h1nc.doc", 2});

        tree.addChild(pg, new Object[]{"DDR.java", 10});
        tree.addChild(pg, new Object[]{"Stocks.java", 25});
        tree.addChild(pg, new Object[]{"Robot.java", 20});

        postOrder(tree.root());
    }
}
