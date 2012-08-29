package com.informa.thingy;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: bethella
 * Date: 29/08/12
 * Time: 17:31
 */
@Component
public class KeyAuthenticatorImpl implements KeyAuthenticator {
    public boolean isValid(String key) {

        // usually there would be some fancy cryptography in here
        return (key.length() > 15);
    }
}
