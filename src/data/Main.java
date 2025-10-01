/*programa que haga lo mismo que el ejemplo pero usando java nio*/
/*************************************CODIGO DE EJEMPLO A SEGUIR*************************************
package ficherosTexto;

import java.io.*;

public class FichTextoLeer {
  public static void main(String[] args) throws IOException {
	//declarar fichero
    File fichero = new 	File("src\\FichTextoLeer.java");
    //crear el flujo de entrada hacia el fichero
    FileReader fic = new FileReader(fichero);

    int i;
    while ((i = fic.read()) != -1) //se va leyendo un carácter
      System.out.println( (char) i + "==>"+ i);

    fic.close(); //cerrar fichero

    //SEGUNDO EJEMPLO
    System.out.println("SEGUNDO EJEMPLO: ");
    fic = new FileReader("src\\FichTextoLeer.java ");
    char b[]= new char[20];
    while ((i = fic.read(b)) != -1)
		System.out.println(b);

    fic.close(); //cerrar fichero
  }
}*/
/**************************************CODIGO MIO*******************************************/
package data;
import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //lo del path es lo que estaba haciendo antes con el String ruta pero este tiene mas metodos
        Path ruta = Paths.get("C:\\Users\\alber\\Documents\\IntelIJ Projects\\Actividad2AAD\\res\\ejemplo.txt");
        try {
            /*Con Files del nio puedo leer todas las lineas de una archivo de una.
            * Usando esto, puedo almacenarlas en una lista e imprimirlos con un foreach*/
            List<String> lineas = Files.readAllLines(ruta);
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //el shortcut del for each en jetbrains es iter + tab
    }
}