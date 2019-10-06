package FizzBuzzInAnotherClass;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * FizzBuzzクラスのfizzBuzzJudgeメソッドをテストします。
 * 
 * @author onohdn
 *
 */
public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;
	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}
	
	/**
	 * fizzBuzzJudgeメソッドに
	 * <ol>
	 * <li>整数：1
	 * </ol>
	 * を渡した場合に、渡した整数と同値の文字列が返ってくることを検証します。
	 */
	@Test
	public void testFizzBuzzJudgeReturnInt() {
		String actual = fizzBuzz.fizzBuzzJudge(1);
		assertThat(actual, is("1"));
	}
	
	/**
	 * fizzBuzzJudgeメソッドに
	 * <ol>
	 * <li>整数：3
	 * </ol>
	 * を渡した場合に、文字列「Fizz」が返ってくることを検証します。
	 */
	@Test
	public void testFizzBuzzJudgeReturnFizz() {
		String actual = fizzBuzz.fizzBuzzJudge(3);
		assertThat(actual, is("Fizz"));
	}
	
	/**
	 * fizzBuzzJudgeメソッドに
	 * <ol>
	 * <li>整数：5
	 * </ol>
	 * を渡した場合に、文字列「Buzz」が返ってくることを検証します。
	 */
	@Test
	public void testFizzBuzzJudgeReturnBuzz() {
		String actual = fizzBuzz.fizzBuzzJudge(5);
		assertThat(actual, is("Buzz"));
	}

	/**
	 * fizzBuzzJudgeメソッドに
	 * <ol>
	 * <li>整数：15
	 * </ol>
	 * を渡した場合に、文字列「FizzBuzz」が返ってくることを検証します。
	 */
	@Test
	public void testFizzBuzzJudgeReturnFizzBuzz() {
		String actual = fizzBuzz.fizzBuzzJudge(15);
		assertThat(actual, is("FizzBuzz"));
	}
}