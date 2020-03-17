package com.autotrader.web.client.robinhood.authorization;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
public class RetrieveTokenTest {

    private RetrieveToken retrieveToken;

    @Mock
    private RestTemplate mockRestTemplate;


    @Test
    public void invokeTest() {
        retrieveToken.invoke();
    }

    @Before
    public void setup() {
        retrieveToken = new RetrieveToken(mockRestTemplate);
    }
}
