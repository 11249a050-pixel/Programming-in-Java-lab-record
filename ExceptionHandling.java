public class ExceptionHandling {
     public static void main(String[] args){
        try{
            int a=10;
            int b=10;
            int result = a/b;
            System.out.println("result:" + result);
        }
        catch(ArithmeticException e ){
            System.out.println("Error: cannot divided by zero");
            System.out.println("ExceptionHandling.main()");
        }
        finally{
            System.out.println("finally block executed");
        }
        System.out.println("program continues ExceptionHandling");
    }
    
}