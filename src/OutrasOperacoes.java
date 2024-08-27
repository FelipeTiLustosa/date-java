import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class OutrasOperacoes {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-06-05");
		LocalDateTime d05 = LocalDateTime.parse("2024-06-05T15:17:26");
		
		
		Instant d06 = Instant.parse("2024-06-05T01:30:26z");
		
		//Converter data-hora global para local
		//• Data-hora global, timezone(sistema local) ➞ Data-hora local
		
		// Colecao com os nomes dos fusiorario constumizados
				/*for (String s : ZoneId.getAvailableZoneIds()) {
				System.out.println(s);
				}*/
		LocalDate r1= LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2= LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3= LocalDateTime.ofInstant(d06, ZoneId.systemDefault());// vai pega o da maquina
		LocalDateTime r4= LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		System.out.println("r3 = "+r3);
		System.out.println("r4 = "+r4);
		
		
		//Obter dados de uma data-hora local 
		//• Data-hora local ➞ dia, mês, ano, horario
		System.out.println("d04 dia = "+ d04.getDayOfMonth());
		System.out.println("d04 mes = "+ d04.getMonthValue());
		System.out.println("d04 ano = "+ d04.getYear());
		
		
		System.out.println("d05 Hora = "+ d05.getHour());
		System.out.println("d05 Min = "+ d05.getMinute());
		
		
		
	}

}
