package _32_Collections.StrSet;

// 문제
// 1. "JAVA", "PYTHON", "C", "PYTHON", "JAVA", "JAVA", "C++", "C", "JAVA"
// 리스트 만들어서 추가
// 2. Set 하나 만들어서 리스트에 있던 요소들을 넣고 중복을 제거하기 -> 제거한 후에 set 출력
// 3. 정렬을 위해서 다시 List 하나 만들고, set에 있던 요소들을 list에 넣기
// 4. 요소들을 넣은 리스트를 정렬하고, 정렬된 언어 목록 출력하기
// 5. searchLang변수에 "JAVA" 대입하고 해당 변수를 이용해서 리스트에서 몇 개 있는지 출력하기
// 6. 중복 제거를 위해서 만들었던 set를 이용해서 중복제거된 후의 언어 갯수를 출력하기

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class LanguageSet {
    public static void main(String[] args) {

        // 1. "JAVA", "PYTHON", "C", "PYTHON", "JAVA", "JAVA", "C++", "C", "JAVA"
        // 리스트 만들어서 추가
        List<String> languageList = new ArrayList<>();

            languageList.add("JAVA");
            languageList.add("PYTHON");
            languageList.add("C");
            languageList.add("PYTHON");
            languageList.add("JAVA");
            languageList.add("JAVA");
            languageList.add("C++");
            languageList.add("C");
            languageList.add("JAVA");

        System.out.println(languageList);

        // 2. Set 하나 만들어서 리스트에 있던 요소들을 넣고 중복을 제거하기 -> 제거한 후에 set 출력
        Set<String> LanguageSet = new HashSet<>();

        LanguageSet.add("JAVA");
        LanguageSet.add("PYTHON");
        LanguageSet.add("C");
        LanguageSet.add("PYTHON");
        LanguageSet.add("JAVA");
        LanguageSet.add("JAVA");
        LanguageSet.add("C++");
        LanguageSet.add("C");
        LanguageSet.add("JAVA");

        System.out.println(LanguageSet);

        // 3. 정렬을 위해서 다시 List 하나 만들고, set에 있던 요소들을 list에 넣기
        List<String> LanguageList2 = new ArrayList<>();

            LanguageList2.add("JAVA");
            LanguageList2.add("PYTHON");
            LanguageList2.add("C");
            LanguageList2.add("PYTHON");
            LanguageList2.add("JAVA");
            LanguageList2.add("JAVA");
            LanguageList2.add("C++");
            LanguageList2.add("C");
            LanguageList2.add("JAVA");

        System.out.println(LanguageList2);

    }




}
