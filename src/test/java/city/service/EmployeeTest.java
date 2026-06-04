package city.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class EmployeeTest {

@Test
public void testCapitalize() {
Address stubAddress = new Address("address1", "city1");
Employee employee = new Employee("bob", 1, 20000, stubAddress);
assertEquals(employee.getCapitalizedName(), "Bob");
}
}