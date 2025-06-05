package _33_Json;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuillder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;
        // java 객체 => json 변환
        User user = new User(
                "Jini",
                "9876",
                "jinibrighteveryday@gmail.com",
                "지니",
                "29"
        );

        System.out.println("user객체: " + user);
        userJson = gson.toJson(user);
        // user객체가 string형태로 된 것이다.
        System.out.println("Gson만 사용: " + userJson);

        userJson = gsonBuillder.toJson(user); // => user객체를 json형태로 예쁘게 변환하기
        System.out.println("GsonBuilder사용 :" + userJson);

        // 반대로 Json 객체를 자바 객체로 변환하기
        // JsonObject -> json
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCoe", "2025001");
        jsonObject1.addProperty("studentName", "JINI");
        jsonObject1.addProperty("studentYear", "2");
        jsonObject1.addProperty("score", "96.7");

        String studentJson = gson.toJson(jsonObject1);
        System.out.println("gson 사용 : " + studentJson);
        studentJson = gsonBuillder.toJson(jsonObject1);
        System.out.println("gsonBuilder 사용 : " + studentJson);

        // Map -> Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA-KD72G");
        map1.put("productName", "삼성 갤럭시북 프로5 ");

        System.out.println("gson 사용했을 때 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용했을 때 : " + gsonBuillder.toJson(map1) );
        String productJson = gsonBuillder.toJson(map1);

        //Json -> Map
        Map<String,String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);
        // Map으로 들어가서 쌍따옴표없다

        //json -> User 객체로
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);
        // .class로 해야 단위가 맞아진다

        //json -> jsonObject => json 과 jsonObject는 같은 형태가 아니다
        //studentJson의 자료형은 String -> jsonObject의 자료형 JsonObject
        JsonObject jsonObject2= gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);



    }


}
