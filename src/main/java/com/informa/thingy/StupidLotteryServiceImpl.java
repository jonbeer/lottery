package com.informa.thingy;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: bethella
 * Date: 29/08/12
 * Time: 17:41
 */
@Component
public class StupidLotteryServiceImpl implements StupidLotteryService {

    @Resource
    private KeyAuthenticator keyAuthenticator;

    public void setKeyAuthenticator(KeyAuthenticator keyAuthenticator) {
        this.keyAuthenticator = keyAuthenticator;
    }

    public Set<Integer> getRandomLotteryNumbers(String authKey) {

        if (keyAuthenticator.isValid(authKey)) {

            Set<Integer> lotteryNumbers = new HashSet<Integer>();
            for (int i = 0; i < 6; i++) {
                lotteryNumbers.add((int)(Math.random()*49));
            }
            return lotteryNumbers;
        } throw new RuntimeException("Key is invalid!: " + authKey);
    }
}
