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

	@Test
	public void leetspeak_replacesSUnlessFirstLetterOfWord_wordChanges() {
		Leetspeak testLeetspeak = new Leetspeak();
		String results = "M1zz1zz1pp1 Summ3r";
		assertEquals(results, testLeetspeak.leetspeak("Mississippi Summer"));
	}

	@Test
	public void leetspeak_ignoresPunctuation_wordChanges() {
		Leetspeak testLeetspeak = new Leetspeak();
		String results = "Sup3r day 0ut, 1zn't 1t Summ3r?";
		assertEquals(results, testLeetspeak.leetspeak("Super day out, isn't it Summer?"));
	}

}
