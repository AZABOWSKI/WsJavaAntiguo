package _01_file;

import java.io.File;
import java.io.IOException;

public class Archivos {
	public static void main(String[] args) throws IOException {
		File fn = new File("file.txt");// Apuntar al fichero definido
		if (!fn.exists()) {// Averiguamos si existe
			//Creamos el fichero
			fn.createNewFile();
			//Tambien podemos crear un directorio, normalmente le quitamos la 
			//extension al fichero (fn)
			// fn.mkdir();
			System.out.println("Creado archivo " + fn.getName());
		}

		fn.isDirectory();
		fn.isFile();// averigua si es fichero o directorio
		// lista de ficheros si es directorio
		String content[] = fn.list();
		fn.canRead();// Averigua si tengo permisos de lectura
		fn.canWrite();// Averiguamos si tenemos permisos de escritura
		fn.lastModified();// fecha de �ltima modificaci�n
		fn.length();// tama�o en bytes
		//fn.delete();// lo borra
	}
}
