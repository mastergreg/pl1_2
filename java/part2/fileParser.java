import java.util.StringTokenizer;
import java.util.Iterator;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class fileParser
{
  private int nodes=0;
  private InputStreamReader isr=null;
  private BufferedReader br=null;
  private StringTokenizer strTzer= null;
  private LinkedList<int[]> NodeList = new LinkedList<int[]>();
  public fileParser()
  {
    isr = new InputStreamReader(System.in);
    br = new BufferedReader(isr);
    try
    {
      nodes = Integer.parseInt(br.readLine())-1;
    }
    catch (java.io.IOException e)
    {
    }
  }
  public void parseIn()
  {
    int current = 0;
    for(current = 0; current < nodes ; current++)
    { 
      try
      {
        strTzer = new StringTokenizer(br.readLine());
        int[] inputArray = new int[2];
        inputArray[0] = Integer.parseInt(strTzer.nextToken());
        inputArray[1] = Integer.parseInt(strTzer.nextToken());
        NodeList.add(inputArray);
      }
      catch ( java.io.IOException e )
      {
      }
    }
  }
  public LinkedList<int[]> getNodeList()
  {
    return NodeList;
  }
  public void printNodeList()
  {
    System.out.println("Size = "+NodeList.size());
    for (int[] current : NodeList)
    {
      System.out.println(current+" ("+current[0]+","+current[1]+")");
    }
  }
  public int getNodes()
  {
    return nodes;
  }
}
