public class P_1_vectorDirection {
    int [] vector = new int[10];

    public P_1_vectorDirection(){

    }
    public void ejecutivo(){
        for (int i = 0 ; i< vector.length; i++){
            int aleatorio = (int) (Math.random() * 18 + 1);

            vector[i] = aleatorio;
        }
        for (int i = 0 ; i< vector.length ; i++){
            int numero = vector[i];
            int cuadrado = (int) Math.pow(numero, 2);
            int cubo = (int) Math.pow(numero, 3);

            System.out.println("VECTOR DE NUMERO [" + i + "]:" +numero+ ", " + cuadrado + ", "+ cubo + ".");
        }
    }
}
