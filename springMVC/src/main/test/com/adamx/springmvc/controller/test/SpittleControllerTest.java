package com.adamx.springmvc.controller.test;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.adamx.springmvc.Spittle;
import com.adamx.springmvc.controller.SpittleController;
import com.adamx.springmvc.data.SpittleRepository;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;


public class SpittleControllerTest {

    @Test
    public void shouldShowRecentSpittles()throws Exception{
        List<Spittle> expectedSpittles = createSpittleList(20);
        SpittleRepository mockResposity = mock(SpittleRepository.class);
        when(mockResposity.findSpittles(Long.MAX_VALUE, 20))
                .thenReturn(expectedSpittles);
        SpittleController controller = new SpittleController(mockResposity);
        MockMvc mockMvc = standaloneSetup(controller).setSingleView(new InternalResourceView(
                "WEB-INF/pages/spittles.jsp")).build();
        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList",hasItems(expectedSpittles.toArray())));
    }


    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
