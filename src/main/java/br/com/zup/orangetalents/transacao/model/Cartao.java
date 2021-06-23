package br.com.zup.orangetalents.transacao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
public class Cartao {

		@NotBlank
		@Id
		private String id;

		@NotBlank
		@Email
		private String email;

		public Cartao(@NotBlank String id, @NotBlank @Email String email) {
			this.id = id;
			this.email = email;
		}
		
		@Deprecated
		public Cartao() {
			
		}

		public String getId() {
			return id;
		}

		public String getEmail() {
			return email;
		}
}
