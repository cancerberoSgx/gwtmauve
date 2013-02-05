mauve project java tests and test framework for gwt. 
@author: sgurin - Sebastián Gurin
Notes: 

0) the testing framework is in a separate module / jar so it can be reused by other java projects. 
All the Java compatibility tests are in a second gwt module with an entry point.  

1) the same original java package names are used. Not so "gwt", but nice because it allow us to easily integrate new versions of mauveproject sources

2) some few tests in lang and util were commented because of Java compile errors.
you can know who they are in eclipse Problems view (unsexpected error while validating xxx.java)
others tests/packages has be erased because they are tests over java apis not supported by gwt 

3) some parts of the testing framework has been commented because are not compatible with Java GWT.
