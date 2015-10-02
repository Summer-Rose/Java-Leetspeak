import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

	@Test
	public void leetspeak_returnsWordAsIsWhenLeetspeakNotPresent_wordAsIs() {
		Leetspeak testLeetspeak = new Leetspeak();
		assertEquals("happy", testLeetspeak.leetspeak("happy"));
	}

	@Test
	public void leetspeak_replacesEWith3_wordChanges() {
		Leetspeak testLeetspeak = new Leetspeak();
		assertEquals("h3y", testLeetspeak.leetspeak("hey"));
	}
}
