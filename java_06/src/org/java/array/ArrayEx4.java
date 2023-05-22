package org.java.array;

import java.util.ArrayList;

//정수 3개를 더해서 0이 되는 경우의 수 구하기
public class ArrayEx4 {

	static int[] fixed = {-2,-1,0,1,2};
	
	public static int[] getback (ArrayList<Integer> tmpList) {
		int[] tmp_array = new int[tmpList.size()];
    	for(int a=0; a<tmpList.size(); a++){
    		tmp_array[a] = tmpList.indexOf(a);
    	}
		return tmp_array;
	}
	
	public static int threeSol(int[] number) {
        int answer = 0;    
        //number(array) to list
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int tmp : number){
          arrayList.add(tmp);
        }

        for(int i=0;i<arrayList.size();i++) {
        	//remove index
        	arrayList.remove(i);        	
        	for (int j=0; j<arrayList.size();j++) {
        		arrayList.remove(j);
        	}
        	int[] array1 = getback(arrayList);
        	        		
        }
        //array to list
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[] tmpArr = new int[10];
		for (int i=0; i<10; i++){
		tmpArr[i]=i+1;
		}
		for (int i=0; i<tmpArr.length; i++){
		System.out.println(tmpArr[i]);
		}
		
//		threeSol(fixed);
	}
	
}
