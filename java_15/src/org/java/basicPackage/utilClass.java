package org.java.basicPackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class utilClass {
	public static void main(String[] args) {
		// 1.LocalDate����
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime oldday = LocalDateTime.of(2023,6,2,0,0,0);
		LocalDateTime expiredday = today.minusDays(4);
		
		// 2.�� ��¥ ������ �Ⱓ
		long days = ChronoUnit.DAYS.between(oldday,today);
		long hours = ChronoUnit.HOURS.between(oldday,today);

		//3. �� ��¥ ��
		boolean bool = today.isAfter(oldday);
	}
}
