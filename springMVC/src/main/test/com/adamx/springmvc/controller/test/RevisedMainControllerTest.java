package com.adamx.springmvc.controller.test;
import com.adamx.springmvc.Spittle;
import com.adamx.springmvc.controller.MainController;
import com.adamx.springmvc.data.SpittleRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.mockito.Mockito.*;
/**
 * Created by shangzhidong on 2016/8/19.
 */
public class RevisedMainControllerTest {
    @Test
    public void testHomePage() throws Exception{
        MainController controller = new MainController();
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/pages");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        MockMvc mockMvc = standaloneSetup(controller).setViewResolvers(resolver).build();
        mockMvc.perform(get("/get")).andExpect(view().name("get"));
    }

}
