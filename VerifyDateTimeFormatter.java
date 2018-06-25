import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.ZoneId;

public class VerifyDateTimeFormatter{

	private static final DateTimeFormatter D_F = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ").withZone(ZoneId.of("Asia/Kolkata"));

	public static void main(String[] args){
		System.out.println("Formatted Date : " + D_F.format(Instant.now()));
	}
}
