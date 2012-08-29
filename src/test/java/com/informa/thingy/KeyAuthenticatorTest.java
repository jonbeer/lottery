package com.informa.thingy;

import com.informa.thingy.KeyAuthenticator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: bethella
 * Date: 29/08/12
 * Time: 17:16
 */
@ContextConfiguration(locations = {"classpath:context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class KeyAuthenticatorTest {


    @Resource
    private KeyAuthenticator keyAuthenticator;

    @Test
    public void testValidKey() {
        Assert.assertTrue(keyAuthenticator.isValid("345345345234523453245345345"));
    }


    @Test
    public void testInvalidKey() {
        Assert.assertFalse(keyAuthenticator.isValid("2234234"));
    }

}
