
public class Two_dimentinl_Arry {

	public static void main(String[] args) {

      int a[][] = new int[3][2];
      
      a[0][0] = 10;
      a[0][1] = 20;
      
      a[1][0] = 30;
      a[1][1] = 40;
      
      a[2][0] = 50;
      a[2][1] = 60;
      
      //classic for loop
      
     /* for(int i=0; i<a.length;i++)
      {
    	  for(int j=0;j<a[i].length;j++)
    	  {
    		  System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }*/
      
      
      
      //using for each loop----------------------
      for(int i[]:a)
      {
    	 for(int j:i)
    	 {
    		 System.out.print(j+" ");
    	 }
    	 System.out.println();
      }

	}

}
