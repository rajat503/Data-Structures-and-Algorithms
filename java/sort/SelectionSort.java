class SelectionSort
{
  public static void selectionSort(int a[])
  {
    for(int i=0;i<a.length;i++)
    {
      for(int j=i;j<a.length;j++)
      {
        int temp_index=i;
        if(a[temp_index]>a[j])
        {
          temp_index=j;
        }
        int t=a[i];
        a[i]=a[temp_index];
        a[temp_index]=t;
      }
    }
  }
  public static void main(String[] args) {
    int a[]={5,4,2,3,1};
    selectionSort(a);
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }
}
