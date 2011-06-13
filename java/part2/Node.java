public class Node
{
	private int data = 0;
  private Node fright = null;
  private Node fleft = null;
	private Node right = null;
	private Node left = null;
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
	
	public Node getFRight()
	{
		return fright;
	}
	public void setFRight(Node fright)
	{
		this.fright = fright;
	}
	public Node getFLeft()
	{
		return fleft;
	}
	public void setFLeft(Node fleft)
	{
		this.fleft = fleft;
	}
	public void printNode()
  {
    System.out.print(" - "+ data );
  }
}
