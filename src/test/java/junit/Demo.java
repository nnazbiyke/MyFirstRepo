package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {


    @Test
    public void test1() {
        System.out.println("This is test 1");
    }

    //    catDog("catdog") → true
//    catDog("catcat") → false
//    catDog("1cat1cadodog") → true
    public boolean catDog(String str) {
        int countCat = 0;
        while (str.contains("cat")) {
            str = str.replace("cat", "");
            countCat++;
        }
        int countDog = 0;
        while (str.contains("dog")) {
            str = str.replace("dog", "");
            countDog++;
        }
        if (countCat != 0 && countDog != 0) {
            if (countCat == countDog) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Test
    public void catDog(){
        String st1 = "catdog";
        boolean expectedValue1 = true;
        String st2 = "catcat";
        boolean expectedValue2 = false;
        String st3 = "1cat1cadodog";
        boolean expectedValue3 = true;
        Assertions.assertEquals(expectedValue1,catDog(st1));
        Assertions.assertEquals(expectedValue2,catDog(st2));
        Assertions.assertEquals(expectedValue3,catDog(st3));

    }
}
