package sortingTest;

public class ShellSort {
    private static boolean less(Date m,Date v) {
    	return m.compareTo(v)==-1;
    }
    private static void exch(Date a[],int i, int j) {
    	Date temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }
    public static void sort(Date[] a) {
    	int N=a.length;
    	int h=1;
    	while(h<N/3) {h=h*3 + 1;}
    	while(h>=1) {
    		for(int i=h;i<N;i++) { //always start i from h and go backwards
    			for(int j=i; j>=h && less(a[j],a[j-h]) ; j-=h) { //iterate over h and h-h until j can't do more h hoops
    				exch(a,j,j-h);
    			}
    		}
    		h=h/3;
    	}
    }
    
    	
    	
    	
    
}

