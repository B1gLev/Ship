package hu.biglev.ship.Utils;

import com.google.gson.JsonObject;
import hu.biglev.ship.Main;

import java.io.File;
import java.io.IOException;

public class Json {

    public void createJsonFile(String path) throws IOException {

        File folder = new File(Main.getInstance().getDataFolder()+"/Data/");
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
}
