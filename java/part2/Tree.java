import java.util.List;
import java.util.LinkedList;
public class Tree
{
  private Node head;

  public Tree()
  {
    head = null;
  }
  public Tree(int hd,int ch)
  {
    head = new Node(hd,new Node(ch,null,null),null);
  }
  private Node find(Node begin,int father)
  {
    Node current = begin;
    if (current==null) 
    {
      return null;
    }
    else if (current.getData() == father)
    {
      return current;
    }
    else 
    {
      Node rightres = find(current.getRight(),father);
      if (rightres != null)
      {
        return rightres;
      }
      else
      {
        return find(current.getLeft(),father);
      }
    }
  }
  public boolean insert(int father, int child)
  {
    Node current = find(head,father);
    if(head == null)
    {
      System.out.println("New head ( "+father+" , "+child+" ) ");
      head = new Node(father,new Node(child,null,null),null);
      return true;
    }
    Node rig = null;
    Node lef = null;
    if( current != null )
    {
      rig = current.getRight();
      lef = current.getLeft();
      if ( rig == null )
      {
        rig = new Node ( child, null, null );
      }
      else 
      {
        lef = new Node ( child, null, null );
      }
      return true;
    }
    else
    {
      current = find(head,child);
      if ( current != null)
      {
        rig = current.getFRight();
        lef = current.getFLeft();
        if ( rig == null )
        {
          rig = new Node ( father, current, null );
        }
        else 
        {
          lef = new Node ( father, current, null );
        }
        return true;
      }
      else
      {
        System.out.println("( "+father+" , "+child+" ) failed");
        return false;
      }

    }
  }
  public void insertNodesInTree(LinkedList<int[]> NodeList)
  {
    int[] current = null;
    while( NodeList.size() > 0)
    { 
      current = NodeList.removeFirst();
      if( insert(current[0],current[1] ) )
        continue;
      else
      {
        NodeList.addLast(current);
      }
      
    }
  }
  public void print()
  {
    printTree(head);
  }
  private void printTree(Node begin)
  {
    Node current = begin;
    if(current != null)
    {
      current.printNode();
      printTree(current.getRight());
      printTree(current.getLeft());
    }
  }
}
