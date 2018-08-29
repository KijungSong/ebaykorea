package examples.boot.aopexam.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // AOP를 위한 객체라는 것을 알림
@Component
public class ServiceMonitor {
    // 메소드가 실행될 때 메소드 이름 출력.
    @Before("execution(* examples..*Service.*(..))")
    public void logServiceBefore(JoinPoint joinPoint) {
        System.out.println("name : " + joinPoint.getSignature().getName());
        System.out.println("Before: " + joinPoint);
    }

    @AfterReturning("execution(* examples..*Service.*(..))") // 애노테이션이 Point Cut 역할.
    public void logServiceAccess(JoinPoint joinPoint) { // 이 메서드가 Advice의 역할을 함. (파라미터로 Join Point를 받음)
        System.out.println("name : " + joinPoint.getSignature().getName());
        System.out.println("Completed: " + joinPoint);
    }

    @AfterThrowing(value = "execution(* examples..*Service.*(..))", throwing = "ex")
    public void afterException(JoinPoint joinPoint, Exception ex) { // 발생한 exception을 받음 사용할때 애노테이션에 throwing을 같이 설정해줘야 한다.
        System.out.println("exception :" + joinPoint);
        System.out.println(ex.getMessage());
    }
}
