public class Peliculas {
    private final String id;
    private String titulo;
    private int anio;
    private String idioma;
    private String genero;
    private String director;

    public Peliculas(String id, String titulo, int anio, String idioma, String genero, String director) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.idioma = idioma;
        this.genero = genero;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", idioma='" + idioma + '\'' +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
