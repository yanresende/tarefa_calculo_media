public class Main {
    public static void main(String[] args) {
        int nota1 = 1 , nota2 = 2, nota3 = 3, nota4 = 4;

        pegarMedia(nota1, nota2, nota3, nota4);
    }

    private static void pegarMedia(int valor1,int valor2, int valor3, int valor4) {
        float media = (valor1 + valor2 + valor3 + valor4) / 4f;
        System.out.println(media);
    }



}