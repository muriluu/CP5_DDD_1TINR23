package collection;

import java.util.ArrayList;
import java.util.List;

public class Nomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Lucas");
        nomes.add("Pedro");
        nomes.add("Samuel");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

