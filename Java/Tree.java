public class Tree {
    double heightFT;
    double trunkDm;
    TreeType treeType;

    Tree(double heightFT, double trunkDm, TreeType treeType){
        this.heightFT = heightFT;
        this.treeType = treeType;
        this.trunkDm = trunkDm;
    }
    void grow(){
        this.heightFT = this.heightFT+10;
        this.trunkDm = this.trunkDm +1;
    }
}
