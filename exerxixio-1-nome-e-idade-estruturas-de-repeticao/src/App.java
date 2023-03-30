import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;

        do{
            System.out.println("Nome: ");
            nome = scan.next();
            System.out.println("Idade: ");
            idade = scan.nextInt();
            
        }while(nome.equals("0"));
    }
}
