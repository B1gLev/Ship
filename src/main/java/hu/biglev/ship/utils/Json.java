package hu.biglev.ship.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import hu.biglev.ship.Main;
import org.json.simple.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Json {

    private File folder;

    public void createJsonFile(String path) throws IOException {

        folder = new File(Main.getInstance().getDataFolder()+"/Data/");
        File json = new File(folder + "/"+ path+".json/");

        if (!folder.exists()){
            folder.mkdirs();
            return;
        }

        if (!json.exists()){
            json.createNewFile();
            return;
        }
    }

    public void writeFile(String path, JSONArray jsonArray) {

        folder = new File(Main.getInstance().getDataFolder()+"/Data/");

        try (FileWriter writer = new FileWriter(folder+"/"+path)){

            ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
            String json = mapper.writeValueAsString(jsonArray);

            writer.write(json);
            writer.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
