package sortingTest;

public class Test {

        public static void main(String[] args) {
		int[] a=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=a.length-i;
		}
		
		MergeSort.sort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
        }
	}

