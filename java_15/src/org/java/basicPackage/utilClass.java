package org.java.basicPackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class utilClass {
	public static void main(String[] args) {
		// 1.LocalDate생성
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime oldday = LocalDateTime.of(2023,6,2,0,0,0);
		LocalDateTime expiredday = today.minusDays(4);
		
		// 2.두 날짜 사이의 기간
		long days = ChronoUnit.DAYS.between(oldday,today);
		long hours = ChronoUnit.HOURS.between(oldday,today);

		//3. 두 날짜 비교
		boolean bool = today.isAfter(oldday);
	}
}
