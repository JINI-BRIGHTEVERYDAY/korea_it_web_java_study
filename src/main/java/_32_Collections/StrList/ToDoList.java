package _32_Collections.StrList;

// 문제 - Todolist
// 1. todoList를 담을 리스트 생성, 스캐너, 객체 생성
// 2. 사용자에게 todo를 입력받을건데, 몇 개 입력할건지 count변수에 입력받기
// 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아서 todoList에 추가하기
// 4. 향상된 for문을 이용하여, todoList 출력하기
// 5. todoList출력한 뒤 특정 todo를 포함여부 확인하기 위해서 searchTodo라는 변수에
//  찰을 키워드를 입력받고, 해당 searchTodo가 있는지 여부를 출력하기
// 6. 삭제할 todo입력받아서 deleteTodo에 대입해두고 포함 여부 확인 삭제, 성공여부 출력하기
// 7. todo들 정렬하고 전체 출력하기
// 8. 이번엔 역순으로 정렬하고 전체 출력하기
// 9. 전체 todo들의 갯수를 출력하기


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
// 1. todoList를 담을 리스트 생성, 스캐너, 객체 생성
    public static void main(String[] args) {
        List<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 2. 사용자에게 todo를 입력받을건데, 몇 개 입력할건지 count변수에 입력받기
        System.out.print("몇 개의 리스트를 입력할까요? 입력해주세요 : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        // int count = Integer.parseInt(scanner.nextLine());
        // 이것도 가능함


        // 3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아서 todoList에 추가하기
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 todo 리스트 입력하기 : ");
            String toDo = scanner.nextLine();

            toDoList.add(toDo);
        }

        // 4. 향상된 for문을 이용하여, todoList 출력하기
        System.out.println("전체 toDo 출력하기");
        for (String toDo : toDoList) {
            System.out.println(toDo);
        }

        // 5. todoList출력한 뒤 특정 todo를 포함여부 확인하기 위해서
        //  searchTodo라는 변수에 찾을 키워드를 입력받고, 해당 searchTodo가 있는지 여부를 출력하기

        System.out.print("포함 여부를 확인할 toDo를 확인해주세요 : ");
        String searchTodo = scanner.nextLine();
        boolean searchResult = toDoList.contains(toDoList);
        System.out.println(searchTodo + "의 toDoList에 포함되어 있는지 여부는 " + searchResult + "입니다.");
        //System.out.println("-> \"" + searchTodo + "\" 포함 여부 : " + searchResult);
        //이렇게 쓸 수도 있음

        // 6. 삭제할 todo입력받아서 deleteTodo에 대입해두고 포함 여부 확인 삭제, 성공여부 출력하기
        System.out.print("삭제할 toDo를 입력해주세요 : ");
        String removeTodo = scanner.nextLine();
        boolean removeResult1 = toDoList.remove(removeTodo);
        System.out.println(removeTodo + "의 toDoList에서의 삭제 여부는 " + removeResult1 + "입니다.");

        // 7. todo들 정렬하고 전체 출력하기
        Collections.sort(toDoList);
        System.out.println("정방향으로 정렬된 toDoList: " + toDoList);

        // 8. 이번엔 역순으로 정렬하고 전체 출력하기
        Collections.sort(toDoList, Collections.reverseOrder());
        System.out.println("역방향으로 정렬된 toDoList : " + toDoList);

        // 9. 전체 todo들의 갯수를 출력하기
        System.out.println("전체 todo의 갯수는 : " + toDoList.size() );










    }
}
