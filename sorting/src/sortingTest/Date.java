package sortingTest;

public class Date implements Comparable<Date>  {
	 public final int month, day, year;
	 public Date(int m, int d, int y) {
		 month=m;
		 day=d;
		 year=y;
	}
	public int compareTo(Date other) {
		if(this.year<other.year) return -1;
		 if(this.year>other.year) return 1;
		
		 if (this.month < other.month) return -1; 
		 if (this.month > other.month) return +1; 
		 if (this.day   < other.day  ) return -1; 
		 if (this.day   > other.day  ) return +1; 
		 return 0;
	 }
}