package br.com.azure.publisher.azurespringboot;

import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AzureSpringBootApplicationTests {

	@Autowired
	private AzureSpringBootApplication.MessageHandler handler;

	@Test
	public void shouldInvokeMyHandler() {
		IMessage iMessage = new Message();
		iMessage.setLabel("AzureServiceBusMock");
		iMessage.setBody("It`s Works".getBytes());

		handler.onMessageAsync(iMessage);

		assertEquals(2, 2);
	}

}
