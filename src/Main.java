import java.util.*;

public class Main {
    static void Run() {

        Movies[] movies = MovieService.readFile();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(String.format("|%3s", "id") + String.format("|%20s", "Movies Name") + String.format("|%15s", "Release of film") + String.format("|%20s", "Producer") + String.format("|%15s|", "Actor"));
        System.out.println("-------------------------------------------------------------------------------");
        for (var movie : movies) {
            System.out.print(movie);
            movie.addActor();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Ex: 2");
        System.out.println("-------------------------------------------------------------------------------");
        Actor[] actors = ActorService.readFile();
        System.out.println(String.format("|%3s", "id") + String.format("|%20s", "FullName") + String.format("|%32s", "BirthDate") + String.format("|%10s", "Biography"));
        System.out.println("-------------------------------------------------------------------------------");
        for (var actor : actors) {
            System.out.println(actor);
        }
        System.out.println("--------------------------------------------------------");
        for (var m : movies) {
            for (var actor : actors) {
                if (m.getActor().equals(actor.fullName())) {
                    System.out.println("Actor: " + m.getActor() + " filmed " + m.getMoviesName() + " movies");
                }
            }
        }
        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {
        Run();
        System.out.println("LinkedList");
        sortLinkedList();
        System.out.println("ArrayList");
        sortArrayList();
        System.out.println("HASHSET");
        sortSet();
        System.out.println("HASHMAP");
        sortMap();
        System.out.println("Queue");
        sortQueue();
    }

    public static void sortLinkedList() {
        List<Movies> list = new LinkedList<>();
        List<Integer> movies = new LinkedList<>();
        Movies[] movie = MovieService.readFile();
        for (var m : movie) {
            list.add(m);
        }

        System.out.println(list);


        for (var m : movie) {
            movies.add(m.getReleaseOfFilm());
        }
        Collections.sort(movies);
        System.out.println(movies);
        List<String> movies1 = new ArrayList<>();
        for (var m : movie) {
            movies1.add(m.getMoviesName());
        }
        Collections.sort(movies1);
        System.out.println(movies1);
    }

    public static void sortArrayList() {
        List<Integer> movies = new ArrayList<>();
        Movies[] movie = MovieService.readFile();
        List<Movies> list = new LinkedList<>();
        for (var m : movie) {

            list.add(m);

        }


        System.out.println(list);

        for (var m : movie) {
            movies.add(m.getReleaseOfFilm());
        }
        Collections.sort(movies);
        System.out.println(movies);
        List<String> movies1 = new ArrayList<>();
        for (var m : movie) {
            movies1.add(m.getMoviesName());
        }
        Collections.sort(movies1);
        System.out.println(movies1);

    }

    public static void sortSet() {
        Set<Integer> movies = new HashSet<>();
        Movies[] movie = MovieService.readFile();
        Set<Movies> set = new HashSet<>();
        for (var m : movie) {
            set.add(m);
        }

        System.out.println(set);
        for (var m : movie) {
            movies.add(m.getReleaseOfFilm());
        }
        System.out.println(movies);
        Set<String> movies1 = new HashSet<>();
        for (var m : movie) {
            movies1.add(m.getMoviesName());
        }
        TreeSet<String> myTreeSet = new TreeSet(movies1);
        System.out.println(myTreeSet);

    }

    public static void sortMap() {


        Map<Integer, String> movies = new HashMap<>();
        Movies[] movie = MovieService.readFile();
        Map<Integer, Movies> movies3 = new HashMap<>();
        for (var m : movie) {
            movies3.put(m.getId(), m);
        }
        System.out.println(movies3);
        {
            for (var m : movie)
                movies.put(m.getReleaseOfFilm(), m.getMoviesName());
        }
        System.out.println(movies);
        System.out.println(movies.containsKey(2021));
        System.out.println(movies.get(2021));
        System.out.println(movies.get(2019));


        System.out.println(movies.containsKey(1));
    }

    public static void sortQueue() {
        Movies[] movie = MovieService.readFile();
        Queue<Movies> queue = new ArrayDeque<>();
        for (var m : movie)
            queue.add(m);
        System.out.println(queue);
        Queue<Integer> queue1 = new ArrayDeque<>();
        for (var m : movie)
            queue1.add(m.getReleaseOfFilm());
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1.contains(2021));

    }

}
