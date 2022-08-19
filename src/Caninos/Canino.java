package Caninos;

import herançaanimal.Animal;

public class Canino extends Animal{    
    public boolean fazBarulho2;
    public void setfazBarulho(boolean fazBarulho){
        fazBarulho2 = fazBarulho;
    }
    public String setfazBarulho2(){
        if (fazBarulho2 == true) {
            return "Esta fazendo barulho";
        }
        else{
            return "Não está fazendo barulho";
        }
    }
    
    public boolean latir2;
    public void setlatir(boolean latir){
        latir2 = latir;
    }
    public String setlatir(){
        if (latir2 == true) {
            return "Esta latindo";
        }
        else{
            return "Não está latindo";
        }
    }
}
