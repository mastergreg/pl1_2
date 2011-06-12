import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class fileParser
{
  private int nodes=0;
  private InputStreamReader isr=null;
  private BufferedReader br=null;
  private StringTokenizer strTzer= null;
  private int[][] nodeArray=null;
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
    nodeArray = new int[2][nodes];
    for(current = 0; current < nodes ; current++)
    { 
      try
      {
        strTzer = new StringTokenizer(br.readLine());
        nodeArray[0][current] = Integer.parseInt(strTzer.nextToken());
        nodeArray[1][current] = Integer.parseInt(strTzer.nextToken());
      }
      catch ( java.io.IOException e )
      {
      }
    }
  }
  public int[][] getNodeArray()
  {
    return nodeArray;
  }
  public void printNodeArray()
  {
    int current = 0;
    for (current = 0 ; current < nodes ; current++ )
    {
      System.out.println("("+nodeArray[0][current]+","+nodeArray[1][current]+")");
    }
  }
}
