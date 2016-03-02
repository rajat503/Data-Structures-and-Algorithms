import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static ArrayList<ArrayList<Integer>> adjList=new ArrayList<ArrayList<Integer>>();
    static int visited[];
    static int maxh=0;
    static int maxn=0;
    public static void main(String[] args) throws Exception {
        BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s;
        s=new StringTokenizer(st.readLine());
        int n=Integer.parseInt(s.nextToken());
        visited=new int[n];
        int i,a,b;
        for(i=0;i<n;i++)
            {
            adjList.add(new ArrayList<Integer>());
        }
        for(i=0;i<n-1;i++)
            {
            s=new StringTokenizer(st.readLine());
            a=Integer.parseInt(s.nextToken());
            b=Integer.parseInt(s.nextToken());
            adjList.get(a).add(b);
            adjList.get(b).add(a);
            visited[a]=0;
            visited[b]=0;
        }
        dfs(0,0);
        for(i=0;i<n;i++)
            {
            visited[i]=0;
        }
        maxh=0;
        dfs(maxn,0);
        System.out.println(maxh-1);
    }
    public static void dfs(int r, int h)
        {
            visited[r]=1;
            h++;
            int i,f=0;
            for(i=0;i<adjList.get(r).size();i++)
              {
                 if(visited[adjList.get(r).get(i)]==0)
                  {
                     f=1;
                    dfs(adjList.get(r).get(i),h);
                  }
             }
            if(f==0)
                {
                 if(h>maxh)
                 {   maxh=h;
                     maxn=r;
                 }  
            }      
    }
}
