
public class AscendingOrder {

	public static void main(String[] args) {
		int[][] a={{2,1,3},{0,7,3,2},{4,3},{8}};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=j+1;k<a[i].length;k++)
				{
					if(a[i][j]>a[i][k])
					{
						temp=a[i][j];
						a[i][j]=a[i][k];
						a[i][k]=temp;
						
					}
				}System.out.println(a[i][j]+"");
			}
			System.out.println(" ");
			
		}

	}

} 
