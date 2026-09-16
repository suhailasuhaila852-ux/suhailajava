class Department{
void run(){
System.out.println("Department of computer application");
}
}
class Bca extends Department{
@Override
void run(){
System.out.println("Bca is running smoothly");
}
}
public class MethodOverridingDemo{
public static void main(String[]args){
Department D=new Department();
D.run();
Bca B=new Bca();
B.run();
Department obj=new Bca();
obj.run();
}
}
