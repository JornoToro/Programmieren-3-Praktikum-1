echo "--- starting Checkstyle ---"
java -jar checkstyle-8.25-all.jar -c checkstyle.xml car/Car.java
echo "--- starting PMD ---"
pmd-bin-6.18.0/bin/run.sh pmd  -no-cache -d car/Car.java -f text  -R pmd.xml
