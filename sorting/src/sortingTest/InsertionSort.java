package sortingTest;

public class InsertionSort  {
	 public static  void sort(Date[] a)   
	 {      int N = a.length;      
	 for (int i = 1; i < N; i++)         
		 for (int j = i; j > 0; j--)            
			 if (a[j].compareTo(a[j-1])==-1)               
				 exch(a, j, j-1);            
			 else break;   
	 }
	 private static  void exch(Date[] a, int j, int i) {
		Date temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		
	}
	
	 
}
