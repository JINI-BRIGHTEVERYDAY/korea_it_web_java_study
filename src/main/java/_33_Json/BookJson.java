package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;


@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String pubisher;
}

public class BookJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuillder = new GsonBuilder().setPrettyPrinting().create();
//        String bookJson = null;

        // java 객체 => json 변환
        Book book = new Book(
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판"
        );

        System.out.println("Book객체 -> JSON문자열");
        System.out.println(book);

        Map<String,String> book2 = gson.fromJson(bookJson, Map.class);
        System.out.println(book2);
    }
}
