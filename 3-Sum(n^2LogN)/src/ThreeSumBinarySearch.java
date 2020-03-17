import java.util.Scanner;

public class ThreeSumBinarySearch {
       
	    
        public static int[] CreateArray(int N) { // creating the array
        	int[] a= new int[N];
        	System.out.print("Enter the integers please: ");
        	Scanner input= new Scanner(System.in);
        	for(int i=0;i<N;i++) {
        		a[i]=input.nextInt();
            }
        	SortArray(a);
        	return a;
        }
        private static int[] SortArray(int[] a) { //sorts the array created
        	for(int i=0;i<a.length;i++) {
        		for(int j=i+1;j<a.length;j++) {
        			if(a[i]>a[j]) {
        				int temp=a[i];
        				a[i]=a[j];
        				a[j]=temp;
        			}
        		}
        	}
        	return a;
        }
	    private static int searchKey(int[] a,int start,int key) { //uses binary search to search for the key
        	int lo=start;
        	int hi=a.length-1;
        	while(lo<=hi) {
        		int mid=lo+((hi-lo)/2);
        		if(key<a[mid]) hi=mid-1;
        		else if(key>a[mid]) lo=mid+1;
        		else return mid;
        	}
            return -1;
        }
        public static void ThreeSumCount(int[] a) {
        	for(int i=0;i<a.length;i++) {
        		for(int j=i+1;j<a.length;j++) {
        			int key=-(a[i]+a[j]);
        			if(a[i]<a[j] && a[j]<key) { //to avoid double counts
        				if(searchKey(a,j,key)==-1) {  //if the key doesn't exist in the array then continue to the next iteration
        					continue;
        				}
        				else if(a[searchKey(a,j,key)]==key) {  // in this case maybe the compare is unnecessary, a else might have done the job
        					System.out.println(a[i]+ "," + a[j] + "," + key);  //print out the combination
        				}
        			}
        		}
        	}
        }
       public static void main(String[] args) {
		  int[] a=CreateArray(8);
		  ThreeSumCount(a); 
        
	}

}
