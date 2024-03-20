import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyTest{
    public void testConstructor(){
        String description = "T3 Monte Belo";
        double price = 150000.0;
        
        Property property1 = new Property(description, price);
        
        assertEquals(description, property1.getDescription());
        assertEquals(price, property1.getPrice(), 0.01);
    }
}