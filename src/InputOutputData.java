import java.io.*;
import java.util.ArrayList;

/**
 * Created by pst on 22.02.2017.
 */
public class InputOutputData {

    public static void writeDataToFile(String outPutPath, String[] data) {

        try (FileWriter fileWriter = new FileWriter(outPutPath)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < data.length; ++i) {
                bufferedWriter.write(data[i] + "\n");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList readDataFromFile(String inPutPath) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(inPutPath)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                list.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}