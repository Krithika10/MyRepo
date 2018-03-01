import java.text.DecimalFormat;
import java.util.Scanner;

public class SubwayService {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int observations = 0;
		DecimalFormat approximating = new DecimalFormat("#.#######");
		if(sc.hasNextInt()){
			observations = sc.nextInt();
		}
		
		double observationSeconds= 0;
		int observationMinutes = 0;
		double average = 0;
		for(int i = 0;i<observations;i++) {
			observationMinutes += sc.nextInt();
			observationSeconds += sc.nextDouble()/60;
			//observationSeconds  = observationSeconds + sc.nextDouble()/60;
		}
		average = Double.valueOf(approximating.format(observationSeconds/observationMinutes));
		if(average <=1){
			System.out.println("Measurement error");
		}
			else {
				System.out.println(average);	
		}	
	}
}