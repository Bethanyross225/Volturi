
public class UniqueSum {
	int sum = 0;
public static int Calculator(int num1, int num2, int num3) {
	if (num1 != num2 && num1 != num3 && num2 != num3) {
		return num1 + num2 + num3; }
	else if (num1 == num2 && num1 != num3) {
		return num3;}
	else if (num1 == num3 && num1 != num2) {
		return num2;}
	else if (num2 == num3 && num2 != num1) {
		return num1;}
	else {
		return 0;
	}}
public static void main(String[] args) {
	System.out.println(Calculator(1,2,3));
}
}

