package matriz;

public class MatrizProdutos {
    public static void main(String[] args) {
    	String[][] produtos = new String[][] {
        		{"Macbook Air"},
                {"Macbook Pro"},
                {"Dell XPS"},
                {"Lenovo"},
                {"Sansumg 360"}
        };

        int totalElementos = 0;
        for (String[] produto : produtos) {
            totalElementos += produto.length;
        }
        
        System.out.println("Total de elementos na matriz: " + totalElementos);
    }
}

