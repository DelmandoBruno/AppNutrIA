package projeto;
public class Alimentos {
    
    Nutricionista nutri1 = new Nutricionista();
    
    public double valorCal;
    public double prot;
    public double carbo;
    public double sodio;
    public double ferro;
    public double gordura;
    public int vitamina;
    
    public void exibirAlimentos(){
        nutri1.escolheAlimentos();
    }
}
