package com.cart.shpping.onlineshoppingspringboot;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.cart.shpping.OnlineshoppingspringbootApplication;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(classes = OnlineshoppingspringbootApplication.class)
//@RunWith(MockitoJUnitRunner.class)
public class WelcomeControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@Before
	public void setUP()
	{
		initMocks(this);
	}

	@Test
    public void chechSearchEndPoint() throws Exception {
        this.
        mockMvc.
        perform(get("/search")).
        andDo(print()).
        andExpect(status().isOk());
                
    }
	@Test
    public void chechShoppingCartEndPoint() throws Exception {
        this.mockMvc.perform(get("/shoppingCart")).andDo(print()).andExpect(status().isOk())
                ;
    }
	
	@Test
    public void chechProductListEndPoint() throws Exception {
        this.mockMvc.perform(get("/productList")).andDo(print()).andExpect(status().isOk())
                ;
    }
	@Test
    public void chechLoginEndPoint() throws Exception {
        this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk())
                ;
    }
}