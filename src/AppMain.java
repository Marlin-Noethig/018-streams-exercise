import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppMain {


    public static void main(String[] args){

        //initial
        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};

        //1.) sort
        int[] zahlenSortiert = Arrays.stream(zahlen).sorted().toArray();
        System.out.println(Arrays.toString(zahlenSortiert));

        //2.) sum array
        System.out.println("___");
        int sum = Arrays.stream(zahlen).sum();
        System.out.println(sum);

        // 3.) multiply array
        System.out.println("___");
        int product = Arrays.stream(zahlen).reduce(1, (subtotal, element) -> subtotal * element);
        System.out.println(product);

        // 4.) student.csv handling into normal System Out

        System.out.println("___");

        try {
            Files.lines(Path.of("src/students.csv"))
                    .skip(1)
                    .forEach(line -> System.out.println(line));

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        // 5.) student.csv handling into normal System Out
        try {

            System.out.println("---");

            List<Student> students = Files.lines(Path.of("src/students.csv"))
                    .skip(1)
                    .filter(line -> !line.isEmpty())
                    .distinct()
                    .map(line -> line.split(","))
                    .map(line -> new Student(line[0], line[1], line[2], line[3]))
                    .toList();

            System.out.println(students);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
