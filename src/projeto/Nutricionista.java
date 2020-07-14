package projeto;
import java.util.Scanner;
public class Nutricionista{
    
    Scanner s = new Scanner (System.in);
    
    public String nome;
    public String rg;
    public String cpf;
    public String endereco;
    public String telefone;
    public int idade;
    public String crn;
    public String ctps;
    public String alim1;
    public String alim2;
    public String alim3;
    public String dieta;
    public String feedback;
    
    public Nutricionista(){
        
    }
    
    public Nutricionista(String nome, String rg, String cpf, String endereco, String telefone, int idade, String crn, String ctps){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.crn = crn;
        this.ctps = ctps;
    }
    
    
    public void cadastraUsuario(){
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
        System.out.println("\nIdade: ");
        idade = s.nextInt();
        System.out.println("\nCRN: ");
        crn = s.nextLine();
        System.out.println("\nCTPS: ");
        ctps = s.nextLine();
        System.out.println();
    }
    
    public String escolheAlimentos(){
        System.out.println("Deseja inserir alimentos na dieta do paciente?\n 1- Sim \n 2-Não");
        int resp = s.nextInt();
        while(resp != 1 && resp != 2){
            System.out.println("Opção inválida, digite novamente\n 1- Sim \n 2- Não");
            resp = s.nextInt();
        }
        if (resp == 1){
            System.out.println("Escolha 3 alimentos para inserir na dieta do paciente: ");
            alim1 = s.nextLine();
            alim2 = s.nextLine();
            alim3 = s.nextLine();
            return "Os alimentos escolhidos foram: "+alim1+", "+alim2+" e "+alim3;
        }
        else{
            return "...";
        }
    }
    
    public String ditaDieta(){
        System.out.println("Escreva a dieta que deseja passar para seu paciente: ");
        dieta = s.nextLine();
        return "Dieta: "+dieta;
    }
    
    public String enviaFeedback(){
        feedback = s.nextLine();
        return feedback;
    }
    
}
