class InsertionSort
{
  public static void insertionSort(int a[])
  {
    for(int i=1;i<a.length;i++)
    {
      int j=i;
      while(j>0 && a[j]<a[j-1])
      {
        int t=a[j];
        a[j]=a[j-1];
        a[j-1]=t;
        j--;
      }
    }
  }
}
