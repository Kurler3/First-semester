package sortingTest;

public class MergeSort {
       private static void merge(int[] a,int[] aux,int lo, int mid, int hi) {
    	  if(!isSorted(a,lo,mid)) {return;}
    	  if(!isSorted(a,mid+1,hi)) {return;}
    	  
    	  for(int k=lo;k<hi;k++) {
    		  aux[k]=a[k];}
    	  
    	  int i=lo, j=mid+1;
    	  
    	  for(int k=lo;k<=hi;k++) {
    		  if(i>mid) {a[k]=aux[j++];} //if the left array is exhausted
    		  else if(j>hi) {a[k]=aux[i++];}//if the right array is exhausted
    		  else if(a[j]<a[i]) {a[k]=aux[j++];} //if the element from the right array is smaller then input that in into the new sorted arra
    		  else {a[k]=aux[i++];} //if the integer from the left array is smaller than the integer from the right array then input it into the sorted array
    	  }
       }
       private static void sort(int[] a, int[] aux, int lo, int hi)   
       { 
       
    	   if (hi <= lo) 
    	   return; 
       
    	   int mid = lo + (hi - lo) / 2; 
       
    	   sort(a, aux, lo, mid); 
       
    	   sort(a, aux, mid+1, hi); 
       
    	   merge(a, aux, lo, mid, hi);   
       }
       public static void sort(int[] a)   
       { int[] aux = new int[a.length]; 
       sort(a, aux, 0, a.length - 1);   
       } 
    	  
    	  private static boolean isSorted(int[] a, int lo, int hi) {
    	   for(int i=lo;i<hi;i++) {
    		   if(a[i+1]<a[i]) {
    			   return false;
    		   }
    		   
    	   }
    	   return true;
           }
}
