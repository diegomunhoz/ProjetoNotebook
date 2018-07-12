import java.util.Scanner;


public class InsereNotebook {
	
	public static void main(String[] args) {
		receberDados();
		//receberData();

	}
		public static void receberDados(){
			
			Scanner monique = new Scanner(System.in);
			Notebook modelo = new Notebook();
			Hd hdmodelo = new Hd();
			Componentes comp = new Componentes();
			Data data = new Data();
			
			// HD
			System.out.println(Mensagem.dadosIniciais);
			System.out.println(Mensagem.modeloHd);
			hdmodelo.marca = monique.nextLine();
			System.out.println(Mensagem.qtdeCabecasHd);
			hdmodelo.qtdCabecas = monique.nextLine();
			System.out.println(Mensagem.capacidadeHd);
			hdmodelo.capacidade = monique.nextInt();
			monique.nextLine();
			System.out.println(Mensagem.entrada);
			hdmodelo.entrada = monique.nextLine();
			System.out.println(Mensagem.precoHd);
			hdmodelo.preco = monique.nextDouble();
			
			// Componentes
			monique.nextLine();
			System.out.println(Mensagem.som);
			comp.marcaSom = monique.nextLine();
			System.out.println(Mensagem.placaRede);
			comp.placaRede = monique.nextLine();
			System.out.println(Mensagem.portaUsb);
			comp.portasUsb = monique.nextLine();
			System.out.println(Mensagem.memoria);
			comp.memoria = monique.nextLine();
			System.out.println(Mensagem.processador);
			comp.processador = monique.nextLine();
			System.out.println(Mensagem.placaVideo);
			comp.placaDeVideo = monique.nextLine();
			System.out.println(Mensagem.monitor);
			comp.monitor = monique.nextLine();
			System.out.println(Mensagem.teclado);
			comp.teclado = monique.nextLine();
			System.out.println(Mensagem.mousePad);
			comp.mousePad = monique.nextLine();
			System.out.println(Mensagem.drive);
			comp.drive = monique.nextLine();
			
			// Data
			System.out.println(Mensagem.dataGarantiaDia);
			int dia = monique.nextInt();
			data.setDia(dia);
			System.out.println(Mensagem.dataGarantiaMes);
			int mes = monique.nextInt();
			data.setMes(mes);
			System.out.println(Mensagem.dataGarantiaAno);
			int ano = monique.nextInt();
			data.setAno(ano);
			
			modelo.hd = hdmodelo;
			modelo.dataGarantia = data;
			modelo.componente = comp;
			
			modelo.exibirDados();
			} // Fim do main.
		
} // Fim da classe.