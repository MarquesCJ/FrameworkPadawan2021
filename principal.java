
import view.PostagensView;
import view.AlbumsView;
import view.TodosView;
import java.util.Scanner;
import java.io.IOException;

public class principal{

    public static void limpaTerminal( )throws IOException, InterruptedException {
        
        if (System.getProperty("os.name").contains("Windows"))

            new ProcessBuilder("cmd", "/c", "cls").inheritIO( ).start( ).waitFor( );

        else
            Runtime.getRuntime().exec("clear");

    }//fim limpaTerminal
    public static void main(String[] args)throws IOException, InterruptedException{

        char opc = ' ';
        String flag;

        Scanner entrada;
        Scanner leia;

        System.out.println("Bem vindo!");
        
        while(opc != '4'){

            entrada = new Scanner(System.in);
            leia = new Scanner(System.in);

            System.out.println("Digite 1 para acessar a tela 'Postagens'");
            System.out.println("Digite 2 para acessar a tela 'Albums'");
            System.out.println("Digite 3 para acessar a tela 'TO-DOS'");
            System.out.println("Digite 4 para ENCERRAR");
            System.out.print("Digite o numero da tela que deseja: ");
            opc = entrada.next().charAt(0);
            
            if(opc == '1'){

                PostagensView post = new PostagensView();

                System.out.println(" ");
                System.out.println("POSTAGENS\n");
                System.out.println("Buscando...\n");
                post.print( );
                entrada.reset( );
                System.out.print("Aperte ENTER para retornar ao menu");
                flag = leia.nextLine( );
                System.out.println(" ");
                limpaTerminal( ); 

            }//fim if

            else if(opc == '2'){

                AlbumsView albums = new AlbumsView( );

                System.out.println(" ");
                System.out.println("ALBUMS\n");
                System.out.println("Buscando...\n");
                albums.print( );
                entrada.reset( );
                System.out.print("Aperte ENTER para retornar ao menu");
                flag = leia.nextLine( );
                System.out.println(" ");
                limpaTerminal();

            }//fim if

            else if(opc == '3'){

                TodosView todos = new TodosView( );

                System.out.println(" ");
                System.out.println("TO-DOS\n");
                System.out.println("Buscando...\n");
                todos.print( );
                entrada.reset( );
                System.out.print("Aperte ENTER para retornar ao menu");
                flag = leia.nextLine( );
                System.out.println(" ");
                limpaTerminal( );

            }//fim if

            else if(opc == '4'){

                System.out.println("\nEncerrando...");
                System.out.println("Obrigado pela oportunidade");
                System.out.println("Que a Forca esteja com voces! E eu tambem!");
                entrada.reset( );

            }//fim if

            else{

                System.out.println("\nEntrada invalida");
                System.out.print("\nAperte ENTER para retornar ao menu");
                flag = leia.nextLine( );
                System.out.println(" ");
                limpaTerminal( );

            }//fim else

        }//fim while

    }//fim main

}//fim class