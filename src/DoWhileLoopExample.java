public class DoWhileLoopExample {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int i = 0;
        do{
            System.out.println("Numero de hoje é: " + numeros[i++]);}
        while (i < 5);
    }
}