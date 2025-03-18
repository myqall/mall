package com.macro.mall.search;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description
 * @Author myq
 * @Date 2025/3/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MallSearchApplication.class)
public class ESTest {

    @Autowired
    private ElasticsearchRestTemplate esTemplate;

}
