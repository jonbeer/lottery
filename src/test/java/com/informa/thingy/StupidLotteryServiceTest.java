package com.informa.thingy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: bethella
 * Date: 29/08/12
 * Time: 17:45
 */
public class StupidLotteryServiceTest {

    private StupidLotteryService stupidLotteryService;

    @Before
    public void setup() {

        // demonstrate how to inject a mock

        stupidLotteryService = new StupidLotteryServiceImpl();
        ((StupidLotteryServiceImpl)stupidLotteryService).setKeyAuthenticator(new KeyAuthenticator() {
            public boolean isValid(String key) {
                return true;
            }
        });
    }


    @Test
    public void testStupidService() {

        Set<Integer> numbers = stupidLotteryService.getRandomLotteryNumbers(null);
        System.out.println(numbers);
        Assert.assertNotNull(numbers);
        Assert.assertTrue(numbers.size() == 6);
    }

}
