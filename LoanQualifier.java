import javax.swing.JOptionPane;
/**
 * Laura Davis CIS 260 903
 * This program demonstrates a nested if statement.
 * It will also require the user to enter a password
 * in order to gain access to the program.
 * The program asks a user for their annual salary
 * and their number of years on the job. If the conditions
 * are met, the user is told that he or she qualifies for
 * the loan. If not, the user is told that he or she does
 * not qualify for the loan. 
 *
 */
public class LoanQualifier 
{
	public static void main(String[] args)
	{
		//password section
		//declare variables
		int pw = 123;
		int pw2;
		String input;
		
		input = JOptionPane.showInputDialog("Please enter the password: ");
		pw2 = Integer.parseInt(input);
		
		if (pw2 == pw)
		{
			JOptionPane.showMessageDialog(null, 
					"Password correct. Running . . . ");
			
			//calls the loan method
			loanMethod();
		}
		else
		{
			JOptionPane.showMessageDialog(null, 
					"Password incorrect. Terminating . . . ");
		}
		
	System.exit(0);	
	
	}//End of main	
	
	//the loan method
	public static void loanMethod()
	{
		//declare variables
		double salary;
		double yearsOnJob;
		String input;
		
		//gets the user's salary
		input = JOptionPane.showInputDialog("Please enter "
				+ "your annual salary ");
		salary = Double.parseDouble(input);
		
		//gets the user's number of years on the job
		input = JOptionPane.showInputDialog("Please enter the "
				+ "number of years at your current job ");
		yearsOnJob = Double.parseDouble(input);
		
		//Determines whether or not the user qualifies for the loan
		if (salary >= 30000)
		{
			if (yearsOnJob >= 2)
			{
				JOptionPane.showMessageDialog(null, "Congratulations! "
						+ "You qualify for the loan. ");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Sorry. You must "
						+ "have been at your current job for at "
						+ "least two years to qualify. ");
			}

		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry. You must "
					+ "earn at least $30,000 per year to qualify. ");
		}
		
	}//end of loanMethod

}//End of class
