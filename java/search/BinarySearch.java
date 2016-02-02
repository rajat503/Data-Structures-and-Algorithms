//Expectes sorted int[]

import java.util.Arrays;
class BinarySearch {
  public static int binarySearch(int[] a, int key) {
    int mid,high=a.length-1, low=0;
    while(high>=low)
    {
      mid=(high+low)/2;
      if(a[mid]==key)
      {
        return mid;
      }
      if(a[mid]>key)
      {
        high=mid-1;
      }
      else
      {
        low=mid+1;
      }
    }
    return -1;
  }
}
