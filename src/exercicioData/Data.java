package exercicioData;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");// para manter neste padrao
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");// para este padrao
		SimpleDateFormat z = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		z.setTimeZone(TimeZone.getTimeZone("GMT"));//Fazer isso para colocar no horario de greenuich
		Date datax = x.parse("25/10/2018");
		Date datay = y.parse("25/10/2018 15:23:34");
		Date dataatual = new Date();
		Date dataatual2 = new Date(System.currentTimeMillis());// traz a data do servidor
		Date data3 = new Date(0L);// traz a data em milissegundos
		Date data4 = new Date(1000L * 60L * 60L * 5L);// feito isso para adicionar cinco horas em milisegundos
		Date data5 = Date.from(Instant.parse("2019-09-12T15:42:07Z"));// padrao iso 8601
		System.out.println(datax);
		System.out.println(datay);
		System.out.println("----------------------------------");
		System.out.println(x.format(datax));// utilizado para colocar no padrao especificado acima
		System.out.println(y.format(datay));
		System.out.println("----------------------------------");
		System.out.println("Data atual instanciando Date(): " + y.format(dataatual));// instaciar Date = Date dataatual
																						// = new Date(); para pega a
																						// data do pc
		System.out.println("Outra forma de pega a data do pc instanciando o data " + y.format(dataatual2));// utlizando
																											// o metodo
																											// "Date
																											// dataatual2
																											// = new
																											// Date(System.currentTimeMillis());"
		System.out.println("----------------------------------");
		System.out.println(y.format(data3));
		System.out.println(y.format(data4));
		System.out.println(z.format(data5));
	}

}
