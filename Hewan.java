import java.util.Iterator;
import java.util.LinkedList;

public class Latihan2 {
    public static void main(String[] args) {
        LinkedList<String> Hewan = new LinkedList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan: " +Hewan);
        System.out.println();

        LinkedList<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        System.out.println("Hewan Yang Akan Di Hapus: ");
        System.out.print(deleteHewan);
        System.out.println();

        Iterator<String> iterator = Hewan.iterator();
        while(iterator.hasNext()){
            String animal = iterator.next();
            if(deleteHewan.contains(animal)){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println("Hasil penghapusan data:");
        for(String animal : Hewan){
            System.out.println(animal);
        }
    }
}
