package org.java.array;

import java.util.ArrayList;

//���� 3���� ���ؼ� 0�� �Ǵ� ����� �� ���ϱ�
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
        	//list to array
        	int[] array1 = getback(arrayList);
        	        		
        }
        //array to list
        return answer;
    }
	
	public static void main(String[] args) {
		threeSol(fixed);
	}
	
}
