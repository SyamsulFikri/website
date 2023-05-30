@echo off
if [%1] EQU []  goto errParam

REM Infos für den Nutzer
title Java %1 Deinstallation
wmic product where "Name like '%%Java %1 %%'" call uninstall
goto :eof

:errParam
echo Fehler. Check Parameter
echo.
echo Java Version:
echo [%1]
echo.
pause