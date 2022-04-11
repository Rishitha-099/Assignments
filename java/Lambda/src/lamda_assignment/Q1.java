package lamda_assignment;

interface mathop{
	double oper(int a,int b);
}
public class Q1 {
	public static double addition(int num1,int num2){
		return num1+num2;}
    public static double subtraction(int num1,int num2){
		return num1-num2;}
    public static double multiplication(int num1,int num2){
		return num1*num2;}
    public static double division(int num1,int num2){
		return num1/num2;}
    public static void main(String[] args) {
    	mathop addition = (a,b)->addition(a, b);
		System.out.println("addition of numbers is "+addition.oper(50, 6));
		
		mathop substaction = (a,b)->subtraction(a, b);
		System.out.println("substaction of numbers is "+substaction.oper(50, 6));
		
		mathop multiplication = (a,b)->multiplication(a, b);
		System.out.println("multiplication of numbers is "+multiplication.oper(50, 6));
		
		mathop division = (a,b)->division(a, b);
		System.out.println("division of numbers is "+division.oper(50, 6));
    }

}
