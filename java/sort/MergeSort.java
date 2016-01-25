class MergeSort
{
  private static int helper[];
  public static void mergeSort(int a[])
  {
    helper=new int[a.length];
    msort(a,0,a.length-1);
  }
  private static void msort(int a[], int l, int r)
  {
    if(l<r)
    {
      msort(a,l,(r+l)/2);
      msort(a,((r+l)/2)+1,r);
      merge(a,l,r);
    }
  }
  private static void merge(int a[], int l, int r)
  {
    int i,lc=l,rc=((r+l)/2)+1 ,hc=l;

    for(i=l;i<=r;i++)
    {
      helper[i]=a[i];
    }
    while(lc<=(r+l)/2 && rc<=r)
    {
      if(helper[lc]<=helper[rc])
      {
        a[hc++]=helper[lc++];
      }
      else
      {
        a[hc++]=helper[rc++];
      }
    }
    while(lc<=(r+l)/2)
    {
      a[hc++]=helper[lc++];
    }
  }
}
