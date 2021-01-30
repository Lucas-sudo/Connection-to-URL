import java.net.*; import java.io.*;
public class VerPaginaHTML {
	public static void main(String[] args) {
		String texto="";
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Write a connection ");
			System.out.println("Internet; Intro to finish");
			try{
				texto = teclado.readLine();
				if (texto.length() != 0) {
					URL url = new URL(texto);
					try(BufferedReader servidorWeb = new BufferedReader(new InputStreamReader(url.openStream()))) {
						while((texto=servidorWeb.readLine())!=null)
						System.out.println(texto); 
					}
				}
			} catch(IOException e) {
				System.out.println("Direction not valid");
			}
		} while(texto.length() != 0);
	}
}