package example;



public class evenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words = "This is a classified file";
		splittedwords(words);
		
		

	}
	
	public static void splittedwords(String methodwords)
	{ 
		
		String[] Aravind = methodwords.split("\\s+");
		
		for(String use : Aravind )
		{
			if(use.length()%2==0)// for even number words
			{
				for(int i=1; i<Aravind.length;i+=2)// for even place words
				{
					System.out.println(Aravind[i]);
					
				}
			}
			break;
		}
	}

}
