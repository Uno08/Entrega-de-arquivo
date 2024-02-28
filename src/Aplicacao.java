public class Aplicacao{
		public static void main(String args[]) {
			Pessoa pFabio = new Pessoa ("Fabio");
			Pessoa pThales = new Pessoa("Thales");
			Pessoa pCaio = new Pessoa("Caio");

	        System.out.println("pFabio.nome="+pFabio.nome);
	        System.out.println("pLucas.nome="+pThales.nome);
	        System.out.println("pCaio.nome="+pCaio.nome);

	        
	        
	        
	        Carro c1 = new Carro();
	        Carro c2 = new Carro();
	        Carro c3 = new Carro();
	        
	        c1.cor = "Preto";
	        c2.cor = "Azul";
	        c3.cor = "Vermelho";
	        
	        System.out.println ("c1.cor="+c1.cor);
	        System.out.println ("c2.cor="+c2.cor);
	        System.out.println ("c3.cor="+c3.cor);
	        
	        System.out.println ("c1.dtompra="+c1.numplaca);
	        System.out.println ("c2.ctcompra="+c2.numplaca);
	        System.out.println ("c3.dtcompra="+c3.numplaca);

	        Carro.numplaca = 6345279;
	        System.out.println ("c1.dtcompra="+c1.numplaca);
	        System.out.println ("c2.dtcompra="+c3.numplaca);
	        System.out.println ("c3.dtcompra="+c3.numplaca);
	       
	      	        
	}

}