class DataTypeInspector{
  public static void main(String[] args){   
  
      //Integers types
      byte b=10;   //smallest integer type(-128 to 127)
      short s=300; //small integer type
      int i=5000;  //common integer type
      long l=200000L; //Long integer type (note the 'l')
      
      //Floating-point types
      float f=3.14f; //Float require 'f' suffix
      double d=99.99; //Double is default decimal type
      
      //character type
      char c='A'; //Holds a single character
      
      //Boolean type
      boolean flag=true; //store true/false values
      
      // Printing all values
      System.out.println("Byte value: " + b);
      System.out.println("Short value: " + s);
      System.out.println("Int value: " + i);
      System.out.println("Long value: " + l);
      System.out.println("Float value: " + f);
      System.out.println("Double value: " + d);
      System.out.println("char value: " + c);
      System.out.println("Boolean value: " + flag);
  }
}