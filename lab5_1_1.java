// Harekam Kohli
// SBU ID- 115148763
// CSE-114
//kohli_harekam_Lab5_P1

package lab5;
import java.util.*;
public class lab5_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter any number: ");
		double numb= input.nextDouble();  //numb== number
		
		System.out.print("Enter your estimated number: ");
		
		double pest= input.nextDouble();  //pest== previous estimated number
		
		double output = Math.pow(numb,0.5);
		
		while(Math.abs(output-pest)>0.00000000000000000000000000000000000000000000000001) {
			pest = ((numb/pest)+pest)/2;
		}
		System.out.print("The approximated square root is " + pest);
	}
//11111.111061110612
}
