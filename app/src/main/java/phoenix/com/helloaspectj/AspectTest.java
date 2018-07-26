package phoenix.com.helloaspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectTest {
    private static final String TAG = "AspectTest";

    @Pointcut("execution(* phoenix.com.helloaspectj.MainActivity.**(..))")
    public void executeAspectJ() {
    }

    @Before("executeAspectJ()")
    public void beforeAspectJ(JoinPoint joinPoint) throws Throwable  {
        Log.d(TAG, "beforeAspectJ: injected -> " + joinPoint.toShortString());
    }
}
