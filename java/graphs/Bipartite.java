import java.io.*;
import java.util.*;

public class Bipartite {

    static ArrayList<ArrayList<Integer>> adjList=new ArrayList<ArrayList<Integer>>();
    static int visited[];
    static boolean bipartite=true;
    
    public static void main(String[] args) throws Exception {
        BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s;
        s=new StringTokenizer(st.readLine());
        int n=Integer.parseInt(s.nextToken());
        int r=Integer.parseInt(s.nextToken());
        visited=new int[n];
        int i,a,b;
        for(i=0;i<n;i++)
            {
            adjList.add(new ArrayList<Integer>());
        }
        for(i=0;i<r;i++)
            {
            s=new StringTokenizer(st.readLine());
            a=Integer.parseInt(s.nextToken());
            b=Integer.parseInt(s.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
            visited[a]=0;
            visited[b]=0;
        }
        twocolor(0,1);
        System.out.println(bipartite);
    }
    public static void twocolor(int r, int c)
        {
          System.out.println("Visiting "+r+" with color "+c);
          if(visited[r]==0)
          {
            visited[r]=c;
            if(c==1)
            {
              c=2;
            }
            else
            {
              c=1;
            }
            for(int i=0;i<adjList.get(r).size();i++)
            {
              twocolor(adjList.get(r).get(i),c);
            }
          }
          else
          {
            if(c!=visited[r])
            {
              bipartite=false;
              return;
            }
          }
    }
}
