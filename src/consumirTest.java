import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class consumirTest {

DepositoCombustible tank;
	
	@BeforeEach
		public void before() {
		tank = new DepositoCombustible(40.00, 20.00);
	}
		
	@Test
	public void testConsumir() {
		tank.consumir(10.00);
	}
	
	@AfterEach
	public void after() {
		System.out.println("Nivel combustible: " + tank.getDepositoNivel());
	}

}
