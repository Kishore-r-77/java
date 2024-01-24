package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Practice {

	public static void main(String[] args) {
		String dateString = getCurrentDateInCustomFormat("yyyy-MM-dd");
		int dateAsInteger = convertDateToInteger(dateString);
		System.out.println("Date as Integer: " + dateAsInteger);
	}

	public static String getCurrentDateInCustomFormat(String format) {
		LocalDateTime currentDate = LocalDateTime.now();

		DateTimeFormatter formatter = getDateTimeFormatter(format);

		if (formatter == null) {
			throw new IllegalArgumentException("Unsupported date format: " + format);
		}

		return currentDate.format(formatter);
	}

	private static DateTimeFormatter getDateTimeFormatter(String format) {
		switch (format) {
			case "yyyyMMdd":
				return DateTimeFormatter.ofPattern("yyyyMMdd");
			case "yyyy-MM-dd":
				return DateTimeFormatter.ofPattern("yyyy-MM-dd");
			case "yyMMdd":
				return DateTimeFormatter.ofPattern("yyMMdd");
			case "yyyy-MM-dd-HH:mm:ss":
				return DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");
			default:
				return null;
		}
	}

	private static int convertDateToInteger(String dateString) {
		LocalDateTime localDateTime = LocalDateTime.parse(dateString,
				DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss.SSSSSS"));
		int result = Integer.parseInt(localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
		return result;
	}

}
