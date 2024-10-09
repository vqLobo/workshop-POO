package loja;

import java.util.ArrayList;
import java.util.List;

import estoque.Estoque;
import produtos.Produto;

public class Loja implements Estoque{
	
	private List<Produto> estoque;
	
	public Loja() {
		this.estoque = new ArrayList<>();
	}

	@Override
	public void adicionarProduto(Produto produto) {
		estoque.add(produto);
        System.out.println("Produto adicionado ao estoque: " + produto.getNome());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerProduto(String codigo) {
		// TODO Auto-generated method stub
		Produto produtoRemover = null;
        for (Produto produto : estoque) {
            if (produto.getCodigo().equals(codigo)) {
                produtoRemover = produto;
                break;
            }
        }
        if (produtoRemover != null) {
            estoque.remove(produtoRemover);
            System.out.println("Produto removido do estoque: " + codigo);
        } else {
            System.out.println("Produto não encontrado no estoque: " + codigo);
        }
	}

	@Override
	public void listarProdutosPorTipo(Class<?> tipoProduto) {
		// TODO Auto-generated method stub
		System.out.println("Produtos do tipo " + tipoProduto.getSimpleName() + " em estoque:");
        for (Produto produto : estoque) {
            if (tipoProduto.isInstance(produto)) {
                produto.exibirInformacoes();
                System.out.println("-----------------------");
            }
        }
	}
}
