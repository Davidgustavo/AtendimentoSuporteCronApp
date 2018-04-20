package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Atendimento {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Atendimento
	public static Var obtemDataAtual() throws Exception {
		return new Callable<Var>() {

			private Var horaAtual = Var.VAR_NULL;

			public Var call() throws Exception {
				return cronapi.dateTime.Operations.formatDateTime(cronapi.dateTime.Operations.getNowNoHour(),
						Var.valueOf("dd/MM/yyyy"));
			}
		}.call();
	}

	/**
	 *
	 * @return Var
	 */
	// Descreva esta função...
	public static Var obtemHoraAtual() throws Exception {
		return new Callable<Var>() {

			private Var horaAtual = Var.VAR_NULL;

			public Var call() throws Exception {
				horaAtual = Var
						.valueOf(
								cronapi.dateTime.Operations
										.getHour(cronapi.dateTime.Operations
												.incHour(cronapi.dateTime.Operations.getNow(), Var.valueOf(-2)))
										.toString()
										+ cronapi.dateTime.Operations.getMinute(cronapi.dateTime.Operations.getNow())
												.toString());
				return horaAtual;
			}
		}.call();
	}

}
