package FizzBuzzInTheMain;
/**
 * mainメソッドにFizzBuzzを書きます。 
 * 
 * @author onohdn
 *
 */
public class FizzBuzz {

	public static void main(String[] args) {
		int n = 50; // 	任意の数nを決め打ちで決めてしまう
		
		for (int i = 1; i <= n; i++ ) {
			if (i % 15 == 0) { // 3と5の公倍数か判定
				System.out.println("FizzBuzz");
			}else if (i % 3 == 0) { // 3の倍数か判定
				System.out.println("Fizz");
			}else if (i % 5 == 0) { // 5の倍数か判定
				System.out.println("Buzz");
			}else {
				System.out.println(i);				
			}
		}
	}
}