@echo off
if [%1]==[] GOTO ERROR

copy ..\build-one.xml build.xml
call ant jar -Dmain-class=com.xml2j.tutorial.subst2.application.Subst2Application -Djar.name=%1.jar
del build.xml

goto END

:ERROR	
	echo Missing MODULE
:END
