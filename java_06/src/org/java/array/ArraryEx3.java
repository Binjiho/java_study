package org.java.array;

public class ArraryEx3 {

//	String my_string = "He11oWor1d";
//	String overwrite_string = "lloWorl";
//	int s = 2;
	
	public static String solution(String my_string, String overwrite_string, int s) {

        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }

        return answer;
    }
	
	public static void main(String[] args) {
		String answer = solution("He11oWor1d","lloWorl",2);
		System.out.println( answer );
	}
}
