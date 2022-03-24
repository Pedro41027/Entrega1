package app;
import javax.swing.JOptionPane;
public class menu {

	public static void main(String[] args) {
		String op,opA,opB;
		char opc, opcLoc, opcFrot;
		
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
						break;
					}
					break;
					
				case 'B':
					opB = JOptionPane.showInputDialog("Menu Gerência de Frotas:\nA) Cadastrar veículos\nB) Pesquisar Veículo\nC) Atualizar dados de um veículo\nD) Remover veículo da frota");
					opcFrot = opB.charAt(0);
					switch(opcFrot) {
					case 'A':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de veículos");
						break;
					case 'B': 
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a pesquisa de veículos");
						break;
					case 'C':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a atualizaçõ de dados de um veículo");
						break;
					case 'D':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a exclusãop de veículos cadastrados");
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

