set projectlocation=F:\SundaykartSelenium\SeleniumJenkins

cd%Projectlocation%

set classpath=%projectlocation%\bin;%Projectlocation%\lib\*
 
java org.testng.TestNG %projectlocation%\testng.xml

pause