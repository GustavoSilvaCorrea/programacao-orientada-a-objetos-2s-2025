package exemplo_collections;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>(); // Chave e Objeto

        capitais.put("Brasil", "Brasilia");
        capitais.put("França", "Paris");
        capitais.put("Japão", "Tóquio");

        System.out.println(capitais.get("Brasil"));

        if (capitais.containsKey("Argentina")) {
            System.out.println("Existe cadastro da chave Argentina");
        } else{
            System.out.println("Não existe chave da argentina");
        }

        System.out.println(capitais.keySet());

        for (String chave : capitais.keySet()) {
            System.out.println(chave + " - " );
            
        }
    }
}
