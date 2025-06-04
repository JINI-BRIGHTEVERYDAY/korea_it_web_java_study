package _32_Collections.StrMap;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        //Map에 Key - Value 쌍으로 삽입하여 => .put(키, 값)
        //키는 중복이 못되고 값만 중복가능
        strMap1.put("kor2025001", "김준일");
        strMap1.put("kor2025002", "김준이");
        strMap1.put("kor2025003", "김준삼");
        strMap1.put("kor2025004", "김준사");
        strMap1.put("kor2025005", "김준오");

        System.out.println(strMap1);

        //Map의 순회
        //Map은 직접적으로 순회를 할 수가 없다 -> 직접 for-each를 돌릴 수가 없기 때문
        //이유는?
        //순회하기 위해서는 Iterable<?> 인터페이스를 구현한 클래스이거나 배열(T[])것들만 가능함
        //collection은 iterable인터페이스를 상속받는다.
        //iterable은 반복이 가능하게 하는 인터페이스
        //근데 Map은 collection이 아니다.
        //그래서 순회할 수 없다
        //그럼에도 순회하고 싶다면?

//        System.out.println(strMap1.entrySet());
//        //키 값 전체를 set 형태로 반환한다
//
//
        //entrySet()을 이용했을 때
        for(Map.Entry<String, String> entry : strMap1.entrySet()) {
            System.out.println("키 : " + entry.getKey() + " 값 : " + entry.getValue());
        }
        System.out.println(strMap1.keySet());

        //키만 set 형태로 반환
        for(String key : strMap1.keySet()) {
            System.out.println("키: " + key + " 값: " + strMap1.get(key));
        }


        // entrySet을 이용하게 되면, 키값 전체의 내용이 set형태로 오는데, keySet처럼 한 가지만
        // String으로 들어가는 것이 아님
        // 그래서 키값 형태를 받아줄 수 있는 Map.Entry에다가 넣어야 한다
        // Map.Entry는 Map에 들어가는 데이터 형식인 키 값 형태


        // 수정 또는 추가하기
        strMap1.put("kor2025005", "김준팔");
        // 이미 있는 키라면 값의 수정이 발생하게 된다
        // 없다면 추가가 이루어질 것이다

        System.out.println(strMap1);

        // 특정 key의 value 조회하기
        System.out.println(strMap1.get("kor2025005"));
        // Map에는 인덱스가 없다. => 키로 접근하여 값을 출력한다 => 순서도 없다.

        // 특정 key의 존재 여부 확인
        boolean isContain1 = strMap1.containsKey("kor2025003");
        System.out.println("kor2025003의 존재여부는 " + isContain1);

        // 특정 value의 존재 여부 확인
        boolean isContain2 = strMap1.containsValue("김준일");
        System.out.println("김준일의 존재 여부는 " + isContain2);


        //Map을 Set으로 변환하기
        //key-Value 형태로 -> Map.Entry
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();

        System.out.println(entrySet2);
        System.out.println(entrySet2.size());

        //Map을 List로 변환하기
        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
        entryList1.addAll(entrySet2);
        // 서로가 컬렉션이면 전부 다 넣기
        //Map은 collection이 아니기 때문에, set을 거쳐서 넣는다

        System.out.println(entryList1);

        // Map 정렬 => 사실은 불가능함
        // Map은 빠른 탐색 및 검색을 위해서 만들어진(설계된) 형태
        // 정렬은 고려되지 않고 만든다 => 그래서 순서를 보장하지 않는다
        // 그럼에도 정렬을 원한다면?

        Collections.sort(entryList1, Map.Entry.comparingByValue());
        System.out.println("값 기준 정렬: " + entryList1);

        Collections.sort(entryList1, Map.Entry.comparingByKey());
        System.out.println("키 기준 정렬: " + entryList1);

        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("키 기준 역순 정렬: " + entryList1);

        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);



    }
}
