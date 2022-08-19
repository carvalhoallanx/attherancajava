package Felinos;

import herançaanimal.Animal;

public class Felino extends Animal{
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
    
    public boolean miar2;
    public void setmiar(boolean miar){
        miar2 = miar;
    }
    public String setmiar2(){
        if (miar2 == true) {
            return "Esta miando";
        }
        else{
            return "Não está miando";
        }
    }
}
