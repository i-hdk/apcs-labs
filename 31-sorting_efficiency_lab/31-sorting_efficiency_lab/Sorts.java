public class Sorts
{

    public static void insertionSort(int[] stuff)
    {
        for (int i=1; i< stuff.length; ++i)
   {
      int val = stuff[i];
      int j=i;
      while(j>0&&val<stuff[j-1]){         
         stuff[j]=stuff[j-1];
         j--;
      }
      stuff[j]=val;
   }

    }

    public static void selectionSort(int[] stuff)
    {
        for(int i=0; i< stuff.length-1; i++){
        int min = i;
        for(int j = i+1; j< stuff.length; j++)
        {
           if( stuff[j] <  stuff[min])
	    min = j;    	//find location of smallest
        }
        if( min != i) {
	 int temp = stuff[min];
	 stuff[min] = stuff[i];
	 stuff[i] = temp;   	//put smallest in pos i
       }
    }

    }

    public static void mergeSort(int[] stuff, int front, int back)
    {
           int mid = (front+back)/2;
   if(mid==front) return;
   mergeSort(stuff, front, mid);
   mergeSort(stuff, mid, back);
   merge(stuff, front, back);
    }

    public static void merge(int[] stuff, int front, int back)
    {
         int dif = back-front, spot = 0;
  int[] temp = new int[ dif ];
  int beg = front, mid = (front+back)/2, saveMid = mid;
  while( beg<saveMid && mid<back ) {
     if(stuff[ beg ] < stuff[ mid ])
        temp[ spot++ ]= stuff[ beg++ ];
     else
        temp[ spot++ ]= stuff[ mid++ ];
  }        
  while( beg < saveMid ) 
     temp[ spot++ ]= stuff[ beg++ ];
  while( mid < back ) 
     temp[ spot++ ]= stuff[ mid++ ];
  for(int i = 0; i < dif; ++i)
     stuff[front+i]=temp[i];

    }

}
