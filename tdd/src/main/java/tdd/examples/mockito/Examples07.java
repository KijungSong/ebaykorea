package tdd.examples.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;

// @Mock 애노테이션을 사용한 mock객체 설정.
public class Examples07 {
    @Mock private List mockedList;

    // @Mock 이 붙은 필드를 모두 Mock객체로 초기화한다.
    @Before
    public void initMocks() {
        // 이 메서드를 호출하여 this의  @Mock이 붙어있는 field에 Mock 객체를 설정해준다.
        MockitoAnnotations.initMocks(this); // mock all the field having @Mock annotation
    }

    @Test
    public void test() {
        // test here
        mockedList.add("one");

        // verification
        verify(mockedList).add("one");
    }
}
