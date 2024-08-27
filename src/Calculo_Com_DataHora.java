import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo_Com_DataHora {

	public static void main(String[] args) {
		// obs: lembrando q em java data e hora sao objetos imultaveis
		// Uma vez q vc instancia um obj data hora e vc precisa de um obj data hr
		// de um dia anterior vc nao vai dentro do obj e muda o estado dele 
		// vc vai criar outro obj alterado
		 
		LocalDate d04 = LocalDate.parse("2024-06-05");
		LocalDateTime d05 = LocalDateTime.parse("2024-06-05T15:17:26");
		Instant d06 = Instant.parse("2024-06-05T01:30:26z");
		
	// Cálculos com data-hora
	//	• Data-hora +/-tempo ➞ Data-hora
		
	// LocalDate
	LocalDate pastWeekLocalDate = d04.minusDays(7);
	LocalDate nextWeekLocalDate = d04.plusYears(6);
	//obs tambem serve para LocalDateTime

	System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
	System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);
	
	//LocalDateTime
	LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
	LocalDateTime nextWeekLocalDateTime = d05.plusYears(6);
	
	// instant
	Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);// Subtrai
	Instant nextWeekInstant = d06.plus(5,ChronoUnit.DAYS);// Soma
	
	System.out.println("pastWeekInstant = "+pastWeekInstant);
	System.out.println("nextWeekInstant = "+nextWeekInstant);
	
	//Duração
	//Data-hora 1, Data-hora 2 ➞ Duração
	
	Duration t1= Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());// para funciona vc tem q converte o localDate para localDAteTime
	// usando o atStartOfDay() tbm poder ser usado o atTime(0,0)
	Duration t2= Duration.between(pastWeekLocalDateTime, d05);
	Duration t3= Duration.between(pastWeekInstant, d06); 
	//Uma data anterior e uma data afrente sendo usada
	Duration t4= Duration.between(d06,pastWeekInstant);
	
	System.out.println("t1 dias = "+t1.toDays());
	System.out.println("t2 dias = "+t2.toDays());
	System.out.println("t3 dias = "+t3.toDays());
	System.out.println("t4 dias = "+t4.toDays());
	}

}
