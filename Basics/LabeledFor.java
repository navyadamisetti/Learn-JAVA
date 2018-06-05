public class LabeledFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loop1:								//label for first loop
			for(int i=0;i<4;i++)
			{
				loop2:						//label for second loop
					for(int j=0;j<4;j++)
					{
						if(i==2&&j==2)
							break loop1;		//we can break any loop using labels
						System.out.println(i+" "+j);
					}
			}
	//for(;;)
		//System.out.println("Infinite loop");  //Infinite for loop can be implemented by 2 semicolons

	}

}
