package br.edu.unifacisa.si.map.padroes.gof.chain;

public class BancoA extends BancoChain {

	public BancoA() {
		super(IDBancos.bancoA);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco A");
	}
}
