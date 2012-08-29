package com.informa.thingy;

import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: bethella
 * Date: 29/08/12
 * Time: 17:40
 */
public interface StupidLotteryService {

    Set<Integer> getRandomLotteryNumbers(String authKey);
    
}
