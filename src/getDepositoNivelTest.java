import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getDepositoNivelTest {

	@Test
	void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,20.0);
		double res = tank.getDepositoNivel();
		assertEquals(20.0,res );
	}

}
