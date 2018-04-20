package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ChamadasModalAtendimento {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// ChamadasModalAtendimento
	public static Var abrirModalCriarResposta() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showModal"),
						Var.valueOf("modalAddResposta"));
				return Var.VAR_NULL;
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Descreva esta função...
	public static Var fecharModalCriarResposta() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideModal"),
						Var.valueOf("modalAddResposta"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
