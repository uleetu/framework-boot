package org.ko.prototype.rest.role;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
//用SpringRunner来运行测试用例
@RunWith(SpringRunner.class)
public class RoleControllerTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mock;

    @Before
    public void setup () {
        mock = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void whenCreateSuccess () throws Exception {
        String content = "{\"name\":\"新增菜单1\"}";
        System.out.println(new Date().getTime());
        String result = mock.perform(post("/role")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }
}
