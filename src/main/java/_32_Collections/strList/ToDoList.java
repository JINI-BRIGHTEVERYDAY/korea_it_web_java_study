package _32_Collections.strList;

// 문제 - Todolist
// 1. todoList를 담을 리스트 생성, 스캐너, 객체 생성 O
// 2. 사용자에게 todo를 입력받을건데, 몇 개 입력할건지 count변수에 입력받기 O
// 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아서 todoList에 추가하기
// 4. 향상된 for문을 이용학여, todoList 출력하기
// 5. todoList출력한 뒤 특정 todo를 포함여부 확인하기 위해서 searchTodo라는 변수에
//  찰을 키워드를 입력받고, 해당 searchTodo가 있는지 여부를 출력하기
// 6. 삭제할 todo입력받아서 deleteTodo에 대입해두고 포함 여부 확인 삭제, 성공여부 출력하기
// 7. todo들 정렬하고 전체 출력하기
// 8. 이번엔 역순으로 정렬하고 전체 출력하기
// 9. 전체 todo들의 갯수를 출력하기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {
        // 1. todoList를 담을 리스트 생성, 스캐너, 객체 생성
        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();

        // 2. 사용자에게 todo를 입력받을건데, 몇 개 입력할건지 count변수에 입력받기
        System.out.print("할 일을 몇 개 입력할까요? : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        // 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아서 todoList에 추가하기
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 할 일을 입력하세요: ");
            String todo = scanner.nextLine();
            toDoList.add(todo);
        }

        // 4. 향상된 for문을 이용학여, todoList 출력하기

        // 5. todoList출력한 뒤 특정 todo를 포함여부 확인하기 위해서 searchTodo라는 변수에
        //  찰을 키워드를 입력받고, 해당 searchTodo가 있는지 여부를 출력하기

        // 6. 삭제할 todo입력받아서 deleteTodo에 대입해두고 포함 여부 확인 삭제, 성공여부 출력하기

        // 7. todo들 정렬하고 전체 출력하기





//        System.out.print("TodoList 첫 번째 항목을 입력합니다.");
//        String MyList1 = scanner.nextLine();
//        System.out.print("TodoList 두 번째 항목을 입력합니다.");
//        String MyList2 = scanner.nextLine();
//        System.out.print("TodoList 세 번째 항목을 입력합니다.");
//        String MyList3 = scanner.nextLine();
//        System.out.print("TodoList 네 번째 항목을 입력합니다.");
//        String MyList4 = scanner.nextLine();
//        System.out.print("TodoList 다섯 번째 항목을 입력합니다.");
//        String MyList5 = scanner.nextLine();


        System.out.println(toDoList);
    }
}
