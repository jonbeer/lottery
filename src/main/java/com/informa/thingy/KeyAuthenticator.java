package com.informa.thingy;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: bethella
 * Date: 29/08/12
 * Time: 17:31
 */
public interface KeyAuthenticator {

    boolean isValid(String key);
}
