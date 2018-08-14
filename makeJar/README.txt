when you have A .java and .class already compiled
(one file, one class) program:

create 'Manifest.txt' in source directory with minimum:
Main-Class: ClassName

that one line is all that is required. optionally:
Manifest-Version: 1.0 
Created-By: 1.7.0 (Oracle Corporation)

compile(zip) to jar:
$ jar cmf Manifest.txt outName.jar inSource.java inSource.class

you could leave out the inSource.java file, though i'd like
to share source code in my own jars. 

now, execute program:
$ java -jar outName.jar

This is similar with multiple classes or package
directory. Simply:
jar cmf Manifest.txt outName.jar path/to/classfiles

Extra:
list files in jar:
$ jar tfv outName.jar
extract files from jar
$ jar xf outName.jar
