package car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Verwaltungssoftware zur Zuordnung von Autokennzeichen auf einen Besitzer.
 * 
 * @author Gudrun Schiedermeier, gschied@haw-landshut.de
 * !TODO: Methoden Ausfüllen
 */
public class LicenceAdministration {
    /** Bildet Autokennzeichen auf das zugehoerige Fahrzeug ab. */
    private Map<String, Car> platesToCar = new HashMap<>();

    /** Kopiert eine gesamte andere Autokennzeichenverwaltung, alle Zulassungen.
     * @param entries Abbildung von Autokennzeichen auf Autos.
     * @throw NullpointerException, falls entries null ist.
     */
    public void register(Map<String, Car> entries) {
    }

    /** Fuegt einen neuen Eintrag in die Autokennzeichenverwaltung ein.
     *
     * @param licence ein gueltiges Autokennzeichen.
     * @param car ein Auto.
     * @throw IllegalArgumentException, falls das Auto bereits registriert ist.
     */
    public void register(String licence, Car car) {
    }

    /** Liefert die Anzahl der Zulassungen.
     *
     * @return Anzahl der Zulassungen.
     */
    public int size() {
    }

    /** Liefert eine unveraenderliche Sicht auf die Abbildung der Zulassungen.
     * @return unveraenderliche Sicht auf die Zulassungen.
     */
    Map<String, Car> getPlatesToCar() {
    }

    /** Liefert die unveraenderliche Menge aller Autokennzeichen.
     * @return die unveraenderliche Menge aller Autokennzeichen.
     */
    public Set<String> getLicencePlates() {
    }

    /** Liefert fuer einen Besitzer (owner) eine Liste aller Autokennzeichen.
     * @param owner der Besitzer eines Autos, nicht null, nicht leer.
     * @return Liste aller autokennzeichen eines Besitzer.
     */
    public List<String> getLicencesOfOwner(String owner) {
    }

    /** Liefert eine sortierte Liste der Nummernschilder fuer Autos aelter als year.
     * @param beforeYear Jahresangabe.
     * @return sortierte Liste von Nummernschildern.
     */
    public List<String> getLicencesOlderThan(int beforeYear) {
    }

    /** Verschrottet ein Auto, dessen Erstellungsjahr vor einem bestimmten Jahr liegt.
     * @param year ein Herstellungsjahr.
     */
    void keepLicenceNewerThan(int year) {
    }

    /** Ueberprueft den String fuer ein Nummernschild auf einen korrekten Aufbau.
     * @param string ein Nummernschild.
     * @return ein korrektes Nummernschild
     * @throw IllegalArgumentException, falls das Nummernschild nicht den Regeln entspricht.
     */
    public static String requireValidLicencePlate(String string) {
    }

}
