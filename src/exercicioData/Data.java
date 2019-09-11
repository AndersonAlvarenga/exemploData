package exercicioData;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date datax = x.parse("25/10/2018");
		Date datay = y.parse("25/10/2018 15:23:34");
		Date dataatual = new Date();
		Date dataatual2 = new Date(System.currentTimeMillis());
		System.out.println(datax);
		System.out.println(datay);
		System.out.println("----------------------------------");
		System.out.println(x.format(datax));// utilizado para colocar no padrao especificado acima
		System.out.println(y.format(datay));
		System.out.println("----------------------------------");
		System.out.println("Data atual instanciando Date(): "+y.format(dataatual));//instaciar Date = Date dataatual = new Date(); para pega a data do pc
		System.out.println("Outra forma de pega a data do pc instanciando o data "+y.format(dataatual2));//utlizando o metodo "Date dataatual2 = new Date(System.currentTimeMillis());" 
		System.out.println("----------------------------------");
		
	}

}
