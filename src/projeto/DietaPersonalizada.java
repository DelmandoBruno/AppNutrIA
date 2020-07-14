package projeto;
import java.util.Scanner;
public class DietaPersonalizada {
    Scanner s = new Scanner (System.in);
    
    Nutricionista nutri1 = new Nutricionista();
    
    public int escolheDieta;
    public String feedback;
    
    public void recebeDieta(){
        
    }
    
    public void mostraFeedback(){
        nutri1.enviaFeedback();
    }
}
