package FizzBuzzInAnotherClass;

/**
 * Mainクラスではない別のクラスにFizzBuzzを書きます。 このクラスはMainなので、ココにはFizzBuzzを書きません。
 * 
 * @author onohdn
 *
 */
public class Main {

	public static void main(String[] args) {
		int n = 50; // 	任意の数nを決め打ちで決めてしまう
		FizzBuzz fizzBuzz = new FizzBuzz(); // FizzBuzz判定用のクラスを用意する
		
		for (int i = 1; i <= n; i++) {
			System.out.println(fizzBuzz.fizzBuzzJudge(i)); // FizzBuzz判定結果をコンソール出力する
		}
	}
}