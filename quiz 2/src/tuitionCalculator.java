import java.util.Scanner;
public class tuitionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			//Get initial tuition
			System.out.print("Enter your initial tuition: ");
			double initialTuition = input.nextDouble();
			//Get yearly tuition increase rate
			System.out.print("Enter your tuition increase rate: ");
			double increaseRate = input.nextDouble();
			double finalCost = 0;
			//Create a for loop to cycle through the four years
			for (int i=0; i<4; i++){
				double yearlyTuition = 0;
				//Solve for the yearly tuition
				yearlyTuition = initialTuition*Math.pow((increaseRate/100),  4.0)+ initialTuition;
				//save the new value of the initial tuition
				initialTuition = initialTuition*(increaseRate/100)+ initialTuition;
				//Sum each yearly tuition to solve for the final cost
				finalCost = yearlyTuition+finalCost;	
			}
			System.out.printf("your total four year cost of college is: $%.2f", finalCost);
	}

}

