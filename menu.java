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
					opA = JOptionPane.showInputDialog("Menu Ger�ncia de Locat�rios:\nA) Cadastrar Locat�rio\nB) Buscar Locat�rio\nC) Pesquisar Locat�rio\nD) Excluir locat�rio");
					opcLoc = opA.charAt(0);
					
					switch(opcLoc) {
					case 'A':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de locat�rios");
						break;
					case 'B':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a busca de locat�rios");
						break;
					case'C':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a pesquisa de locat�rios");
						break;
					case'D':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a exclus�o de locat�rios cadastrados");
						break;
					default:
						JOptionPane.showMessageDialog(null,"Digite uma op��o v�lida");
						break;
					}
					
					break;
					
				case 'B':
					opB = JOptionPane.showInputDialog("Menu Ger�ncia de Frotas:\nA) Cadastrar ve�culos\nB) Pesquisar Ve�culo\nC) Atualizar dados de um ve�culo\nD) Remover ve�culo da frota");
					opcFrot = opB.charAt(0);
					switch(opcFrot) {
					case 'A':
						opCad = JOptionPane.showInputDialog(null,"Menu de cadastro de ve�culos:\nA) Cadastrar ve�culo de passeio\nB) Cadastrar ve�culo utilit�rio\nC) cadastrar motocicleta");
						opcCadVei = opCad.charAt(0);
						
						switch(opcCadVei) {
						case 'A':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de ve�culos de passeio");
							break;
						case'B':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de ve�culos utilit�rios ");
							break;
						case'C':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado o cadastro de motocicletas");
							break;
							
						default:
							JOptionPane.showMessageDialog(null,"Digite uma op��o v�lida ");
							break;
						}
						
						break;
					case 'B': 
						opPesq = JOptionPane.showInputDialog(null,"Menu de pesquisa de ve�culos:\nA) Pesquisar ve�culo pelo Renavam\nB) Pesquisar ve�culo por marca, modelo ou renavam");
						opcPesqVei = opPesq.charAt(0);
						
						switch(opcPesqVei) {
						case 'A':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado a pesquisa de ve�culos pelo renavam");
							break;
						case 'B':
							JOptionPane.showMessageDialog(null,"Aqui sera implementado a pesquisa de ve�culos de passeio por marca, modelo ou renavam");
							break;
					    default: 
					    	JOptionPane.showMessageDialog(null,"Digite uma op��o v�lida");
					    	break;
						}
						
						break;
					case 'C':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a atualiza��o de dados de um ve�culo");
						break;
					case 'D':
						JOptionPane.showMessageDialog(null,"Aqui sera implementado a exclus�o de ve�culos cadastrados");
						break;
					default:
						JOptionPane.showMessageDialog(null,"Digite uma op��o v�lida ");
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

