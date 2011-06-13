
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
    myTestTree.print();

    System.out.println("\nEND OF PROG");
	}

}
