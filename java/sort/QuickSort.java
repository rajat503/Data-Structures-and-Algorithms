class QuickSort
{
  public static void quickSort(int a[])
  {
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
    int i=l-1,j,t;
    for(j=l;j<r;j++)
    {
      if(a[j]<a[r])
      {
        i++;
        t=a[i];
        a[i]=a[j];
        a[j]=t;
      }
    }
    t=a[i+1];
    a[i+1]=a[r];
    a[r]=t;
    return i+1;
  }
}
