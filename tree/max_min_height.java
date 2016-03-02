import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static ArrayList<ArrayList<Integer>> adjList=new ArrayList<ArrayList<Integer>>();
    static int visited[];
    static int minh=Integer.MAX_VALUE;
    static int maxh=0;
    public static void main(String[] args) throws Exception {
        BufferedReader st=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s;
        s=new StringTokenizer(st.readLine());
        int n=Integer.parseInt(s.nextToken());
        int r=Integer.parseInt(s.nextToken())-1;
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
            adjList.get(a-1).add(b-1);
            adjList.get(b-1).add(a-1);
            visited[a-1]=0;
            visited[b-1]=0;
        }
        dfs(r,0);
        System.out.println(maxh+" "+minh);
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
                 }  
                if(h<minh)
                {   minh=h;}
                return;
            }      
    }
}
