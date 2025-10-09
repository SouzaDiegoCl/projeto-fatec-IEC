package br.com.fatec.api_links_uteis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class HelloControllerTest {

    private final HelloController helloController = new HelloController();

    @Test
    void deveReortnarMensagemHello(){
        String response = helloController.hello();
        assertEquals("Hello World!", response);
    }
}
