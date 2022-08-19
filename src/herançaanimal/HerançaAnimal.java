package herançaanimal;

import Caninos.Cachorro;
import Caninos.Lobo;
import Felinos.Gato;

public class HerançaAnimal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setnome("Apolo");
        cachorro.setidade(4);
        cachorro.setdoente(false);
        cachorro.setdormir(false);
        cachorro.setfazBarulho(true);
        cachorro.setlatir(true);
        cachorro.setProcurarcomida(true);
        System.out.println(cachorro.pegardados());
        
        Lobo lobo = new Lobo();
        lobo.setnome("Shake");
        lobo.setidade(7);
        lobo.setdoente(false);
        lobo.setdormir(true);
        lobo.setfazBarulho(true);
        lobo.setlatir(false);
        lobo.setProcurarcomida(true);
        System.out.println(lobo.pegardados());
        
        Gato gato = new Gato();
        gato.setnome("Miauuu");
        gato.setidade(6);
        gato.setdoente(false);
        gato.setdormir(false);
        gato.setfazBarulho(true);
        gato.setmiar(true);
        gato.setProcurarcomida(true);
        System.out.println(gato.pegardados());
    }
    
}
