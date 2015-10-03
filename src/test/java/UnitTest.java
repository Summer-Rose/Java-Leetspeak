import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

	@Test
	public void leetspeak_returnsWordAsIsWhenLeetspeakNotPresent_wordAsIs() {
		Leetspeak testLeetspeak = new Leetspeak();
		assertEquals("happy", testLeetspeak.leetspeak("happy"));
	}

	@Test
	public void leetspeak_replacesLowerCaseLetter_wordChanges() {
		Leetspeak testLeetspeak = new Leetspeak();
		String results = "h3ll0 w0rld";
		assertEquals(results, testLeetspeak.leetspeak("hello world"));
	}

	@Test
	public void leetspeak_replacesLowerAndUpperCaseLetters_wordChanges() {
		Leetspeak testLeetspeak = new Leetspeak();
		String results = "3at 0atm3al";
		assertEquals(results, testLeetspeak.leetspeak("Eat Oatmeal"));
	}

}
