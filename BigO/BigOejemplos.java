package BigO;

/**
 * BigOejemplos
 */
public class BigOejemplos {

    public static void main(String[] args) {
        
    }

    public static void bigOconstante (int n){
        System.out.println(n+n);
    }
    public static void bigOlineal (int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    public static void bigOcuadratica (int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(n + " " + j);
            }
        }
    }
    public static void bigOlogaritmica (int n){
        int array[]={33,3,4,5,1,2,6,7,8,9};
        int longitud = array.length;
        int mitad = longitud / 2;
        while (true){
            
        }
    }

}