import java.util.Arrays;
public class Grafo 
{

	public static void main(String[] args)
	{
    /*fileParser test = new fileParser();
    test.parseIn();
    //test.printNodeList();
    Tree myTestTree = new Tree();
    myTestTree.insertNodesInTree(test.getNodeList()); 
    //test.printNodeList();
    TreeParser Tparser = new TreeParser(myTestTree.getHeadList());
    Tparser.parseTree();
    */
    ArrayFileParser boom = new ArrayFileParser();
    boom.parseIn();
    int[][] tick = boom.getNodeArray();

    NodeArrayParser myparser = new NodeArrayParser(tick);
    myparser.parseArray();

    myparser.printSolution();
	}

}
