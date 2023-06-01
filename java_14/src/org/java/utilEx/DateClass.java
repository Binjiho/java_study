package org.java.utilEx;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateClass {
	public static void main(String[] args) {
		//1.날짜
		Date day = new Date();
//		System.out.println(day);
//		System.out.println(day.getYear());
//		System.out.println(day.getDate());
//		System.out.println(day.getDay());
//		System.out.println(day.getTime());
		//2.날짜포맷
		SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd hh:mm");
		//3.날짜포맷에 날짜 삽입
		String dayFormat = format.format(day);
		
		
		/**
		 * Time 패키지 LocalDateTime
		 */
		//1.날짜
		LocalDateTime curDateTime = LocalDateTime.now();
		//2.날짜포맷
		DateTimeFormatter tformat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
		//3.날짜포맷에 날짜 삽입
		String tFormat = tformat.format(curDateTime);

		
		/**
		 * Time 패키지 LocalDate
		 */
	    // 1. LocalDate 생성
		LocalDate date = LocalDate.now();
//		LocalDate date = LocalDate.of(2023, 6, 4);

        // 2. DayOfWeek 객체
        DayOfWeek dayOfWeek = date.getDayOfWeek(); //MONDAY
        // 3. 숫자 요일 구하기
        int dayOfWeekNumber = dayOfWeek.getValue(); //mon:1, sun:7

        
        /**
         * 
         */

        Scanner scn = new Scanner(System.in);
        while(true) {
        	System.out.println("식당 예약 시간을 입력해주세요 : 년,월,일,시,분,초");
        	String input = scn.next();
        	String[] strArr = input.split(",");
        	LocalDate ld = LocalDate.of(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
        	LocalTime lt = LocalTime.of(Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[5]));

        	LocalDateTime curDate = LocalDateTime.of(ld, lt);
        	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초입니다.");
        	String result = dateFormatter.format(curDate);
        	System.out.println(result);
        	break;
        }
		
	}
	
}
