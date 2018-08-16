package tdd.examples.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

// @Mock 애노테이션과 @RunWith(MockitoJUnitRunner.class)을 통한 Mock객체 설정
// @RunWith(MockitoJUnitRunner.class) 사용하면 Examples07의 MockitoAnnotations.initMocks를 호출안해도 Mock객체가 설정된다.
@RunWith(MockitoJUnitRunner.class)
public class Examples08 {
    @Mock
    private List mockedList;

    @Test
    public void test() {
        // test here
    }
}
