import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getDepositoMaxTest {

	@Test
	void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		double res = tank.getDepositoMax();
		assertEquals(40.0,res );
	}

}
