package _32_Collections.StrMap;

// 문제
// 1. 스캐너 객체 생성, 변수명은 productMap인 hashMap생성 (키: String , 값: Integer)
// 2. 상품 등록하기 라고 툴력하고, for 문 이용, 5번 반복하기, 상품명(키) 입력받고, 가격(값)입력받고 추가하기 -> productMap에 추가하기
// 주의: 상품명을 입력받고 공백을 꼭 제거할 것
// 3. 전체 상품 출력하기 => for-each 사용
// 4. 상품 가격 수정할것 => 수정할 상품명 입력받고 공백 제거하기 => 입력한 상품이 존재하면 가격을 입력받고 수정하기
// 만약에 존재하지 않으면 존재하지 않는다고 출력하기
// 5. 특정 상품 검색 => 검색할 상품명 입력받고 (공백 제거) => 입력한 상품이 productMap에 있는지부터 확인하고
// 있으면 해당 상품명과 가격을 출력하기 => 없으면 없다고 출력하기
// 6. 정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬하기 => 정렬하고 for each 출력하기
// 7. 정렬하기 역순으로 => 역순 정렬하고 for each 출력하기

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {

        // 1. 스캐너 객체 생성, 변수명은 productMap인 hashMap생성 (키: String , 값: Integer)
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        // 2. 상품 등록하기 라고 출력하고, for 문 이용, 5번 반복하기,
        // 상품명(키) 입력받고, 가격(값)입력받고 추가하기 -> productMap에 추가하기
        // 주의: 상품명을 입력받고 공백을 꼭 제거할 것

        System.out.println("상품 등록합니다.");
        System.out.print("상품을 몇 회 등록할까요? : ");
        int number = scanner.nextInt();
        scanner.nextLine();

//        for (int i = 0; i < number; i++) {
//            System.out.print((i + 1) + "번째 상품을 등록합니다. : ");
//            String product = scanner.nextLine();
//        }

        for (int i = 0; i < 5; i++) {
            System.out.print("상품명 : ");
            String name = scanner.nextLine().trim();

            System.out.print("가격 : ");
            int price = Integer.parseInt(scanner.nextLine());

            productMap.put(name,price);
        }

        // 3. 전체 상품 출력하기 => for-each 사용
        System.out.println("전체 상품 변환하기");
        for (Map.Entry<String, Integer> entry: productMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ":" + entry.getValue() + "원");
        }

//        for(Map.Entry<String, String> entry : productMap.entrySet()) {
//            System.out.println("상품명 : " + entry.getKey() + "가격 : " + entry.getValue());
//            String trimProductKey = entry.getKey().trim();
//            productMap.put(entry.getKey(),entry.getValue());
//        }

//        for(String key : productMap.keySet()) {
//            System.out.println("상품명: " + key + "가격: " + productMap.get(key));
//        }

        // 4. 상품 가격 수정할것 => 수정할 상품명 입력받고 공백 제거하기 => 입력한 상품이 존재하면 가격을 입력받고 수정하기
        // 만약에 존재하지 않으면 존재하지 않는다고 출력하기

        System.out.print("수정할 상품명을 입력해주세요.");
        String updateName = scanner.nextLine().trim();
        if(productMap.containsKey(updateName)) {
            System.out.print("수정할 가격 : ");
            int newPrice = Integer.parseInt(scanner.nextLine());
            productMap.put(updateName,newPrice);
            System.out.println("수정완료" + updateName + " -> " + newPrice + "원");
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }

        // 6. 정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬하기 => 정렬하고 for each 출력하기
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(productMap.entrySet());
        entryList.sort(Map.Entry.comparingByKey());
        System.out.println("상품명 기준 정렬");
        for(Map.Entry<String, Integer> entry : entryList) {
            System.out.println("- " + entry.getKey() + ":" + entry.getValue() + "원");
        }

        // 7. 정렬하기 역순으로 => 역순 정렬하고 for each 출력하기
        entryList.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("상품명 기준 역순 정렬");
//        for (Map.Entry<>)













    }
}
