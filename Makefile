CLASSPATH=lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:.
Test: MarkdownParseTest.class
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParseTest.class: MarkdownParse.class MarkdownParseTest.java
	javac -cp $(CLASSPATH) MarkdownParseTest.java

MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java