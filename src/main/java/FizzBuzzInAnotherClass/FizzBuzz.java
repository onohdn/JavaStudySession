package FizzBuzzInAnotherClass;
/**
 * Mainクラスではない別のクラスにFizzBuzzを書きます。 つまり、ココにFizzBuzzを書きます。
 * @author onohdn
 *
 */
public class FizzBuzz {
	public String fizzBuzzJudge(int n) {
		String judgementResult;
		if (n % 15 == 0) { // 3と5の公倍数か判定
			judgementResult = "FizzBuzz";
		}else if (n % 3 == 0) { // 3の倍数か判定
			judgementResult = "Fizz";
		}else if (n % 5 == 0) { // 5の倍数か判定
			judgementResult = "Buzz";
		}else {
			judgementResult = Integer.toString(n);
		}
		return judgementResult;
	}
}