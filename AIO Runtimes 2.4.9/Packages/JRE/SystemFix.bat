@echo off
REM ***********************************
REM Fixen eines Bugs von Windows, da sonst Java nicht unter Systemrechten installiert werden kann
REM Originalwert: %systemroot%\system32\config\systemprofile
REM Quelle: http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=7014194
REM 
reg add "HKLM\SOFTWARE\Wow6432Node\Microsoft\Windows NT\CurrentVersion\ProfileList\S-1-5-18" /V ProfileImagePath /T reg_expand_sz /d "%systemroot%\syswow64\config\systemprofile" /f

