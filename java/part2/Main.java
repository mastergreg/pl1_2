
public class Main
{

	public static void main(String[] args)
	{
    fileParser test = new fileParser();
    test.parseIn();
    test.printNodeArray();
    int nodes = test.getNodes();
    int[][] nodesforTree = test.getNodeArray();
    Tree myTestTree = new Tree();
    myTestTree.insertNodesInTree(test.getNodeList()); 
    myTestTree.print();

	}

}
