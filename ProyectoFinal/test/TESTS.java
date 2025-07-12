import proyectofinal.modelo.cancion.Cancion;
import proyectofinal.modelo.machineLearning.ModeloMachineLearning;
import proyectofinal.modelo.estadistica.UnidadAnalisis;

/**
 *
 * @author L
 */
public class TESTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnidadAnalisis[] canciones = new Cancion[] {
            new Cancion(
                "Midnight Skyline",
                120.5,
                "2020-08-14",
                new String[]{"Aurora Blue", "DJ Echo"},
                245.0,
                "A Minor",
                new String[]{"Electronic", "Synthwave"},
                -6.3,
                new String[]{"Inglés"},
                new String[]{"Noche", "Melancolía"}
            ),
            new Cancion(
                "Raíces del Viento",
                95.0,
                "2018-05-09",
                new String[]{"Luz del Sur"},
                189.0,
                "D Major",
                new String[]{"Folk", "Andina"},
                -5.0,
                new String[]{"Español"},
                new String[]{"Naturaleza", "Identidad"}
            ),
            new Cancion(
                "Neon Samurai",
                135.0,
                "2022-01-30",
                new String[]{"Kyoto Pulse"},
                212.0,
                "F# Minor",
                new String[]{"J-Pop", "Techno"},
                -4.8,
                new String[]{"Japonés"},
                new String[]{"Futurismo", "Batalla"}
            ),
            new Cancion(
                "Corazón Acústico",
                78.0,
                "2017-10-11",
                new String[]{"Andrea Sol", "Drako"},
                175.5,
                "G Major",
                new String[]{"Acústica", "Pop"},
                -7.2,
                new String[]{"Español"},
                new String[]{"Amor", "Recuerdos"}
            ),
            new Cancion(
                "Echoes of the Past",
                100.0,
                "2015-03-22",
                new String[]{"Shadow Ensemble"},
                260.0,
                "E Minor",
                new String[]{"Orchestral", "Ambient"},
                -3.6,
                new String[]{"Inglés"},
                new String[]{"Memoria", "Historia", "Reflexión"}
            ),
            new Cancion(
                "Midnight Skyline",
                120.5,
                "2020-08-14",
                new String[]{"Aurora Blue", "DJ Echo"},
                245.0,
                "A Minor",
                new String[]{"Electronic", "Synthwave"},
                -6.3,
                new String[]{"Inglés"},
                new String[]{"Noche", "Melancolía"}
            )
        };


        //DataFrame dataFrame = new DataFrame(canciones);

        ModeloMachineLearning machineLearning = new ModeloMachineLearning(canciones);

    }
    
}
