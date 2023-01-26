package rtg1001;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


class Kadai2 {
    public static void main(String[] args) {

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(".", "rtg1001", "scores.csv"))) {
            String line;
            String[] data;
            while ((line = reader.readLine()) != null) {

                data = line.split(",");
                System.out.println(data[2] + "," + "    " + data[0] + "," + "   "
                        + data[1] + "," + " " + data[3]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}