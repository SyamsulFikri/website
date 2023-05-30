@echo off
REM (C) 2016: Patrick Kuhnke (www.Sereby.org)
SET _app=%*
set debug=0
if %debug% EQU 1 echo %_app%
if %debug% EQU 1 pause
if "%_app%"=="" goto syntax

REM 64 Bit oder 32 bit OS?
set x64=0
if not "%PROGRAMFILES(x86)%"=="" set x64=1

REM 32 Bit
FOR /F "tokens=*" %%A IN ('REG Query HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Uninstall\ /F "%_app%" /D /S 2^>NUL ^| FINDSTR /R /C:"HKEY_"') DO (
	REM echo x86: %%A
	FOR /F "tokens=2*" %%B IN ('REG Query "%%~A" /F UninstallString /V /E ^| FIND /I " UninstallString "') DO (
		echo %%C /q
		if %debug% EQU 0 ( %%C /q )
	)
)

REM 64 Bit
if "%x64%"=="1" (
	FOR /F "tokens=*" %%A IN ('REG Query HKLM\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\Uninstall\ /F "%_app%" /D /S 2^>NUL ^| FINDSTR /R /C:"HKEY_"') DO (
		REM echo x64: %%A
		FOR /F "tokens=2*" %%B IN ('REG Query "%%~A" /F UninstallString /V /E ^| FIND /I " UninstallString "') DO (
			echo %%C /q
			if %debug% EQU 0 ( %%C /q )
		)
	)
)

goto eof

:syntax
echo Falsche Syntax! Suchparameter fehlt
pause

:eof
if %debug% EQU 1 pause
exit /b 0