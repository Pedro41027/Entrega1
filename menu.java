package app;
import javax.swing.JOptionPane;
public class menu {

	public static void main(String[] args) {
		String op,opA,opB, opCad, opPesq;
		char opc, opcLoc, opcFrot, opcCadVei, opcPesqVei;
		
		do {
			op = JOptionPane.showInputDialog("Menu Principal: \nA)Gerenciar Locatario \nB)Gerenciar Frota \nC)Gerenciar Reservas \nD)Sair do Programa \n\nDigite a opcao:");
			opc = op.charAt(0);
			
			switch(opc) {
				case 'A':
					opA = JOptionPane.showInputDialog("Menu Gerência de Locatários:\nA) Cadastrar Locatário\nB) Buscar Locatário\nC) Pesquisar Locatário\nD) Excluir locatário");
					opcLoc = opA.charAt(0);
					
					switch(opcLoc) {
					case 'A':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de locatários");
						break;
					case 'B':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a busca de locatários");
						break;
					case'C':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a pesquisa de locatários");
						break;
					case'D':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a exclusão de locatários cadastrados");
						break;
					default:
						JOptionPane.showMessageDialog(null,"Digite uma opção válida");
						break;
					}
					
					break;
					
				case 'B':
					opB = JOptionPane.showInputDialog("Menu Gerência de Frotas:\nA) Cadastrar veículos\nB) Pesquisar Veículo\nC) Atualizar dados de um veículo\nD) Remover veículo da frota");
					opcFrot = opB.charAt(0);
					switch(opcFrot) {
					case 'A':
						opCad = JOptionPane.showInputDialog(null,"Menu de cadastro de veículos:\nA) Cadastrar veículo de passeio\nB) Cadastrar veículo utilitário\nC) cadastrar motocicleta");
						opcCadVei = opCad.charAt(0);
						
						switch(opcCadVei) {
						case 'A':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de veículos de passeio");
							break;
						case'B':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de veículos utilitários ");
							break;
						case'C':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de motocicletas");
							break;
							
						default:
							JOptionPane.showMessageDialog(null,"Digite uma opção válida ");
							break;
						}
						
						break;
					case 'B': 
						opPesq = JOptionPane.showInputDialog(null,"Menu de pesquisa de veículos:\nA) Pesquisar veículo pelo Renavam\nB) Pesquisar veículo por marca, modelo ou renavam");
						opcPesqVei = opPesq.charAt(0);
						
						switch(opcPesqVei) {
						case 'A':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado a pesquisa de veículos pelo renavam");
							break;
						case 'B':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado a pesquisa de veículos de passeio por marca, modelo ou renavam");
							break;
					    default: 
					    	JOptionPane.showMessageDialog(null,"Digite uma opção válida");
					    	break;
						}
						
						break;
					case 'C':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a atualização de dados de um veículo");
						break;
					case 'D':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a exclusão de veículos cadastrados");
						break;
					default:
						JOptionPane.showMessageDialog(null,"Digite uma opção válida ");
						break;
					}
					break;
					
				case 'C':
					JOptionPane.showMessageDialog(null, "-----A ser implementado-----");
					break;
				
				default:
					
					break;
			}
		}while(opc != 'D');

	}

}

