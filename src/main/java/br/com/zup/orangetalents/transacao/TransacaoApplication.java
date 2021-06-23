package br.com.zup.orangetalents.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.converter.JsonMessageConverter;

import br.com.zup.orangetalents.transacao.repository.TransacaoRepository;
import br.com.zup.orangetalents.transacao.response.TransacaoKafkaResponse;

@SpringBootApplication
public class TransacaoApplication {

	@Autowired
	private TransacaoRepository transacaoRepo;

	public static void main(String[] args) {
		SpringApplication.run(TransacaoApplication.class, args);
	}

	@Bean
	JsonMessageConverter jsonMessageConverter() {
		return new JsonMessageConverter();
	}

	@KafkaListener(id = "my.transacao", topics = "transacoes")
	void listenTransacao(TransacaoKafkaResponse transacaoResponse) {
		if (transacaoResponse != null) {
			System.out.println(transacaoResponse);
			transacaoRepo.save(transacaoResponse.toModel());
		}
	}
}
