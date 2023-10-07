package HashTables;

import java.util.HashMap;

import javax.sound.midi.Soundbank;

public class main {
    public static void main(String[] args) {
        // HashTable hashTable =  new HashTable();

        // // hashTable.printTable();
        // hashTable.set("nails", 100);
        // hashTable.set("tile", 50);
        // hashTable.set("lumber", 80);

        // hashTable.set("bolts", 200);
        // hashTable.set("screws", 140);

        
        // hashTable.printTable();

        // System.out.println("\n"+hashTable.get("nails"));

        // System.out.println("\n"+hashTable.keys());
        
        /* ***************************INTERVIEW QUESTION******************************* */
        // Encontrar si hay algun elemento repetido entre dos listas
        int[] lista1 = new int[]{1,2,3};
        int[] lista2 = new int[]{5,4,6};

        System.out.println(itemInCommon(lista1, lista2));


    }

    public static boolean itemInCommon(int[] lista1, int[] lista2){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for  (int i: lista1){
            hashMap.put(i, true);
        }

        for (int j: lista2){  
            if (hashMap.get(j) != null){
                return true;
            }
        }
        return false;

    }
}
