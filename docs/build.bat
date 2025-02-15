REM environment variables
set SRC=src
set BIN=bin
set DATA=data
set DOCS=docs
set LIB=lib
set JAVA_HOME=C:\jdk-21\bin

REM update the PATH environment variables
set PATH=%PATH%;%JAVA_HOME%

REM compile and add my java byte code to the bin folder
javac ..\%SRC%\Main.java > ..\%BIN%

REM run the java byte code
java -cp ..\%BIN%\ Main

pause