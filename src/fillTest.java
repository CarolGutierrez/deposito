import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class fillTest {
DepositoCombustible tank;
	
	@BeforeEach
		public void before() {
		tank = new DepositoCombustible(40.00, 0.00);
	}
		
	@Test
	public void testFill() {
		tank.fill(10.00);
	}
	
	@AfterEach
	public void after() {
		System.out.println("Nivel combustible: " + tank.getDepositoNivel());
	}

}
