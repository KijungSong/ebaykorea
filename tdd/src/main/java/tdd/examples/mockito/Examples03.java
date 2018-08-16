package tdd.examples.mockito;

import java.util.LinkedList;

import static org.mockito.Mockito.*;


public class Examples03 {
    public static void main(String[] args) {
        LinkedList mockedList = mock(LinkedList.class);

        when(mockedList.get(anyInt())).thenReturn("int"); // mockedList.get의 인자로 아무 int 값을 넣어 호출하면 "int" 문자열을 리턴해라.
        when(mockedList.add(anyFloat())).thenReturn(true);  // mockedList.add의 인자로 아무 float값을 넣어 호출하면 true를 리턴
        when(mockedList.add(anyString())).thenReturn(true); // mockedList.add의 인자로 아무 String값을 넣어 호출하면 true를 리턴

        System.out.println(mockedList.get(999)); // "int"
        System.out.println(mockedList.add(3.3f)); // true
        System.out.println(mockedList.add("string")); // true

        verify(mockedList).get(anyInt());  // mockedList.get(anyInt())가 호출됬었는지 검증.
        verify(mockedList).add(eq( 3.3f )); // mockedList.add 호출할때 3.3f를 인자값으로 호출 했었는지 검증.
        verify(mockedList).add(eq("string")); // mockedList.add 호출할때 "string"을 인자값으로 호출 했었는지 검증.
    }
}

