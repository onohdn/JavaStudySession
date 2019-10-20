package FizzBuzzUsingStream;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Mainクラスではない別のクラスにFizzBuzzを書きます。 このクラスはMainなので、ココにはFizzBuzzを書きません。
 * Springを使って実装します。
 * Streamを使って実装します。
 * @author onohdn
 *
 */
public class Main {

	public static void main(String[] args) {
		int n = 50; // 	任意の数nを決め打ちで決めてしまう
		List<Integer> integerList = new ArrayList<>();
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FizzBuzz fizzBuzz = context.getBean(FizzBuzz.class); // FizzBuzz判定用のクラスをBean定義から取得する。
		
		for (int i = 1; i <= n; i++) {
			integerList.add(i);
		}
		
		integerList.stream()
			.map(fizzBuzz::fizzBuzzJudge)
			.forEach(System.out::println);
	}
}