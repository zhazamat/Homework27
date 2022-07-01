public class Movies implements Comparable {
    private Integer id;
    private String moviesName;
    private Integer releaseOfFilm;
    private String producer;
    private String actor;
    private String role;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMoviesName() {
        return moviesName;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    public Integer getReleaseOfFilm() {
        return releaseOfFilm;
    }

    public void setReleaseOfFilm(Integer releaseOfFilm) {
        this.releaseOfFilm = releaseOfFilm;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    public String getActor() {

        return actor;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {

        return String.format("|%3s", getId()) + String.format("|%20s", getMoviesName()) + String.format("|%15s", getReleaseOfFilm()) + String.format("|%20s", getProducer());
    }

    @Override
    public void addActor() {
        Actor[] actors = ActorService.readFile();
        Movies[] movies = MovieService.readFile();
        movies[0].setActor(actors[0].fullName());
        movies[1].setActor(actors[0].fullName());
        movies[2].setActor(actors[1].fullName());
        movies[3].setActor(actors[2].fullName());
        movies[0].setRole("JJJ");
        movies[1].setRole("AAA");
        movies[2].setRole("BBB");
        movies[3].setRole("CCC");
        MovieService.writeFile(movies);
        System.out.print(String.format("|%15s|", getActor()));

    }

    @Override
    public void addRole() {
        Movies[] movies = MovieService.readFile();
        movies[0].setRole("JJJ");
        movies[1].setRole("AAA");
        movies[2].setRole("BBB");
        movies[3].setRole("CCC");
        movies[4].setRole("JJJ");
        MovieService.writeFile(movies);
        System.out.println(String.format("%15s|", getRole()));
    }

}

