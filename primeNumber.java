import java.util.Scanner;

public class primeNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(system.in)

		System.out.println("Enter a number")
		int num  = sc.nextInt();
		if(isPrime(num)){
			System.out.println(num  + " is a prime number");
		}
		else{
			System.out.println(num + " is not a prime number");
		}
	}

	public static boolean isPrime(int n){
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0){
			return false;
		}

		return true;
	}

}
