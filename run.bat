
mkdir lib

javac -d ./lib/ ./Data/Common/Student.java
javac -d ./lib/ ./Data/Common/Test.java

copy manifest.mf lib
cd ./lib/
jar cvfm lib.jar manifest.mf Data
del /f/s/q manifest.mf 
rd /s/q Data

cd ..
java -classpath ".;./lib/lib.jar" Client.java
pause