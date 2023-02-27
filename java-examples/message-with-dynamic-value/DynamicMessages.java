import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DynamicMessages {

	private static final int MIN_NAME_LENGTH = 3;
	private static final int MAX_NAME_LENGTH = 18;

	public static void main(String[] args) {

	}

	public static void commonDateTimeConversions() {
		ZonedDateTime date = ZonedDateTime.now();
		System.out.println(String.format("Time is %tR", date));
		System.out.println(String.format("Time is %tT", date));
		System.out.println(String.format("Time is %tr", date));
		System.out.println(String.format("Date is %tD", date));
		System.out.println(String.format("Date Time is %tc", date));
	}

	public static void dateConversions() {
		LocalDate date = LocalDate.now();
		System.out.println(String.format("Date is %1$td-%1$tB-%1$tY", date));
		System.out.println(String.format("Date is %1$td-%1$tb-%1$ty", date));

		System.out.println(String.format("Date is %1$td-%1$tb-%1$ty %1$tA", date));
		System.out.println(String.format("Date is %1$td-%1$tb-%1$ty %1$ta", date));

		System.out.println(String.format("Date of the year %1$tj", date));
	}

	public static void timeConversions() {
		LocalTime time = LocalTime.now();
		System.out.println(String.format("Time is %1$tH:%1$tM:%1$tS", time));

		System.out.println(String.format("Time is %1$tI:%1$tM:%1$tS %1$tp", time));
		System.out.println(String.format("Time is %1$tI:%1$tM:%1$tS %1$Tp", time));

		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println(String.format("Time is %1$tH:%1$tM:%1$tS %1$tZ", zoneDateTime));
		System.out.println(String.format("Time is %1$tH:%1$tM:%1$tS %1$tz", zoneDateTime));
	}

	public static void referenceArgumentWithIndex() {
		String name = "Ja";
		String message = String.format(
				"Name %1$s length must be between %2$s and %3$s, because %2$s is minimum, %3$s is maximum", name,
				MIN_NAME_LENGTH, MAX_NAME_LENGTH);

		System.out.println(message);
	}

	public static void differenceBetweenConversionCase() {
		System.out.println(String.format("Hello, my name is %s.", "Jack"));
		System.out.println(String.format("Hello, my name is %S.", "jack"));
	}

	public static void conversionB() {
		System.out.println(String.format("The result is %b.", 3));
		System.out.println(String.format("The result is %b.", 3.5));

		System.out.println(String.format("The result is %b.", ""));
		System.out.println(String.format("The result is %B.", "string value"));

		System.out.println(String.format("The result is %b.", null));

		System.out.println(String.format("The result is %b.", false));
		System.out.println(String.format("The result is %b.", true));

		Boolean boolType = false;
		System.out.println(String.format("The result is %b.", boolType));

		Boolean boolType2 = true;
		System.out.println(String.format("The result is %b.", boolType2));
	}

	public static void simpleStringFormatExample() {
		String message = String.format("Name length cannot be less than %d.", MIN_NAME_LENGTH);
		System.out.println(message);
	}

	public static void illegalFormatConversionExceptionWillHappen() {
		String message = String.format("Name length cannot be less than %d.", "string value");
		System.out.println(message);
	}

}
