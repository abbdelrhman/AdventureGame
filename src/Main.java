import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        int loc = 1 ;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            }
            System.out.print("available directions : ");
            Map<String ,Integer> map =locations.get(loc).getExits();
            for (String s : map.keySet()){
                System.out.print(s+",");
            }
            System.out.println();
            String i = scanner.nextLine().toUpperCase();
            if(map.containsKey(i)){
                loc = map.get(i);
            }else {
                System.out.println("you can't go in that direction");
            }

        }

    }

}
