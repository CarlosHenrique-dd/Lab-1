package br.edu.univas.main;

import java.util.Scanner;

public class Trabalho_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int op;
	float x,y,z;
	
do{System.out.println("1.Somar " + "2.Subtrair " + "3.Multiplicar " + "4.Dividir " + "9.Sair");
op = sc.nextInt();

switch(op){
case 1:System.out.println("Digite o 1� n�mero.");
x = sc.nextFloat();
System.out.println("Digite o 2� n�mero.");
y = sc.nextFloat();	z=x+y;
System.out.println("A Soma de "+x+" por "+y+" � igual a: "+z);break;

case 2:System.out.println("Digite o 1� n�mero.");
x = sc.nextFloat();
System.out.println("Digite o 2� n�mero.");
y = sc.nextFloat();	z=x-y;
System.out.println("A Subtra��o de "+x+" por "+y+" � igual a: "+z);break;

case 3:System.out.println("Digite o 1� n�mero.");
x = sc.nextFloat();
System.out.println("Digite o 2� n�mero.");
y = sc.nextFloat();	z=x*y;
System.out.println("A Multiplica��o de "+x+" por "+y+" � igual a: "+z);break;

case 4:System.out.println("Digite o 1� n�mero.");
x = sc.nextFloat();
System.out.println("Digite o 2� n�mero.");
y = sc.nextFloat();	z=x/y;
System.out.println("A Divis�o de "+x+" por "+y+" � igual a: "+z);break;

case 9:sc.close();break;

default :System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");break;
}}while(op>9||op<9);

}
}