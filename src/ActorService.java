import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ActorService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path actor = Paths.get("actors.json");

    public static Actor[] readFile() {
        String json = "";
        try {
            json = Files.readString(actor);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return GSON.fromJson(json, Actor[].class);
    }

    public static void writeFile(Actor[] actors) {
        String json = GSON.toJson(actors);
        try {
            byte[] arr = json.getBytes();
            Files.write(actor, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
