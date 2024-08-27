import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao_Data {

	public static void main(String[] args) {
		// ======================================================================
		// Instanciação
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		// (agora) ➞ Data-hora. formato local hr e data e apenas data,data global
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		// Texto ISO 8601 ➞ Data-hora
		LocalDate d04 = LocalDate.parse("2024-06-05");
		LocalDateTime d05 = LocalDateTime.parse("2024-06-05T15:17:26");
		Instant d06 = Instant.parse("2024-06-05T15:17:26z");
		Instant d07 = Instant.parse("2024-06-05T15:17:26-03:00");// Caso eu queira instacia com horario de um
																	// determinado lugar por ex PI

		// Texto formato customizado ➞ Data-hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d08 = LocalDate.parse("05/06/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("05/06/2024 01:30", fmt2);
		// forma alternativa de fazer :
		// LocalDateTime d09= LocalDateTime.parse("05/06/2024 01:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

		// dia, mês, ano, [horário] ➞ Data-hora local, passando dados isolados
		LocalDate d10 = LocalDate.of(2024, 07, 23);
		LocalDateTime d11 = LocalDateTime.of(2024, 07, 20, 13, 07);
		// =======================================================================
		System.out.println("d01 = " + d01.toString());// Quando agente concatena a variaveis ele ja transfoma no formato
														// ISO 8601
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d05 = " + d04.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}

}
