package br.com.zup.orangetalents.transacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.converter.JsonMessageConverter;

import br.com.zup.orangetalents.transacao.responses.TransacaoResponse;

@SpringBootApplication
public class TransacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransacaoApplication.class, args);
	}

	@Bean
	JsonMessageConverter jsonMessageConverter() {
		return new JsonMessageConverter();
	}

	@KafkaListener(id = "my.transacao", topics = "transacoes")
	void cats(TransacaoResponse transacaoResponse) {
		System.out.println("Transação = " + transacaoResponse);
	}
}
