package produtos;

public class Calcado extends Produto {

	private int numero;
	
	public Calcado(String codigo, String nome, double preco, int quantidade, int numero) {
		super(codigo, nome, preco, quantidade);
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibirInformacoes() {
		// TODO Auto-generated method stub
		System.out.println("Tipo: Calçado");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Número: " + this.numero);
	}

}
