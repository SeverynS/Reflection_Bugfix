package bugs;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * should generate random number in range from 0 to 9
 */
public class Bug1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        Class<?> randomClass = Class.forName("org.apache.commons.lang3.RandomUtils");
        Method nextInt = randomClass.getMethod("nextInt", int.class, int.class);
        System.out.println(nextInt.invoke(randomClass, 0, 10));
    }
}

//непонятно в чём баг, вроде работает

