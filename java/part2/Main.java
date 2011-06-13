
public class Main
{

	public static void main(String[] args)
	{
    fileParser test = new fileParser();
    test.parseIn();
    test.printNodeList();
    Tree myTestTree = new Tree();
    myTestTree.insertNodesInTree(test.getNodeList()); 
    test.printNodeList();

    TreeParser Tparser = new TreeParser(myTestTree.getHeadList());
    Tparser.parseTree();
    
    //myTestTree.print();
    
    System.out.println("\nEND OF PROG");
	}

}
