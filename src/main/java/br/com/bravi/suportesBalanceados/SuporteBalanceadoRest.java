package br.com.bravi.suportesBalanceados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suporte_balanceado")
public class SuporteBalanceadoRest {

	@GetMapping("/verificar_sequencia")
	public String verificarSequencia(@RequestBody String sequencia) {
		OrdemColchetes ordem = new OrdemColchetes();
		return ordem.verificarOrdemColchetes(sequencia);
	}

}
