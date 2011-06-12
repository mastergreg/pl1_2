public class Node
{
	private int data = 0;
	private Node right;
	private Node left;
	public Node(int me,Node r,Node l)
	{
		data=me;
		right = r;
		left = l;
	}
	public int getData()
	{
		return data;
	}
	public void setData(int iD)
	{
		data = iD;
	}
	public Node getRight()
	{
		return right;
	}
	public void setRight(Node right)
	{
		this.right = right;
	}
	public Node getLeft()
	{
		return left;
	}
	public void setLeft(Node left)
	{
		this.left = left;
	}
	
}
