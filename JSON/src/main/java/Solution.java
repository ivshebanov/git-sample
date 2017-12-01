import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {

        String fileNameJson = "/Users/iliashebanov/Documents/sample/JSON/src/main/resources/test.json";
        String fileNameJson1 = "/Users/iliashebanov/Documents/sample/JSON/src/main/resources/test1.json";
        Human human = null;
        try {
            human = deserializJson(fileNameJson, Human.class);
            System.out.println(human.getFirstName());
            System.out.println(human.getLastName());
            serializToJson(fileNameJson1, human);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T deserializJson(String fileNameJson, Class<T> tClass) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new FileReader(new File(fileNameJson)), tClass);
    }

    public static void serializToJson(String fileNameJson, Object object) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(new File(fileNameJson)), object);
    }
}
