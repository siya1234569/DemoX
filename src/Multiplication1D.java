
public class Multiplication1D {

	public static void main(String[] args) {
		int[] a={1,2};
		int[] b={2,3};
		int[] temp={0,0};
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<b.length;j++)
			 {
				 temp[i]=a[i]*b[j];
			 }	 
			 
			 System.out.println(temp[i]+" ");
			 
		 }

	}

}
 