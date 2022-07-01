import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MovieService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path movie = Paths.get("movies.json");

    public static Movies[] readFile() {
        String json = "";
        try {
            json = Files.readString(movie);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return GSON.fromJson(json, Movies[].class);
    }

    public static void writeFile(Movies[] movies) {
        String json = GSON.toJson(movies);
        try {
            byte[] arr = json.getBytes();
            Files.write(movie, arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
