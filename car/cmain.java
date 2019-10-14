package car;

/**
 * cmain
 * !Just for Testing / Debugging
 */
public class cmain {

    public static void main(String[] args) {

        LicenceAdministration administration = new LicenceAdministration();


        Car ein = new Car("Jonas",Maker.Audi,1994);
        System.out.println(ein.toString());
        administration.register("EI-HS 192", ein);
        administration.register("EI-HS 191", ein);


    }
}