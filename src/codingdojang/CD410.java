package codingdojang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*
 * 주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
 * 
 * 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
 * 
 * 1 김씨와 이씨는 각각 몇 명 인가요?
 * 2 "이재영"이란 이름이 몇 번 반복되나요?
 * 3 중복을 제거한 이름을 출력하세요.
 * 4 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
 */

public class CD410 {
    private String str ="이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
    
    public void run() {
		String arr[] = str.split(",");
		//Arrays.sort(arr);
		int a1kim = 0;
		int a1lee = 0;
		int a2leejaemyung = 0;
		List<String> list = new ArrayList<>();
		for (String string : arr) {
		    if(string.startsWith("김")) {
			a1kim++;		
		    }
		    if(string.startsWith("이")) {
			a1lee++;		
		    }
		    if("이재영".equals(string))
		    {
			a2leejaemyung++;
		    }
		    list.add(string);
		}
		System.out.println(a1kim + ", " + a1lee);
		System.out.println(a2leejaemyung);
		
		List<String> uniqueList = new ArrayList<String>(new HashSet<String>(list));
		for (String string : uniqueList) {
		    System.out.println(string);
		}
		System.out.println();
		Collections.sort(uniqueList);
		for (String string : uniqueList) {
		    System.out.println(string);
		}
    }

}
