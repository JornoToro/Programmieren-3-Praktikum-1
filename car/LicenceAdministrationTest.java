package car;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
/**
 * LicenceAdministrationTest
 */
public class LicenceAdministrationTest {

    @Test(expected = NullPointerException.class)
    public void ifCompleteRegisterNull() {
        LicenceAdministration administration = new LicenceAdministration();
        Map<String, Car> emptyMap = new HashMap<String, Car>();
        administration.register(emptyMap);
    }

    @Test
    public void ifCompleteRegisterSuccess() {
        LicenceAdministration administration = new LicenceAdministration();
        Map<String, Car> regCars = new HashMap<String, Car>();
        Car ein = new Car("Jonas",Maker.Audi,1995);
        Car zwei = new Car("Peter",Maker.Audi,1994);

        regCars.put("EI-HS 192", ein);
        regCars.put("EI-HS 111", zwei);

        administration.register(regCars);
        
        int size = administration.size();
        assertEquals(2, size);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifSingleIsAlreadyRegist() {
        LicenceAdministration administration = new LicenceAdministration();
        Car ein = new Car("Jonas",Maker.Audi,1995);
        administration.register("EI-HS 192", ein);
        administration.register("EI-BS 172", ein);
    }

    @Test
    public void ifSingleSuccess() {
        LicenceAdministration administration = new LicenceAdministration();
        Car ein = new Car("Jonas",Maker.Audi,1995);
        administration.register("EI-HS 192", ein);
        int size = administration.size();
        assertEquals(1, size);
    }
}