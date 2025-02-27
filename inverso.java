public class inverso {
    public void invertir(){
        int [] array = {4,6,2,8,7};
        int [] auxiliar = new int[array.length];
 
        for (int i = 0; i < array.length; i++) {
            int j = array.length-i-1;
            auxiliar[j] = array[i];
        }
        array = auxiliar;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

