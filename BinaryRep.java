import java.util.Scanner;

public class BinaryRep {

	public static void main(String[] args) {
		System.out.println("Please enter an integer :");
		Scanner sc = new Scanner(System.in);
		int i = 0;
		if(sc.hasNextInt()){
			i= sc.nextInt();
		}
		
		String binary = Integer.toBinaryString(i);
		StringBuilder numbers = new StringBuilder(binary);
		System.out.println("The binary value for input : "+i+ " is :"+ binary);
		
		numbers = numbers.reverse();
		System.out.println("The reversed output is : " + numbers);
		
		System.out.println(Integer.parseInt(numbers.toString(),2));
		
}
}