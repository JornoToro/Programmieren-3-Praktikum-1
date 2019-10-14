echo "--- Car: starting Checkstyle ---"
java -jar checkstyle-8.25-all.jar -c checkstyle.xml car/Car.java
echo "--- Car:  starting PMD ---"
pmd-bin-6.18.0/bin/run.sh pmd  -no-cache -d car/Car.java -f text  -R pmd.xml
echo "____________________________________________________________________"
echo "--- LicenceAdministration: starting Checkstyle ---"
java -jar checkstyle-8.25-all.jar -c checkstyle.xml car/LicenceAdministration.java
echo "--- LicenceAdministration:  starting PMD ---"
pmd-bin-6.18.0/bin/run.sh pmd  -no-cache -d car/LicenceAdministration.java -f text  -R pmd.xml
