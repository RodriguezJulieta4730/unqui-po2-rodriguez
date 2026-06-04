package tpComposite.SistemaDeArchivos;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaDeArchivosTest {

    @Test
    void teste001_archivosYCarpeta(){
        FyleSystem archivo1 = new Archivo("foto1", 1);
        FyleSystem archivo2 = new Archivo("foto2", 2);
        FyleSystem directorio1 = new Directorio("Objetos",archivo1,archivo2);
        assertEquals(3, directorio1.totalSize());
    }

    @Test
    void teste002_archivosYCarpetaConArchivos(){
        FyleSystem archivo1 = new Archivo("foto1", 1);
        FyleSystem archivo2 = new Archivo("foto2", 2);
        FyleSystem directorio1 = new Directorio("Objetos",archivo1,archivo2);
        FyleSystem directorio2 = new Directorio("Objetos",directorio1,archivo2);
        FyleSystem directorio3 = new Directorio("Objetos",directorio2,archivo2);
        assertEquals(7, directorio3.totalSize());
    }

    @Test
    void teste003_ElementoMasNuevo() throws InterruptedException {
        FyleSystem archivo1 = new Archivo("foto1", 1);
        FyleSystem archivo2 = new Archivo("foto2", 2);
        FyleSystem directorio1 = new Directorio("Objetos",archivo1,archivo2);
        FyleSystem directorio2 = new Directorio("Objetos",directorio1,archivo2);
        FyleSystem directorio3 = new Directorio("Objetos",directorio2,archivo2);
        sleep(100);
        archivo1.cambiarNombre("archivo3");
        assertEquals(archivo1, directorio3.lastModified());
    }

    @Test
    void teste004_CambiarNombreDirectorioActualizaSuFecha() throws InterruptedException {
        FyleSystem archivo1 = new Archivo("foto1", 1);
        FyleSystem archivo2 = new Archivo("foto2", 2);
        Directorio directorioHijo = new Directorio("FotosViejas", archivo1, archivo2);
        Directorio directorioRaiz = new Directorio("Root", directorioHijo);
        sleep(100);
        directorioHijo.cambiarNombre("FotosModificadas");
        assertEquals(directorioHijo, directorioRaiz.lastModified());
    }

    @Test
    public void test05() {
        FyleSystem picture1 = new Archivo("Pic1", 200);
        FyleSystem picture2 = new Archivo("Pic2", 250);
        FyleSystem picture3 = new Archivo("Pic3", 150);
        FyleSystem folder1 = new Directorio("Folder1", picture1, picture2);
        FyleSystem folder2 = new Directorio("Folder2", picture3, folder1);

        String tree = """
            Folder2
              Pic3
              Folder1
                Pic1
                Pic2""";

        assertEquals(tree, folder2.printStructure());
    }
}
