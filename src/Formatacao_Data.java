import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatacao_Data {

	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d04 = LocalDate.parse("2024-06-05");
		LocalDateTime d05 = LocalDateTime.parse("2024-06-05T15:17:26");
		Instant d06 = Instant.parse("2024-06-05T15:17:26z");

		// Formatação

		// Data-hora ➞ Texto ISO 8601
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());// Vai
																													// pega
																													// o
																													// fusuario
																													// da
																													// maquina
																													// da
																													// pessoa
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // forma ja formatada, esta no link, esse e apenas
																	// para data local
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // esse e para data global, como não foi expecificado o fusiorario ele vai usar o utc

		System.out.println("d04 = " + d04.format(fmt1));
		// Formas alternativas de fazer
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		System.out.println("d05 = " + d05.format(fmt2));

		System.out.println("d06 = " + fmt3.format(d06));

		System.out.println("d05 = " + fmt4.format(d05));
		System.out.println("d06 = " + fmt5.format(d06));
		// Daria pra imprimir no formato iso usando toString ou apenas imprimindo
		System.out.println("d06 = " + d06.toString());
		// ===========================================================================
	}
}