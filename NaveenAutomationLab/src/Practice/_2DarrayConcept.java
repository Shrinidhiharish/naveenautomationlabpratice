package Practice;

public class _2DarrayConcept {

	public static void main(String[] args) {
		//2D array String [][]s=new String[][] is also correct
		String s[][]=new String[3][5];//3 rows 5 columns
		System.out.println(s.length);//gives no of rows
		System.out.println(s[0].length);//total no of columns
		s[0][0]="A";//first row
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		
		s[1][0]="F";//2nd row
		s[1][1]="G";
		s[1][2]="H";
		s[1][3]="I";
		s[1][4]="J";
		
		
		s[2][0]="K";//3rd row
		s[2][1]="L";
		s[2][2]="M";
		s[2][3]="N";
		s[2][4]="O";
		
		System.out.println(s[2][4]);//IF we have not declared and initialised anything it prints null
	    for(int row=0;row<s.length;row++)// to print all values of 2D array use for loop,row 0 col 0 to 4
	    {
	    	for(int col=0;col<s[0].length;col++)//row 2 col 0 to 4
	    	{                                   //row 3 col 0 to 4 
	    		System.out.println(s[row][col]);
	    			
	    	}
	    }
		
		
	}

}
