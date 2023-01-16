import java.util.Locale;
import java.util.Scanner;

/* 
Essa classe foi criada para demonstrar a execução
da mesma pelo terminal, através da atribuição dos argumentos
e do objeto scanner para interpretá-los
*/

public class AboutMe {

    public static void main (String [] args) {

        //Criando o objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Type your name");
        String name = scanner.next();

        System.out.println("Type your lastname");
        String lastName = scanner.next();

        System.out.println("Type your age");
        int age = scanner.nextInt();

        System.out.println("Type your height");
        int height = scanner.nextInt();

        System.out.println("Hello, my name is " + name +" " + lastName);
        System.out.println("I'm " + age + " years old");
        System.out.println("And i'm " + height + " cm tall");
    }

    }
