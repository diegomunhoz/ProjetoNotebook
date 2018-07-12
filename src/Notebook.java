


public class Notebook {
	Hd hd;
	Componentes componente;
	Data dataGarantia;
	
	public void exibirDados(){
		System.out.println("***** DADOS DO NOTEBOOK *****");
		// HD
		System.out.println("HD Marca: " + hd.marca);
		System.out.println("HD quantidade de cabeças: " + hd.qtdCabecas);
		System.out.println("HD capacidade: " + hd.capacidade);
		System.out.println("HD entrada: " + hd.entrada);
		System.out.println("HD valor: " + hd.preco);
		// Componentes
		System.out.println("Componente Marca Som: " + componente.marcaSom);
		System.out.println("Componente Portas USB: " + componente.portasUsb);
		System.out.println("Componente Placa de Rede: " + componente.placaRede);
		System.out.println("Componente Memória: " + componente.memoria);
		System.out.println("Componente Processador: " + componente.processador);
		System.out.println("Componente Placa de Vídeo: " + componente.placaDeVideo);
		System.out.println("Componente Monitor: " + componente.monitor);
		System.out.println("Componente Teclado: " + componente.teclado);
		System.out.println("Componente MousePad: " + componente.mousePad);
		System.out.println("Componente Drive: " + componente.drive);
		// Data
		System.out.println("Data Garantia: " + dataGarantia.getDia() + "/" + dataGarantia.getMes() + "/" + dataGarantia.getAno());
			
	}

}
