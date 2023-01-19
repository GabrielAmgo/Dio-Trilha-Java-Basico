import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
		PROD = A*B;

		System.out.println("PROD = " + PROD );
	}
}
