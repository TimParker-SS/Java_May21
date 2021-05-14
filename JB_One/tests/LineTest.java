import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.may.jbdayfour.Line;

class LineTest {
	Line l = new Line(2, 3, 4, 1);

	@Test
	void testGetSlope() {
		assertEquals(-1, l.getSlope(), .0001);
		assertNotEquals(2, l.getSlope(), .0001);
	}

	@Test
	void testGetDistance() {
		assertEquals(Math.sqrt(8), l.getDistance(), .0001);
		assertNotEquals(Math.sqrt(3), l.getDistance(), .0001);
	}

	@Test
	void testParallelTo() {
		assertEquals(true, l.parallelTo(new Line(1, 2, 3, 0)));
		assertNotEquals(true, l.parallelTo(new Line(4, -2, 7, 9)));
	}

}
