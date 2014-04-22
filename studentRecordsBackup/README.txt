
CS542 Design Patterns
Fall 2013
PROJECT-4 README FILE

Due Date: Sunday, November 24, 2013
Submission Date: Sunday, November 24, 2013
Grace Period Used This Project: 0 Days
Grace Period Remaining: N/A
Author(s): Abhishek Waichal
e-mail(s): awaicha1@binghamton.edu


PURPOSE:

[
  I have implemented this project to in which I'm maintaining a main BST(Binary Search tree) and it two backups.
  I have used the visitor pattern to add the values of all the nodes.
  I have used the visitor pattern to update each node of the BST by adding the integer UPDATE_VALUE to the B-Number.
  Each node in backup-1 and backup-2 is updated using the observer pattern whenever a node in the original BST is changed. 
  I've used Java's built-in observer pattern.  
  
  JAVADOC is created: studentRecordsBackup/javadoc/index.html
]

PERCENT COMPLETE:

[
 I believe, we have completed 100% of this project.
]

PARTS THAT ARE NOT COMPLETE:

[
 N/A
]

BUGS:

[
 None
]

FILES:
[
  Driver.java			:-  This class contains the 'main' method.
  BST.java				:-  This class contains BST related variables and methods.
  Node.java				:-    This class contains Node related variables and methods.
  BSTBuilder.java		:-  This class is used to build BST.
  Visitor.java			:-  This interface is used to implement visitor pattern.
  AddVisitor.java		:-  This class is used to implement visitor pattern for performing sum operation.
  UpdateVsitor.java		:-    This class is used to implement visitor pattern for performing update  operation.
  Debug.java			:-  This class is used for logging purpose.
]

DEBUG VALUES:
[
 0 - For Output
 1 - For checking all constructors called
 2 - For erroneous input
]

SAMPLE OUTPUT:
[
 bingsuns2% ant clean
Buildfile: build.xml

clean:
   [delete] Deleting directory /u0/users/5/awaicha1/542/A4/studentRecordsBackup/build

BUILD SUCCESSFUL
Total time: 1 second
bingsuns2% ant compile
Buildfile: build.xml

prepare:
    [mkdir] Created dir: /u0/users/5/awaicha1/542/A4/studentRecordsBackup/build
    [mkdir] Created dir: /u0/users/5/awaicha1/542/A4/studentRecordsBackup/build/classes

studentRecordsBackup:
    [javac] Compiling 8 source files to /u0/users/5/awaicha1/542/A4/studentRecordsBackup/build/classes

compile:

BUILD SUCCESSFUL
Total time: 6 seconds
bingsuns2% ant run
Buildfile: build.xml

jar:
      [jar] Building jar: /u0/users/5/awaicha1/542/A4/studentRecordsBackup/build/jar/studentRecordsBackup.jar

run:

     [java] BUILDING TREES USING BSTBUILDER...
     [java] ________________________________________________


     [java] INORDER TRAVERSALS:

     [java] Original BST:
     [java]  122345 123456 233455 284756 583173 778912 987724

     [java] Backup BST1:
     [java]  122345 123456 233455 284756 583173 778912 987724

     [java] Backup BST2:
     [java]  122345 123456 233455 284756 583173 778912 987724
     [java] ________________________________________________


     [java] SUM OF ALL NODES:


     [java] Original BST:
     [java] Addition of all nodes: 3113821

     [java] Backup BST1:
     [java] Addition of all nodes: 3113821

     [java] Backup BST2:
     [java] Addition of all nodes: 3113821
     [java] ________________________________________________


     [java] UPDATING ALL NODES BY UPDATE_VALUE...

     [java] ________________________________________________


     [java] INORDER TRAVERSALS AFTER UPDATE:


     [java] Original BST:
     [java]  122348 123459 233458 284759 583176 778915 987727

     [java] Backup BST1:
     [java]  122348 123459 233458 284759 583176 778915 987727

     [java] Backup BST2:
     [java]  122348 123459 233458 284759 583176 778915 987727
     [java] ________________________________________________


     [java] SUM OF ALL NODES AFTER UPDATE:


     [java] Original BST:
     [java] Addition of all nodes: 3113842

     [java] Backup BST1:
     [java] Addition of all nodes: 3113842

     [java] Backup BST2:
     [java] Addition of all nodes: 3113842

BUILD SUCCESSFUL
Total time: 2 seconds]

TO COMPILE:
[
 gunzip waichal_abhishek_assign4.tar.gz
 tar -xvf waichal_abhishek_assign4.tar
 cd abhishek_waichal
 cd studentRecordsBackups
 ant compile
 ant run
]

TO RUN:
[
   ant run
]

EXTRA CREDIT:
[
 N/A
]


BIBLIOGRAPHY:
This serves as evidence that we are in no way intending Academic Dishonesty.
<Abhishek Waichal>

[
	. JAVA API Documentation (http://docs.oracle.com/javase/7/docs/api/)
	. Complete Reference - JAVA
]
