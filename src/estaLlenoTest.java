import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class estaLlenoTest {

DepositoCombustible tank;
	
	@BeforeEach
	public void before() {
	tank = new DepositoCombustible(40.00, 0.00);
	tank.fill(40.00);
}

	@Test
	public void testEstaLleno() {
		boolean resp = tank.estaLleno();
		assertTrue(resp);
	}

}
