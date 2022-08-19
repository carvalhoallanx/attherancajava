package Felinos;

public class Gato extends Felino{
    public boolean Procurarcomida2;
    public void setProcurarcomida(boolean Procurarcomida){
        Procurarcomida2 = Procurarcomida;
    }
    public String setProcurarcomida2(){
        if (Procurarcomida2 == true) {
            return "Esta procurando comida";
        }
        else{
            return "Não está procurando comida";
        }
    }
    
    public String pegardados(){
        return "Nome :" + getnome() + " ,Idade :" + getidade()+ " ,Doente :" + setdoente2() + ", "+ setdormir2()+ ", " + setmiar2()+ ", " + setfazBarulho2() + ", "+setProcurarcomida2();
    }
}
