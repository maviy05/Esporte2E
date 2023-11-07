public class Main {

    public static void main(String[] args) {
        Pessoa qualquer = new Pessoa();
        // Encapsulamento
        qualquer.setNome("Raissa Leal"); // atribuição
        System.out.println(qualquer.getNome()); // saida de dados

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(345);
        jogadora.setNome("Taissa do volei");
        System.out.println(jogadora.getNome());
        // Polimarfismo
        qualquer = new Esportista();
        String resultado = qualquer.sacar();
        System.out.println(resultado);
        qualquer = new Pessoa();
        resultado = qualquer.sacar();
        System.out.println(resultado);
    }


}