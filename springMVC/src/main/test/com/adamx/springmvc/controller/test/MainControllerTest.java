package com.adamx.springmvc.controller.test;

import com.adamx.springmvc.controller.MainController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by shangzhidong on 2016/8/19.
 */
public class MainControllerTest {
    @Test
    public void testHomePage()throws Exception{
        MainController controller = new MainController();
        assertEquals("home",controller.index());
    }
}
