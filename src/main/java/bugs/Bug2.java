package bugs;

import org.jeasy.random.EasyRandom;

/**
 * Должен выводить и в первом и во втором вариантах названия класслоадеров
 * в нашем случае это AppClassloader <=> SystemClassloader
 * https://www.javacodegeeks.com/2018/04/jvm-architecture-jvm-class-loader-and-runtime-data-areas.html
 */
public class Bug2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> randomClass = Class.forName("org.apache.commons.lang3.RandomUtils");
        System.out.println(randomClass.getClassLoader());
        EasyRandom easyRandom = new EasyRandom();
        //Class<?> easyRandom = Class.forName("org.jeasy.EasyRandom");
        System.out.println(easyRandom.getClass().getClassLoader()); 
    }
}
