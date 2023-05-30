@echo off
title .NET Framework 2.0 - 3.5.1 für Windows 8

REM Laufwerk mit dem Setup finden (USB/DVD)
set src=?
for %%i in (D E F G H I J K L M N O P Q R S T U V W X Y Z) do if exist %%i:\sources\boot.wim set src=%%i:

REM Laufwerk gefunden?
if %src%==? set ERRORLEVEL=404
if ERRORLEVEL 404 goto ende

DISM.exe /online /enable-feature /featurename:NetFX3 /All /Source:"%src%\Sources\SXS" /LimitAccess
echo Fertig
exit /b

:ende
echo Fehler
pause