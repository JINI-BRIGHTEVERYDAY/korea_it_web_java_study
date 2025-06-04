package _32_Collections.StrList;

// Collection
// 여러 객체를 모아놓은 것을 의미함
// list => 순서가 있는 데이터들의 집합이다, 중복된 요소를 허용한다
// ArrayList, LinkedList


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SrtList {
    public static void main(String[] args) {
//        List<String> strList1 = new ArrayList<>(); // 방법 1
//        // element 추가하기
//
//        strList1.add("A");
//        strList1.add("B");
//        strList1.add("A");
//
//        System.out.println(strList1);

        List<String> strList1 = new ArrayList<>(Arrays.asList("A", "B", "A"));
//        // 방법2
        System.out.println(strList1);

            List<String> strList2 = new ArrayList<>();
            strList2.add("java");
            strList2.add("python");
            strList2.add("C#");
            strList2.add("javascript");
            strList2.add("kotlin");

            System.out.println(strList2);

        System.out.println("--------------------------");

        String[] strArray = new String[2];
        strArray[0] = "이동윤";
        strArray[1] = "삼동윤";

        System.out.println(strArray);


//        // 특정 element의 포함 여부 => contains() 메소드 사용 => return boolean
        String searchElem1 = "python";
        boolean isContains1 = strList2.contains(searchElem1);
        System.out.println(searchElem1 + "의 포함여부 : " + isContains1 );


        String searchElem2 = "py";
        boolean isContains2 = strList2.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함여부 : " + isContains2);


        String email = "test@gmail.com";
        boolean isContains3 = email.contains("@");
        System.out.println(email + "의 포함여부 : " + isContains3 );

//        // 특정 element 삭제 -> remove() => return boolean
        String removeElem1 = "kotlin";
        boolean removeResult1 = strList2.remove(removeElem1);
        System.out.println(removeElem1 + "의 제거 여부 : " + removeResult1);

        // List 정렬하기 -> sort() 활용
        Collections.sort(strList2);
        System.out.println("정방향으로 정렬된 strList2: " + strList2);


        // List 역순정렬하기 -> sort, reverseOrder() 활용하기

        Collections.sort(strList2, Collections.reverseOrder());
        System.out.println("역방향으로 정렬된 strList2 : " + strList2);

        // 일반 for문 순회하기
        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i) + "언어");
        }

        System.out.println("--------------------------");

          // 향상된 for문
        for (String lang : strList2) {
            System.out.println(lang + "언어");
        }

    }
}


// 문제 - Todolist
// 1. todoList를 담을 리스트 생성, 스캐너, 객체 생성
// 2. 사용자에게 todo를 입력받을건데, 몇 개 입력할건지 count변수에 입력받기
// 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아서 todoList에 추가하기
// 4. 향상된 for문을 이용학여, todoList 출력하기
// 5. todoList출력한 뒤 특정 todo를 포함여부 확인하기 위해서 searchTodo라는 변수에
//  찰을 키워드를 입력받고, 해당 searchTodo가 있는지 여부를 출력하기
// 6. 삭제할 todo입력받아서 deleteTodo에 대입해두고 포함 여부 확인 삭제, 성공여부 출력하기
// 7. todo들 정렬하고 전체 출력하기
// 8. 이번엔 역순으로 정렬하고 전체 출력하기
// 9. 전체 todo들의 갯수를 출력하기

