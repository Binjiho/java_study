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
		//1.��¥
		Date day = new Date();
//		System.out.println(day);
//		System.out.println(day.getYear());
//		System.out.println(day.getDate());
//		System.out.println(day.getDay());
//		System.out.println(day.getTime());
		//2.��¥����
		SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd hh:mm");
		//3.��¥���˿� ��¥ ����
		String dayFormat = format.format(day);
		
		
		/**
		 * Time ��Ű�� LocalDateTime
		 */
		//1.��¥
		LocalDateTime curDateTime = LocalDateTime.now();
		//2.��¥����
		DateTimeFormatter tformat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
		//3.��¥���˿� ��¥ ����
		String tFormat = tformat.format(curDateTime);

		
		/**
		 * Time ��Ű�� LocalDate
		 */
	    // 1. LocalDate ����
		LocalDate date = LocalDate.now();
//		LocalDate date = LocalDate.of(2023, 6, 4);

        // 2. DayOfWeek ��ü
        DayOfWeek dayOfWeek = date.getDayOfWeek(); //MONDAY
        // 3. ���� ���� ���ϱ�
        int dayOfWeekNumber = dayOfWeek.getValue(); //mon:1, sun:7

        
        /**
         * 
         */

        Scanner scn = new Scanner(System.in);
        while(true) {
        	System.out.println("�Ĵ� ���� �ð��� �Է����ּ��� : ��,��,��,��,��,��");
        	String input = scn.next();
        	String[] strArr = input.split(",");
        	LocalDate ld = LocalDate.of(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
        	LocalTime lt = LocalTime.of(Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[5]));

        	LocalDateTime curDate = LocalDateTime.of(ld, lt);
        	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� hh�� mm�� ss���Դϴ�.");
        	String result = dateFormatter.format(curDate);
        	System.out.println(result);
        	break;
        }
		
	}
	
}
