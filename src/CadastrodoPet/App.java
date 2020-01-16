package CadastrodoPet;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        Responsavel pessoa1 = new Responsavel(

                "maicon",
                "Follmann",
                "04851-030",
                "384",
                17,
                "mai2405rodrigues@gmail.com",
                "976096125"
        );

        Pet animal = new Pet(

                "Drog",
                "Cachorro",
                "Chow Chow",
                6,
                "marrom",
                pessoa1,
                Pet.TiposCuidados.BanhoETosa.toString()
        );

        pessoa1.setNome("Mc Menor da Zs");
        System.out.println(pessoa1.getNome());

        System.out.println();

    }
}

