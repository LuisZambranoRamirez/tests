package proyectofinal.modelo.cancion;

import proyectofinal.modelo.estadistica.Continua;
import proyectofinal.modelo.estadistica.Nominal;
import proyectofinal.modelo.estadistica.UnidadAnalisis;
import proyectofinal.modelo.estadistica.Variable;

/**
 *
 * @author L
 */
public class Cancion extends UnidadAnalisis{
    private String nombre;
    private double bpm;
    private String fechaPublicacion;
    private String [] artistas;
    private double duracion; // en segundos
    private String key;
    private String [] generos;
    private double volumenMedioDb;
    private String [] idioma;
    private String [] temaLirico;

    public Cancion() {
    }
        
    public Cancion(String nombre, double bpm, String fechaPublicacion, String[] artistas, double duracion, String key, String[] generos, double volumenMedioDb, String[] idioma, String[] temaLirico) {
        this.nombre = nombre;
        this.bpm = bpm;
        this.fechaPublicacion = fechaPublicacion;
        this.artistas = artistas;
        this.duracion = duracion;
        this.key = key;
        this.generos = generos;
        this.volumenMedioDb = volumenMedioDb;
        this.idioma = idioma;
        this.temaLirico = temaLirico;
        registrarVariables();
    }

    @Override
    protected void registrarVariables() {
        Variable[] das = {
            new Continua("bpm", bpm),
            new Continua("Duracion", duracion),
            new Continua("VolumenMedioDb", volumenMedioDb),
            new Nominal("key", key)
        };

        for (int i = 0; i < das.length; i++) {
            addVariable(das[i]);
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBpm() {
        return bpm;
    }

    public void setBpm(double bpm) {
        this.bpm = bpm;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String[] getArtistas() {
        return artistas;
    }

    public void setArtistas(String[] artistas) {
        this.artistas = artistas;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public double getVolumenMedioDb() {
        return volumenMedioDb;
    }

    public void setVolumenMedioDb(double volumenMedioDb) {
        this.volumenMedioDb = volumenMedioDb;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public String[] getTemaLirico() {
        return temaLirico;
    }

    public void setTemaLirico(String[] temaLirico) {
        this.temaLirico = temaLirico;
    }
    
    
}