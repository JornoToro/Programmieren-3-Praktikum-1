package src.car;

/**
 * cmain
 * !Just for Testing / Debugging
 */
public class cmain {

    public static void main(String[] args) {

        LicenceAdministration administration = new LicenceAdministration();
        String plate = administration.requireValidLicencePlate("EI-HS 12");    
        System.out.println(plate);
    }
}