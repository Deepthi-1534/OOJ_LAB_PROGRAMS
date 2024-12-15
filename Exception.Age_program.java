class WrongAge extends Exception
 {
  public WrongAge(String message)
   {
    super(message);
   }
 }

class Father 
 {
  int age;
  public Father (int age) throws WrongAge
   {
    if(age<0)
     {
      throw new WrongAge("Father's age cannot be negative");
     }
    this.age=age;
    System.out.println("Father's age : " +this.age);
   }
 }

class Son extends Father 
 {
  int s_age;
  public Son(int f_age , int s_age) throws WrongAge
   {
    super(f_age);
    if(s_age>=f_age)
     {
      throw new WrongAge("Son's age cannot be more than Father's age");
     }
    this.s_age=s_age;
    System.out.println("Son's age : " +this.s_age);
   }
 }
public class Main 
 {
  public static void main(String[] args)
   {
   try
    {
     Son s1= new Son(30,36);
    }
   catch(WrongAge e )
    {
      System.out.println("Exception : " +e.getMessage());
    }
 }
} 
