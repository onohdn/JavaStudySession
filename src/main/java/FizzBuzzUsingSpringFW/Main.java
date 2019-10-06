package FizzBuzzUsingSpringFW;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Mainクラスではない別のクラスにFizzBuzzを書きます。 このクラスはMainなので、ココにはFizzBuzzを書きません。
 * Springを使って実装します。
 * @author onohdn
 *
 */
public class Main {

	public static void main(String[] args) {
		int n = 50; // 	任意の数nを決め打ちで決めてしまう
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FizzBuzz fizzBuzz = context.getBean(FizzBuzz.class); // FizzBuzz判定用のクラスをBean定義から取得する。
		
		for (int i = 1; i <= n; i++) {
			System.out.println(fizzBuzz.fizzBuzzJudge(i)); // FizzBuzz判定結果をコンソール出力する
		}
		context.close();
	}
}