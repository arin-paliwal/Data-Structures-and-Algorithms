public class sumOfDigits {
    public static int sum_of_digit(int n)
	{
		if (n == 0)
			return 0;
		return (n % 10 + sum_of_digit(n / 10));
	}

	// Driver Program to check above
	public static void main(String args[])
	{
		int num = 12345;
        if(num<10) System.out.println("Sum of digits in "+num);
		else{
            int result = sum_of_digit(num);
            System.out.println("Sum of digits in " + num + " is " + result);
        }
	}
}
