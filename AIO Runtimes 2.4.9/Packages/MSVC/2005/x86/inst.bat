@echo off
msiexec /i %~dp0vcredist.msi /q transforms=%~dp02k5-x86.mst
pause