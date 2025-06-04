package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject orderJson = new JsonObject();
        orderJson.addProperty("username : ", "ORD123456");
        orderJson.addProperty("customer : ", "곽두팔");
        orderJson.addProperty("product : ", "에어팟 프로 2세대");
        orderJson.addProperty("quantity : ", 1);
        orderJson.addProperty("price : ", "349000");

        System.out.println(orderJson);

        //모든 키는 문자열이다.
        //"key" (쌍따옴표) : value

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json1 = gson1.toJson(orderJson);

        System.out.println(json1);

        JsonObject address = new JsonObject();
        address.addProperty("receiver: ", "곽두팔");
        address.addProperty("phone: ", "010-5678-1234");
        address.addProperty("city: ","서울");
        address.addProperty("district: ","마포구");
        address.addProperty("zipCode: ","04123");

        orderJson.add("address", address);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(orderJson);

        System.out.println(json2);
    }

}
