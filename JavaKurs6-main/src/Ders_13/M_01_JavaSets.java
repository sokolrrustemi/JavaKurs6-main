package Ders_13;
import java.util.*;

public class M_01_JavaSets {
    //Verilen bir dizideki tekrarlanan sayıları bulan ve bu sayıları bir Set kullanarak
    // döndüren bir Java metodunu yazın.


    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 2, 4, 10, 6};

        Set<Integer> duplicateNumbers = findDuplicates(numbers);
        System.out.println("Tekrarlanan Sayılar: " + duplicateNumbers);
    }
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
