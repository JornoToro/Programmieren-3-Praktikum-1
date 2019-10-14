echo "--- Car: starting Checkstyle ---"
java -jar libs/checkstyle-8.25-all.jar -c checkers_xml/checkstyle.xml src/car/Car.java
echo "--- Car:  starting PMD ---"
libs/pmd-bin-6.18.0/bin/run.sh pmd  -no-cache -d src/car/Car.java -f text  -R checkers_xml/pmd.xml
echo "____________________________________________________________________"
echo "--- LicenceAdministration: starting Checkstyle ---"
java -jar libs/checkstyle-8.25-all.jar -c checkers_xml/checkstyle.xml src/car/LicenceAdministration.java
echo "--- LicenceAdministration:  starting PMD ---"
libs/pmd-bin-6.18.0/bin/run.sh pmd  -no-cache -d src/car/LicenceAdministration.java -f text  -R checkers_xml/pmd.xml
