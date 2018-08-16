package tdd.examples.mockito;

import org.mockito.Mockito;

import java.util.List;
import static org.mockito.Mockito.mock; // Mockito의 static mock 메서드 import
import static org.mockito.Mockito.verify;

// Mocking과 Verification
public class Examples01 {
    public static void main(String[] args){
        // mock
        List mockedList = mock(List.class); // List를 구현하는 Mock 객체를 반환
        // mockedList 레퍼런스가 참조하는 객체의 클래스 이름.
        System.out.println(mockedList.getClass().getName());

        // mock 사용하기
        mockedList.add("two");
        mockedList.clear();

        // verification
        verify(mockedList).add("two"); // mockedList.add("two")가 호출됬는지 체크.
        verify(mockedList).clear(); // mockedList.clear();가 호출됬는지 체크
    }
}
