
public class clas {
    public static void main(String[] args) {
        Tree myfavTree = new Tree(78.0, 90.65, TreeType.OAK);
        if(myfavTree.heightFT<= 100){
            System.out.println("the tree is a short tree with the hight of ++"+ myfavTree.heightFT+ " and a diameter of   +"+ myfavTree.trunkDm);
        }
    }
    
}
