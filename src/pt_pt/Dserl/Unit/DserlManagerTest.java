package pt_pt.Dserl.Unit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pt_pt.Dserl.Controller.DserlManager;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DserlManagerTest {

    static DserlManager dm;

    @BeforeAll
    public static void HelloJUnit() {
        System.out.println("Test Initialization.");
        System.out.println("Assigning value to the manager for future test!");
        dm = new DserlManager();
    }

    @Test
    public void testConnection() {
        assertTrue(dm.testConnection("root","root"));
        assertFalse(dm.testConnection("root","root") == false);
    }

}