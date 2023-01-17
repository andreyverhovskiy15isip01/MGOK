/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    menu();
	    logic();
	}
	public static void menu() {
	    System.out.println("Выберите тип операции:"
		+ "/n" + "1. Сложение"
		+ "/n" + "2. Вычитание"
		+ "/n" + "3. Умножение"
		+ "/n" + "4. Деление");
	}
	
	 public static void logic(){
	     int a = 4;
	      System.out.println("Введите первое значение: ");
	     int b = 30;
	      System.out.println("Введите второе значение: ");
	      int c = 15;
	 
	 
	 switch (a){
	     case 1:
	         int sum = b + c;
	         System.out.println("Ответ: " + sum);
	         break;
	     case 2:
	         int raz = b - c;
	         System.out.println("Ответ: " + raz);
	         break;
	     case 3:
	         int umn = b * c;
	         System.out.println("Ответ: " + umn);
	         break;
	     case 4:
	         if (c == 0) {
	             System.out.println("!Делить на 0 нельзя!" + "\n" + "Попробуйте снова" + "\n");
	              menu(); 
                  logic();
	         }
	         else {
	             int del = b/c;
	              System.out.println("Ответ: " + del);
	         }
	         
	 }
	}
}
