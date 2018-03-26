#
GNAME= UL
GSRC= $(GNAME).g

all: grammar compiler

grammar: $(GSRCS)
	java org.antlr.Tool -fo . $(GSRC)

compiler:
	javac types/*.java 
	javac ast/*.java
	javac jvmgen/*.java
	javac *.java

clean:
	rm *.class $(GNAME)*.java $(GNAME)__.g $(GNAME).tokens
	rm ast/*class
	rm types/*class
	rm jvmgen/*class  
