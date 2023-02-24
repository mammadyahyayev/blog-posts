package demo.main;

public class DynamicMessages {

	private static final int MIN_NAME_LENGTH = 3;

	public static void main(String[] args) {
		differenceBetweenConversionCase();
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
		
		Boolean boolType2  = true;
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
