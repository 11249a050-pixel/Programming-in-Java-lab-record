public class VariableDemo{
int instanceVar=10;
static String staticVar = "I am static";
public void showVariables(){
int localVar = 5;
System.out.println("Instance Varible:"+instanceVar);
System.out.println("Static Variable:"+statVar);
System.out.println("Local Variable:"+localVar);
}
public static void main(String[]args){
VariablesDemo obj1 = new VariablesDemo();
obj1.showVariables();
System.out.println(
"Accessing static Variable via class:"+VariablesDemo.staticVar);
}
}