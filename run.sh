mkdir ./lib/

javac -d ./lib/ ./Data/Common/Student.java
javac -d ./lib/ ./Data/Common/Test.java

cp ./manifest.mf ./lib/
cd ./lib/
jar cvfm lib.jar manifest.mf Data
rm -rf ./manifest.mf ./Data

cd ..
java -classpath .:./lib/lib.jar Client.java
