package exemplos1110;

public class ExemploArray {

    public static void main() {
        int[] vetor = new int[10];
        for (int i=0; i<=15; i++){
            try {
                vetor[i] = i;
                System.out.println(i);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: "+e);
            }
        }
        System.out.println("Teste de Array");
     }
}
