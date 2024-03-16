import java.util.Scanner;
class Primary{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		
		int c = 0;
		
		for (int i=1 ; i<=x ;i++){
			
			if(x%i == 0){
				c++;
				
				}
			
			
			 }
			 if (c>2){
				 System.out.print(x+" is not a primary number : ");
				 
				 }else{
					 System.out.print(x+" is a primary number : ");
					 }
		
		
		
		
		}}
