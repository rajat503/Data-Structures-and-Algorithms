class QuickSort
{
  private static int helper[];
  public static void quickSort(int a[])
  {
    helper=new int[a.length];
    qsort(a,0,a.length-1);
  }
  private static void qsort(int a[], int l, int r)
  {
    if(l<r)
    {
      int i=partition(a,l,r);
      qsort(a,l,i-1);
      qsort(a,i+1,r);
    }
  }
  private static int partition(int a[], int l, int r)
  {
    int i,j,k;
    i=l;
    j=r;
    for(k=l+1;k<=r;k++)
    {
      if(a[k]<a[l])
      {
        helper[i++]=a[k];
      }
      if(a[k]>a[l])
      {
        helper[j--]=a[k];
      }
    }
    helper[j]=a[l];
    for(k=l;k<=r;k++)
    {
      a[k]=helper[k];
    }
    return j;
  }
}
