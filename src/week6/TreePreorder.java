package week6;

public class TreePreorder {
    static MyTree tree = new MyTree("Make Money Fast!");

    public static void preOrder(MyNode v){
        for(int i=0; i<tree.depth(tree, v); i++)
            System.out.print("  ");

        System.out.println(v.element());

        if(v.children() == null)
            return;

        for(Object obj : v.children()){
            preOrder((MyNode)obj);
        }
    }
    public static void main(String[] args) {

        MyNode motivations = tree.addNode("1. Motivations");
        MyNode methods = tree.addNode("2. Methods");
        MyNode references = tree.addNode("3. References");

        MyNode greed = tree.addChild(motivations, "1.1 Greed");
        MyNode avidity = tree.addChild(motivations, "1.2 Avidity");
        MyNode stockFraud = tree.addChild(methods,"2.1 Stock Fraud");
        MyNode ponziScheme = tree.addChild(methods,"2.2 Ponzi Scheme");
        MyNode bankRobbery = tree.addChild(methods,"2.3 Bank Robbery");

        preOrder(tree.root());
    }
}
