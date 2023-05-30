@echo off
"%~dp0VC_redist.x64.exe" /uninstall /quiet
"%~dp0VC_redist.x86.exe" /uninstall /quiet

call "%~dp0..\uninstall_reg.bat" Visual C++ 2015
call "%~dp0..\uninstall_reg.bat" Visual C++ 2017
call "%~dp0..\uninstall_reg.bat" Visual C++ 2019