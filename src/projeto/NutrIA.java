package projeto;
import java.util.Scanner;
public class NutrIA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Usuario user1 = new Usuario();
        Nutricionista nutri1 = new Nutricionista();
        System.out.println("---- Bem vindo ao NutrIA ----");
        System.out.println("Para acessar, primeiro você deve realizar um cadastro, digite:");
        System.out.println(" 1- Cadastra Usuário \n 2- Cadastra Nutricionista \n 3- Sair");
        int op = s.nextInt();
        while(op < 1 || op > 3){
            System.out.println("Opção inválida, digite novamente: ");
            op = s.nextInt();
        }
        while(op != 3){
            switch (op){
                case 1:
                    System.out.println("\nCadastro do Usuário: ");
                    user1.cadastraUsuario();
                    break;
                case 2:
                    System.out.println("\nCadastro da(o) Nutricionista: ");
                    nutri1.cadastraUsuario();
                    nutri1.ditaDieta();
                    nutri1.escolheAlimentos();
                    nutri1.enviaFeedback();
                    break;
                default:
                    System.out.println("\nObrigado por utilizar nossos serviços, volte sempre!");
                    System.out.println("Saindo...");
                    break;
            }
            System.out.println(" 1- Cadastra Usuário \n 2- Cadastra Nutricionista \n 3- Sair");
            op = s.nextInt();
            while(op < 1 || op > 3){
                System.out.println("Opção inválida, digite novamente: ");
                op = s.nextInt();
            }
        }
    }
}
