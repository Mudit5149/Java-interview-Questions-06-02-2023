
//Java program for user will create a self - exception using the throw keyword


package hackerrank_Solution;

public class ExceptionEx4 {
	public static void main(String args[]){
		int balance=5000;
		int withdrawlAmount=6000;
		try
		{ if(balance< withdrawlAmount)
		{ throw new
		ArithmeticException("Insufficient balance");

		}
		balance=balance-withdrawlAmount;
		System.out.println("Transaction successfullycompleted");
		}
		catch(ArithmeticException e)
		{ System.out.println("\nException: "+ e.getMessage());
		}
		finally
		{ System.out.println("Program continue.....");
		}
		}

}
