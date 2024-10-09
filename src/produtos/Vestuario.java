package produtos;

public class Vestuario extends Produto{

	private String tamanho;
	
	public Vestuario(String codigo, String nome, double preco, int quantidade, String tamanho) {
		super(codigo, nome, preco, quantidade);
		this.tamanho = tamanho;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibirInformacoes() {
		// TODO Auto-generated method stub
		System.out.println("Tipo: Vestuário");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Tamanho: " + this.tamanho);
	}

}
