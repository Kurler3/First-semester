package sortingTest;

public class SelectionGenerics {
     public static <E extends Comparable<E>> void sort(E[] a) {
    	 int N=a.length;
    	 for(int i=0;i<N;i++) {
    		 int min=i;
    		 for(int j=i+1;j<N;j++) {
    			 if(a[j].compareTo(a[min])==-1) {
    				 min=j;
    			 }
    		 }
    		 E temp=a[i];
    		 a[i]=a[min];
    		 a[min]=temp;
    	 
    	}
    	
     }
     
}
