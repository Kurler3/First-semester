package sortingTest;

public class SelectionSort {
    
	
	private static boolean less(Date m,Date v) {
    	return m.compareTo(v)==-1;
    }
    public static void sort(Date[] a) {   
    	int N = a.length;   
    	for (int i = 0; i < N; i++)      
    	{
    		
    	    int min=i;
    		for(int j=i+1;j<N;j++) {
    			if(less(a[j],a[min])) {
    				min=j;
    			}
    		exch(a,i,min);	
    		}
    	}
    }
    private static void exch(Date[] a,int i,int j) {
    	Date swap = a[i];   
    	a[i] = a[j];   
    	a[j] = swap; 
    }
	

}