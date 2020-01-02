CALL C:/software/jboss/EWS/Tomcat-8.0.26-64bit/bin/shutdown.bat
echo %cd%

RMDIR /Q/S "C:/Users/xprk482/IdeaProjects/spring.cloud/target"
echo %cd%

RMDIR /Q/S "C:/software/jboss/EWS/Tomcat-8.0.26-64bit/webapps/spring.cloud-0.0.1-SNAPSHOT"
echo %cd%

DEL /S/Q "C:/software/jboss/EWS/Tomcat-8.0.26-64bit/webapps/spring.cloud-0.0.1-SNAPSHOT.war"
echo %cd%

CALL mvn clean install -DskipTests=true
echo %cd%



COPY /Y "C:\Users\xprk482\IdeaProjects\spring.cloud\target\spring.cloud-0.0.1-SNAPSHOT.war" "C:\software\jboss\EWS\Tomcat-8.0.26-64bit\webapps/spring.cloud-0.0.1-SNAPSHOT.war"
echo %cd%

CALL C:/software/jboss/EWS/Tomcat-8.0.26-64bit/bin/startup.bat
echo %cd%