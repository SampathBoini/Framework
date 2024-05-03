set ProjectPath=C:\Users\Hp\eclipse-workspace\Pomframework
cd %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*;
java org.testng.TestNG %ProjectPath%\testng.xml
pause