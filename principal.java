import view.PostagensView;
import view.AlbumsView;
import view.TodosView;
import network.*;
import java.util.Scanner;

public class principal{

    public static void main(String[] args){
        
        Request ponto = new Request( );

        int opc = 0;
        String flag;

        Scanner entrada;
        Scanner leia;
        
        System.out.println("Bem vindo!");
        
        while(opc != 4){

            entrada = new Scanner(System.in);
            leia = new Scanner(System.in);

            System.out.println("Digite 1 para acessar a tela 'Postagens'");
            System.out.println("Digite 2 para acessar a tela 'Albums'");
            System.out.println("Digite 3 para acessar a tela 'TO-DOS'");
            System.out.println("Digite 4 para ENCERRAR");
            System.out.print("Digite o numero da tela que deseja: ");

            try{

                opc = entrada.nextInt();


            if(opc < 1 || opc > 4){

                System.out.println("Opcao invalida");
                System.out.println(" ");
                System.out.print("Aperte ENTER para retornar ao menu");
                flag = leia.nextLine( );
                System.out.println(" ");
                
            }//fim if

            else if(opc == 1){

                PostagensView post = new PostagensView();

                System.out.println(" ");
                System.out.println("POSTAGENS");
                post.print( );
                entrada.reset( );
                System.out.print("Aperte ENTER para retornar ao menu");
                flag = leia.nextLine( );
                System.out.println(" ");

            }//fim if

            else if(opc == 2){

                AlbumsView albums = new AlbumsView( );

                System.out.println(" ");
                System.out.println("ALBUMS");
                albums.print( );
                entrada.reset( );
                System.out.print("Aperte ENTER para retornar ao menu");
                flag = leia.nextLine( );
                System.out.println(" ");

            }//fim if

            else if(opc == 3){

                TodosView todos = new TodosView( );

                System.out.println(" ");
                System.out.println("TO-DOS");
                todos.print( );
                entrada.reset( );
                System.out.print("Aperte ENTER para retornar ao menu");
                flag = leia.nextLine( ); 
                System.out.println(" ");

            }//fim if

            if(opc == 4){

                System.out.println(" ");
                System.out.println("Encerrando...");
                System.out.println("Obrigado pela oportunidade");
                entrada.reset( );
                
            }//fim if

            }catch(Exception e){

                entrada.reset();
                opc = 0;

            }//fim catch

        }//fim while

    }//fim main

}//fim class