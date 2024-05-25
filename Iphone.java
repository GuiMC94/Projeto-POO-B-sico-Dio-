import Internet.Internet;
import Musicas.ReproduçãodeMusica;
import Telefone.Telefone;

public class Iphone {
	
	public static void main(String[] args) {
		
		ReproduçãodeMusica banda = new ReproduçãodeMusica();
		banda.setReproduzir("The Killers");
		banda.setSelecionarMusica("Human");
		
		System.out.println("Esta executando:"+ banda.getReproduzir()  + "  "  + "Tocando:"+banda.getSelecionarMusica());
		
		
		
	     Telefone dados = new Telefone();
	     dados.setContatos("Bruno");
	     dados.setNumeroContatos(99875664);
	     
	     System.out.println("Contato:"+dados.getContatos()+": "+"Número:"+dados.getNumeroContatos());
	     
	     Internet acesso = new Internet();
	     acesso.setconectarInternet("Conectado");
	     acesso.setAcessarNavegador("Navegando");
	     
	     System.out.println("Sua rede está:"+ acesso.getConectarInternet()+" "+"Digite o que busca:"+acesso.getAcessarNavegador());
	     
	     
	     
	     
	     
	     
	     
	
	}

		
		
		
	}
	
	


	