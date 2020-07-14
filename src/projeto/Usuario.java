package projeto;
import java.util.Scanner;
public class Usuario {
    
    public String nome;
    public String rg;
    public String cpf;
    public String endereco;
    public String telefone;
    public int objetivo;
    public int restricoesA;
    public int idade;
    public double peso;
    public double altura;
    
    public Usuario(){
        
    }
    
    public Usuario(String nome, String rg, String cpf, String endereco, String telefone, int objetivo, int restricoesA, int idade, double peso, double altura){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.objetivo = objetivo;
        this.restricoesA = restricoesA;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void cadastraUsuario(){
        Scanner s = new Scanner (System.in);
        System.out.println("Nome: ");
        nome = s.nextLine();
        System.out.println("\nRG: ");
        rg = s.nextLine();
        System.out.println("\nCPF: ");
        cpf = s.nextLine();
        System.out.println("\nEndereço: ");
        endereco = s.nextLine();
        System.out.println("\nTelefone: ");
        telefone = s.nextLine();
        System.out.println("\nObjetivo: \n 1- para emagrecer \n 2- para ganhar massa \n 3- para ganhar peso");
        objetivo = s.nextInt();
        while(objetivo < 1 || objetivo > 3){
            System.out.println("\nObjetivo inválido, por favor digite novamente: ");
            System.out.println(" 1- para emagrecer \n 2- para ganhar massa \n 3- para ganhar peso");
            objetivo = s.nextInt();
        }
        System.out.println("\nRestrições Alimentares: \n 1- para glúten \n 2- para lactose \n 3- para frutos do mar \n 0- para nenhuma");
        restricoesA = s.nextInt();
        while(restricoesA < 0 || restricoesA > 3){
            System.out.println("\nTipo de restrição inválido, por favor digite novamente: ");
            System.out.println(" 1- para glúten \n 2- para lactose \n 3- para frutos do mar \n 0- para nenhuma");
            restricoesA = s.nextInt();
        }
        System.out.println("\nIdade: ");
        idade = s.nextInt();
        System.out.println("\nPeso: ");
        peso = s.nextDouble();
        System.out.println("\nAltura: ");
        altura = s.nextDouble();
    }
}
