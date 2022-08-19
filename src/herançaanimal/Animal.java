package herançaanimal;

public class Animal {
    private String nome;
    private int idade;
    private boolean doente;
    
    public void setnome (String nome){
        this.nome = nome;
    }
    public String getnome(){
        return this.nome;
    }
    
    public void setidade (int idade){
        this.idade = idade;
    }
    public int getidade(){
        return this.idade;
    }
    
    public boolean doente2;
    public void setdoente(boolean doente){
        doente2 = doente;
    }
    public String setdoente2(){
        if (doente2 == true) {
            return "Esta doente";
        }
        else{
            return "Não está doente";
        }
    }
    
    public boolean dormir2;
    public void setdormir(boolean dormir){
        dormir2 = dormir;
    }
    public String setdormir2(){
        if (dormir2 == true) {
            return "Esta dormindo";
        }
        else{
            return "Não está dormindo";
        }
    }
    
    
    public String pegardados(){
        return nome + " " + idade + " " + doente + " " + dormir2;
    }
}
