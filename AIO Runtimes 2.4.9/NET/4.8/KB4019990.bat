@echo off
title Installiere KB4019990
SET arch=x64
IF "%ProgramFiles(x86)%"=="" SET arch=x86
set MSU=%~dp0windows6.1-kb4019990-%arch%.msu
if exist "%MSU%" wusa.exe "%MSU%" /quiet /norestart
