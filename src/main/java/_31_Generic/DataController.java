package _31_Generic;

import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {

        // 객체 생성
//        ResponseData responseData = new ResponseData("데이터: ", "JINI", 27, 3.14);
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<String>("이름: ", "JINI");
       // ResponseData<String> responseData1 = new ResponseData<>("이름:", "JINI");
        System.out.println(responseData1);

        ResponseData<Integer> responseData2 = new ResponseData<>("나이: ", 27);
        System.out.println(responseData2);

        ResponseData<Double> responseData3 = new ResponseData<>("원주율: ", 3.14);
        System.out.println(responseData3);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("현재 날짜: ", now);
        System.out.println(nowData);

        // product 패키지
        // ProductController.java, Product.java
        // 상품 정보, => 상품명(Product Name), 상품정보(ProductInfo)
        // 실행 예시

    }
}
