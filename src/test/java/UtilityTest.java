package city.service; 
import org.junit.jupiter.api.Test; 
import salary.service.City; 
import java.util.ArrayList; 
import java.util.List; 
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.mockito.Mockito.mock; 
import static org.mockito.Mockito.when; 
import salary.service.Salary;
public class UtilityTest { 
    @Test 
    public void getAddresses() { 
        City city = mock(City.class); 
        List<Address> addresses = new ArrayList<>(); 
        addresses.add(new Address("address1", "city1")); 
        addresses.add(new Address("address2", "city1")); 
        addresses.add(new Address("address3", "city1")); 
        addresses.add(new Address("address4", "city2")); 
        when(city.listAddresses()).thenReturn(addresses); 
        Utility utility = new Utility(); 
        List<Address> correctAddresses = new ArrayList<>(); 
        correctAddresses.add(new Address("address1", "city1")); 
        correctAddresses.add(new Address("address2", "city1")); 
        correctAddresses.add(new Address("address3", "city1")); 
        List<Address> testAddresses = utility.getAddressesByCity(city, "city1"); 
        for (int i = 0; i < testAddresses.size(); i++) { 
            assertEquals(testAddresses.get(i).address, 
            correctAddresses.get(i).address); 
        } }
    
    @Test 
    public void testSalaryFiltering() { 
        Salary salary = mock(Salary.class); 
        List<Integer> mockedSalaries = new ArrayList<>(); 
        mockedSalaries.add(10000); 
        mockedSalaries.add(20000); 
        mockedSalaries.add(30000); 
        mockedSalaries.add(55000); 
        mockedSalaries.add(60000); 
        when(salary.returnSalaries()).thenReturn(mockedSalaries); 
        Utility utility = new Utility(); 
        List<Integer> correctSalaries = new ArrayList<>(); 
        correctSalaries.add(55000); 
        correctSalaries.add(60000); 
        List<Integer> testSalaries = utility.getSalariesOver(salary, 50000); 
        for (int i = 0; i < testSalaries.size(); i++) { 
        assertEquals(testSalaries.get(i), correctSalaries.get(i)); 
        } 
    }  
  }