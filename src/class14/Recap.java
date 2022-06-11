package class14;

public class Recap {
    public static void main(String[] args) {
        String str = "Asghar never forgets about recording";
        System.out.println(str.replace("never","always"));

        str = "hdssgfjfd123143235!%#$@%$#%%$^";
        System.out.println(str.replaceAll("[0-9]",""));

        String str2 = "Batch 13 is great. Batch 13 is the best. Batch 13 is excellent";
        String [] arr = str2.split("[.]");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
