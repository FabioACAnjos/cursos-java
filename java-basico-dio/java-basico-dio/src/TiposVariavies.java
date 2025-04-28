public class TiposVariavies {
    public static void main(String[] args) throws Exception {

        double salarioMinimo = 2500.33;
 
        int cep = 21070333; // se começar com zero, talvez seja melhor utilizar outro tipo 
 
        byte idade = 123;
 
        short ano = 2021;
 
        long cpf = 98765432109L; // se começar com zero, talvez seja melhor utilizar outro tipo, o long também precisa terminar com L, para ser mentido o número completo.
 
        float pi = 3.14F; // variável tipo float tem que colocar o F no final.
 
     }
 
     //Cenário 1
 
     public static void anotacoes(String[] args) {
         
         short numeroCurto = 1;
 
         int numeroNormal = numeroCurto;
 
         // short numeroCurto2 = numeroNormal; //Aqui ele indica o erro, pois em algum momento o numero int poderá ser maior do que a capacidade do short. 
 
         //
         
 
     }
     
 
 }


