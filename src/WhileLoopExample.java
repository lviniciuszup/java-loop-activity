public class WhileLoopExample {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int i = 0;
        while (i < numeros.length) {
            System.out.println("Numero de hoje é: " + numeros[i++]);
        }
    }
}