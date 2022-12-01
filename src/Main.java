import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\SQ269\\IdeaProjects\\AdventOfCode1\\Input.txt";
        List<String> file = null;
        try {
            file = Files.readAllLines(Paths.get(path));
        }
        catch (IOException exception) {
        }
        List<Integer> ElfsCalories = new ArrayList<>();
        Integer suma = 0;
        for (int i=0; i<file.size() ; i++) {
            if (file.get(i).isEmpty()) {
                ElfsCalories.add(suma);
                suma = 0;
                continue;
            }
            suma = Integer.parseInt(file.get(i)) + suma;
        }
        int max = ElfsCalories.get(0);
        for (int i=0; i < ElfsCalories.size(); i++) {
            if (ElfsCalories.get(i) > max)
                max = ElfsCalories.get(i);
        }
        System.out.println(max);
    }
}