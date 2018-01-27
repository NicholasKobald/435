#
GNAME= UL
GSRC= $(GNAME).g

all: grammar compiler

grammar: $(GSRCS)
	java org.antlr.Tool -fo . $(GSRC)

compiler:
	javac Types/*.java 
	javac AST/*.java
	javac *.java

clean:
	rm *.class $(GNAME)*.java $(GNAME)__.g $(GNAME).tokens
	rm AST/*class
	rm Types/*class 
