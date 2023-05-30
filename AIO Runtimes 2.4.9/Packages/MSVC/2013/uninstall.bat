@echo off
"%~dp0msvc_13_x64.exe" /uninstall /quiet
"%~dp0msvc_13_x86.exe" /uninstall /quiet

call "%~dp0..\uninstall_reg.bat" Visual C++ 2013