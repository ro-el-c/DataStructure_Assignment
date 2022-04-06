package week6;

public class MainTree {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String tempStr="";

        // level 0
        MyTree tree = new MyTree("computers'R Us");

        System.out.println("[Level 0]");
        System.out.println(tree.root().element() + "\n");

        // level 1
        MyNode sales = tree.addNode("Sales");
        MyNode mf = tree.addNode("Manufacturing");
        MyNode rnd = tree.addNode("R&D");

        System.out.println("[Level 1]");
        for(Object o : tree.root().children()){
            MyNode temp = (MyNode)o;
            sb.append(temp.element() + ", ");
        }
        tempStr = sb.toString().substring(0, sb.length()-2);
        System.out.println(tempStr + "\n");

        // level 2
        MyNode us = tree.addChild(sales, "US");
        MyNode itt = tree.addChild(sales, "International");
        MyNode lt = tree.addChild(mf, "Laptops");
        MyNode dt = tree.addChild(mf, "Desktops");

        System.out.println("[Level 2]");
        System.out.println(us.element() + ", " + itt.element() + ", " + lt.element() + ", " + dt.element() + "\n");

        // level 3
        MyNode europe = tree.addChild(itt, "Europe");
        MyNode asia = tree.addChild(itt, "Asia");
        MyNode canada = tree.addChild(itt, "Canada");

        System.out.println("[Level 3]");
        System.out.print(europe.element() + ", " + asia.element() + ", " + canada.element());
    }
}
