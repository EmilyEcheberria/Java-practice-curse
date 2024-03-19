
package Modelo;

import Controlador.Reproductor;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

    public class Archivo {
        public Archivo() {
        }

        public static void cargar_canciones(Reproductor reproductor, @org.jetbrains.annotations.NotNull File[] ruta) throws MalformedURLException {
            URL ru = null;

            for(int i = 0; i < ruta.length; ++i) {
                URI r = ruta[i].toURI();
                ru = r.toURL();
                Cancion cancion = new Cancion();
                cancion.setNombre(ruta[i].getName());
                cancion.setUrl(ru);
                reproductor.agregar_a_playlist(cancion);
            }

        }

        public static void cargar_canciones(Reproductor reproductor, URI[] ruta) throws MalformedURLException {
            for(int i = 0; i < ruta.length; ++i) {
                URL ru = ruta[i].toURL();
                Cancion cancion = new Cancion();
                cancion.setNombre(ru.getFile());
                cancion.setUrl(ru);
                reproductor.agregar_a_playlist(cancion);
            }

        }
    }

}
