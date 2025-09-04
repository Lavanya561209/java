1.What do you mean by java.
-Java is an object oriented programming language and it is an platform independent.

2.What is bytecode
Byte is an source code when we complie then we will get byte code in the form of special charters.

3.Explain the architecture of jdk.
 JDK Architecture
Jdk is mainly divided into two components
Jre and build tools
In Jre again it is divided into two components 
Jvm and set of libraries

Jdk(Java Development Tool Kit)
Jdk is used for write and execute the java program

Jre(Java runtime environment)
It can be used to make an environment to store the data

Build tools
It is already predefined in the java 
like javadoc,javac,debugger,jars

Jvm(Java virtual machine)
Jvm starts execution from main method we use command java to compile the code
jvm provides an runtime environment

Set of libraries
It is already present in the bin folder
byte code

byte code+libraries=machine understandable language (0's and 1's)
It will integrates byte code and libraries to an machie understandale language 

4.What all operations does jvm do?
Jvm mainly provides an four oprations:
Provide  an runtime environment
Loads the byte code-class loader
Run the byte code
Executes the code

5.What do mean by variables and explain its types?
Variable:-It is an reference type it is used to store memory adress of value
There are four types:
Local variable 
Static variable
Parameterized variable
Instance variable


Local variable:-It can be declared and initalized within an method 
The scope lies inside an method

Static variable:-Static variable are the class level variables and it can be initilaze and declare at the level of class and we can reassign at the method.
It can be initalize at the level of class and we access anywhere.

6.What do you mean by datatype,list the differences between primitive and non-primitive datatypes,mention size of all datatype.
Dataype:-It is a type of data that variable refers too

Differencs between primitive and non-primitive
Primitive data type                                                             Non-primitive datatype
It is an type of data  the sizes are fixed                                      It is an primitive and user defined datatype
It has 8 types                                                                   It has string,array,custom classes
In this data type the sizes are fixed                                             In this datatype the are not fixed


In primitive datatype there are 8 types
byte=1 byte=8 bits
short=2 byte=16 bits
int=4 byte =24 bits
long=8 byte=32 bits
boolean=1 byte 
char =2 byte
float= 4 byte
double= 8 byte


7.What is array,give an example(with program)
Array is an the memory location are fixed
It can be enclosed with square brackets
Ex:-
class Tiffion1{
   public static void main(String[] args){
   String[] dishes={"puligoare","chitarana","pulav"};
   System.out.println("The favourite dishes are:"+dishes[0]);
   }
}

8.Difference between local and static variables and their scopes.
Local variable                                                      Static variables
It can be initialize and decalred inside a method                   It can be decalred and initialzed at the level of class
The scope lies inside an method we can't access                     We can access anywhere it lies anywhere of the class
an outside the method 
More code                                                           Less code

9.What do you mean by methods.
 It is a block of code that perform some specific task 


10.What to mean by static methods,illustrate with an example.
In can be used at the level of main
ex:-
class Morning{
public static void house(){
        System.out.println("My house is very good");
    }
    public static void main(String[] args){
        house();
    }
}

11.What do you mean by method chaining and give an example(with program)
It can be linked to an each main by giving referenceName and we can access another class in same class by using ObjectName.referenceName and it is an circular chain
Ex:-
class Employee1{
   public static void employeeName(){
      System.out.println("The employee name is");
      employeeid();
   }
   public static void employeeid(){
     System.out.println("The employee id is");
   }
   public static void main(String[] args){
      employeeName();
   }    
}

12.What do you mean by default values and who provides default values 
   Default value means alredy defined it values
   Jvm provides an default value at the level of class

13.Write a program to illustrate local and static variables
Program:
Local variables 
class Laptop1{
    public static void main(String[] args){
       int price=18000;
       System.out.println("The price of product is:"+price);
    }
}

Program:
Static variables
class Book1{
   public static void bookName(){
      System.out.println("The name of the book is");
      price();
   }
   public static void price(){
     System.out.println("The price of the book is");
   }
   public static void main(String[] args){
      bookName();
   }    
}







  
 