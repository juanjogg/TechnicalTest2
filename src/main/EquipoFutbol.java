package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EquipoFutbol {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String name, stadium;
		int numTitles, opt;
		System.out.println("Ingreso de datos del equipo:");
		System.out.println("Nombre equipo:");
		name = read.nextLine();
		System.out.println("Nombre estadio:");
		stadium = read.nextLine();
		System.out.println("Numero de titulos:");
		numTitles = read.nextInt();
		Club club = new Club(name, stadium, numTitles);
		System.out.println("Jugadores titulares:");
		club.setTitulares(readPlayer());
		System.out.println("Jugadores suplentes:");
		club.setSuplentes(readPlayer());
		
		System.out.println("Generacion de reporte:");
		opt = 0;
		while(opt != 3) {
			System.out.println("1) Reporte basico \n2) Reporte detallado\n3)Salir");
			opt = read.nextInt();
			if(opt == 1) {
				System.out.println(club.toString() + "\nNumero de jugadores " + (club.getTitulares().size() + club.getSuplentes().size()));
				
			}
			else{
				System.out.println(club.toString());
				System.out.println("Jugadores titulares:");
				printList(club.getTitulares());
				System.out.println("Jugadores suplentes:");
				printList(club.getSuplentes());
				
			}
		}
		
		
		
		read.close();
		
	}
	
	public static List<Jugador> readPlayer(){
		Scanner read = new Scanner(System.in);
		List<Jugador> players = new ArrayList<Jugador>();
		String name = "", pos = "";
		boolean flag = true;
		while(flag) {
			System.out.println("Ingreso de jugadores: (Ingrese dos x's para finalizar)");
			System.out.println("Nombre jugador:");
			name = read.nextLine();
			System.out.println("Posicion:");
			pos = read.nextLine();
			if(name.equals("x") && pos.equals("x")) {
				flag = false;
			}
			else {
				Jugador player = new Jugador(name, pos);
				players.add(player);
			}
			
		}
		
		return players;
	}
	
	public static void printList(List<Jugador> players) {
		for(int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).toString());
		}
		
	}

}
