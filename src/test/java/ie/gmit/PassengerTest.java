package ie.gmit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PassengerTest {
    private Passenger myPassenger;
    @BeforeEach
    void init(){
        myPassenger = new Passenger();
    }
    @Test
    void testName(){
        assertEquals("Aaron", myPassenger.getName());
    }
    @Test
    void testID(){
        assertEquals("1234567891011", myPassenger.getId());
    }
    @Test
    void testTitle(){
        assertEquals("Mr", myPassenger.getTitle());
    }
    @Test
    void testTitleMs(){
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
    }
    @Test
    void testAge(){
        assertEquals(25, myPassenger.getAge());
    }
    @Test
    void testNumber(){
        assertEquals("123456789123456", myPassenger.getNumber());
    }
    @Test
    void testNameError(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> myPassenger.setName("aa"));
        assertEquals("Name is too short", e.getMessage());
    }
    @Test
    void testTitleError(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> myPassenger.setTitle("MA"));
        assertEquals("Title is not the right format", e.getMessage());
    }
    @Test
    void testIDError(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> myPassenger.setId("123467890"));
        assertEquals("ID is too short", e.getMessage());
    }
    @Test
    void testAgeError(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> myPassenger.setAge(15));
        assertEquals("Age is too young", e.getMessage());
    }
    @Test
    void testNumberError(){
        Exception e = assertThrows(IllegalArgumentException.class, ()-> myPassenger.setNumber("12346"));
        assertEquals("Number is too short", e.getMessage());
    }
    @Test
    void testFullArgConstructor(){
        Passenger p = new Passenger("Mrs", "Gear-oid", "98765432100", "12345678999", 22);
        assertEquals("Mrs" + "Gear-oid" +"98765432100"+ "12345678999"+22, p.getTitle()+p.getName()+p.getId()+p.getNumber()+p.getAge());
    }
}
