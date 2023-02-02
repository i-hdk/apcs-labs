import java.util.*;
public class SortRunner
{
    public static void main(String[] args)
    {
        int[] a = new int[100000];
        for(int i = 0; i < 100000; i++) a[i] = i;
        r(a);
        Calendar b = Calendar.getInstance();
        System.out.println("Random array\n---------------");
        b = Calendar.getInstance();
        long s = b.getTimeInMillis();
        Sorts.selectionSort(a);
        b = Calendar.getInstance();
        long e = b.getTimeInMillis();
        System.out.println("Selection time: " + (e-s) + "MS");
        r(a);
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.insertionSort(a);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Insertion time: " + (e-s) + "MS");
        r(a);
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.mergeSort(a,0,100000);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Merge time: " + (e-s) + "MS");
        System.out.println("\nBackwards array\n---------------");
        for(int i = 0; i < 100000; i++) a[i] = 100000-i-1;
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.selectionSort(a);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Selection time: " + (e-s) + "MS");
        r(a);
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.insertionSort(a);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Insertion time: " + (e-s) + "MS");
        r(a);
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.mergeSort(a,0,100000);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Merge time: " + (e-s) + "MS");
        System.out.println("\nSorted array\n---------------");
        for(int i = 0; i < 100000; i++) a[i] = i;
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.selectionSort(a);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Selection time: " + (e-s) + "MS");
        r(a);
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.insertionSort(a);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Insertion time: " + (e-s) + "MS");
        r(a);
        b = Calendar.getInstance();
        s = b.getTimeInMillis();
        Sorts.mergeSort(a,0,100000);
        b = Calendar.getInstance();
        e = b.getTimeInMillis();
        System.out.println("Merge time: " + (e-s) + "MS");
    }
    private static void r(int[] a){
        for(int i = 0; i < 100000; i++){
            int t = a[i];
            int b = (int)(Math.random()*100000);
            a[i] = a[b];
            a[b] = t;
        }
    }
}
