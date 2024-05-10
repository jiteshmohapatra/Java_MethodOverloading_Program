/*Create 3 methods with the name - "myprofile". 
         1st method should return your name,
         2nd method should return your age,
         3rd method should return your emailID and address.
 
         Implement method overloading to complete.*/
		 
		 
class  details{

String myprofile(String a, String b){

   return (a+b);
   
   }
   
 int myprofile(int a){
 
 return a;
 
 }
 
 String myprofile(String a, String b, String c, String d){
 
 return (a+b+c+d);
 
 }
 
 }
 
 
 
 class overloaddis{
 
 public static void main(String args[]){
 
 String a = "Jitesh", b = "Mohapatra";
 
 int c = 24;

 String d = "jitesh",  e = "Mohapatra", f = "2000", g = "@gmail.com";
 
 details d1 = new details();
 
System.out.println("My Name is : "+d1.myprofile(a,b));
System.out.println("My Age is :"+ d1.myprofile(c));
System.out.println("My Email Id is :"+ d1.myprofile(d,e,f,g));

}

}
 
 
 
 
   
 