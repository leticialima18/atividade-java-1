public class Produtos {
    public static void main(String[] args) {

        String[] produtos = {
            "Arroz", "Feijão", "Macarrão", "Óleo de Soja", "Açúcar",
            "Sal", "Café", "Leite", "Manteiga", "Pasta de Dente",
            "Bala", "Detergente", "Amaciante", "Shampoo"
        };

        System.out.println("--- Os primeiros itens da lista serão apresentados ---");
        System.out.println(); 

        int limite = Math.min(10, produtos.length); 

        for (int i = 0; i < limite; i++) {
            System.out.println((i + 1) + "º produto: " + produtos[i]);
        }
    }
}
