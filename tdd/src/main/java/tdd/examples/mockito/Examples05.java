package tdd.examples.mockito;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

// void 를 반환하는 메소드
public class Examples05 {
    public static void main(String[] args) {
        LinkedList mockedList = mock(LinkedList.class);

        doThrow(new RuntimeException()).when(mockedList).clear(); // mockedList.clear() 호출될때 RuntimeException 예외 throw

        mockedList.clear(); // RuntimeException
    }
}

