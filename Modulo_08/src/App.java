public class App {
    public static void main(String[] args) throws Exception {
        calculaMedia(10, 10,8,8);
    }

    public static void calculaMedia(int notaGeo, int notaMat, int notaPor, int notaIng) {
        int mediaFinal = (notaGeo + notaMat + notaPor + notaIng) / 4;

        if (notaGeo > 10 || notaMat > 10 || notaPor > 10 || notaIng > 10) {
            System.out.println("Adicione uma nota com valor maximo 10");
        } else if (mediaFinal > 7) {
            System.out.println("Media final: " + mediaFinal);
            System.out.println("APROVADO");
        } else {
            System.out.println("Media final: " + mediaFinal);
            System.out.println("REPROVADO");
        } 
    }
}