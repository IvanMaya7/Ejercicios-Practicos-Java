public class claseSuma {

            private int n1=0;
            private  int n2=0;
            public void setn1 (int num1){
                n1=num1;
            }
            public void setn2 (int num2){
                n2=num2;
            }
            public int Resultado(){
                //int r=n1+n2;
                return n1+n2;
                //System.out.println("El resultado de la suma es: " + r);
            }
            public int resta(){
                return n1 - n2;
            }
            public int multiplicacion(){
                return n1 * n2;
            }
            public int division(){
                return n1 / n2;
            }
    }