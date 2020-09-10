import java.util.*;
public class COMPUTING_TAXES {
	public static void main(String[] args) {
		final Scanner input = new Scanner(System.in);
		/*
		 *  ---> Filing Status <---- 
		 *  0 = single 
		 *  1 = married filing jointly or qualified widow(er)
		 *  2 = married filing separately
		 *  3 = Head of Household
		 */
		
		// Prompt the user for filing status
		
		System.out.println("Enter your filing status, 0(single), 1(married filing jointly), 2(married filing separately), 3(Head of Household)");
		
		// Inputting status
		
		final int filingStatus = input.nextInt();
		
		// Prompt the user for taxable income
		
		System.out.println("Enter your taxable income");
		
		double income = input.nextDouble();
		
		// Calculate the taxes
		
		double tax = 0;
		
		if (filingStatus == 0) {
			if (income <= 9700) {
				tax = income * 0.10;
			}
			else if (income <= 39475) {
				tax = 9700 * 0.10 + (income - 9700) * .12;
			}
			else if (income <= 84200) {
				tax = 9700 * 0.10 + (39475 - 9700) * .12 + (income - 39475) * .22;
			}
			else if (income <= 160725) {
				tax = 9700 * 0.10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (income - 84200) * .24;
			}
			else if (income <= 204100) {
				tax = 9700 * 0.10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (160725 - 84200) * .24 + (income - 160725) * .32;
			}
			else if (income <= 510300) {
				tax = 9700 * 0.10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (204100 - 160725) * .24 + (204100 - 160725) * .32 + (income - 204100) * .35;
			}
			else {
				tax = 9700 * 0.10 + (39475 - 9700) * .12 + (84200 - 39475) * .22 + (204100 - 160725) * .24 + (204100 - 160725) * .32 + (510300 - 204100) *.35 + (income - 510300) * .37;
			}
		}
		/* NEED ASSISTANCE */ else if (filingStatus == 1) {
			if (income <= 19400) {
				tax = income * .10;
			}
			else if (income <= 78950) {
				tax = 19400 * .10 + (income - 19400) * .12;
			}
			else if (income <= 168400) {
				tax = 19400 * .10 + (78950 - 19400) * .12 + (income - 78950) * .22;
			}
			else if (income <= 321450) {
				System.out.println(19400 * .10);
				System.out.println((78950-19400)*.12);
				System.out.println((168400-78950)*.22);
				System.out.println((income - 168400)*.24);
				tax = 19400 * .10 + (78950 - 19400) * .12 + (168400 - 78950) * .22 + (income - 168400) * .24;
			}
			else if (income <= 408200) {
				tax = 19400 * .10 + (78950 - 19400) * .12 + (168400 - 78950) * .22 + (321450 - 168400) * .24 + (income - 321450) * .32;
			}
			else if (income <= 612350) {
				tax = 19400 * .10 + (78950 - 19400) * .12 + (168400 - 78950) * .22 + (321450 - 168400) * .24 + (408200 - 321450) * .32 + (income - 408200) * .35;
			}
			else {
				tax = 19400 * .10 + (78950 - 19400) * .12 + (168400 - 78950) * .22 + (321450 - 168400) * .24 + (408200 - 321450) * .32 + (612350 - 408200) * .35 + (income - 612350) * .37;
			}
		}
		else if (filingStatus == 3) {
			if (income <= 13850) {
				tax = income * .10;
			}
			else if (income <= 52850) {
				tax = 13850 * .10 + (income - 13850) * .12;
			}
			else if (income <= 84200) {
				tax = 13850 * .10 + (52850 - 13850) * .12 + (income - 52850) * .22;
			}
			else if (income <= 160700) {
				tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (income - 84200) * .24;
			}
			else if (income <= 204100) {
				tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (160700 - 84200) * .24 + (income - 160700) * .32;
			}
			else if (income <= 510300) {
				tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (160700 - 84200) * .24 + (204100 - 160700) * .32 + (income - 204100) * .35;
			}
			else {
				tax = 13850 * .10 + (52850 - 13850) * .12 + (84200 - 52850) * .22 + (160700 - 84200) * .24 + (204100 - 160700) * .32 + (510300 - 204100) * .35 + (income - 510300) * .37;
			}
		}
		System.out.println("Your taxes are : " + tax);
	}
}
