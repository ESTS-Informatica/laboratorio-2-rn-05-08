import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class CompanyTest {
    private Company company;
    private User client1, client2, seller1, seller2;
    private Property property1, property2;
    private Sell sell1, sell2;

    @Before
    public void setUp() {
        company = new Company();

        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        company.registerClient(client1);
        company.registerClient(client2);

        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        company.registerSeller(seller1);
        company.registerSeller(seller2);

        property1 = new Property("T3 Monte Belo", 150000.0);
        property2 = new Property("T2 Central", 120000.0);
        company.registerProperty(property1);
        company.registerProperty(property2);

        sell1 = new Sell(client1, seller1, property1);
        sell2 = new Sell(client2, seller2, property2);
        company.registerSell(sell1);
        company.registerSell(sell2);
    }

    @Test
    public void testConstructor() {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }
    
    
}
