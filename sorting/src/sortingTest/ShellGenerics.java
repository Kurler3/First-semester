package sortingTest;

public class ShellGenerics {
     public static <E extends Comparable<E>> void  sort(E[] a) {
    	 int N=a.length;
    	 int h=1;
    	 while(h<N/3) { h=h*3+1;}
    	 while(h>=1) {
    		 for(int i=h;i<N;i++) {
    			 for(int j=i;j>=h && (a[j].compareTo(a[j-h]))==-1;j-=h) {
    				 E temp=a[j]; //exchange j with j-h
    				 a[j]=a[j-h];
    				 a[j-h]=temp;
    			 }
    		  }
    		 h=h/3;
    	 }
     }
    	 
}
