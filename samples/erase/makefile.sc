#Digital Mars (was Symantec) C++ makefile 
WXDIR = $(WXWIN)
EXTRALIBS=
TARGET=erase
OBJECTS = $(TARGET).obj
include $(WXDIR)\src\makeprog.sc
