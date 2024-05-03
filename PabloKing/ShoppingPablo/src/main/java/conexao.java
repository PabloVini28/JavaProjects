
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

   
public class conexao{
    
       public static void main(String[] args) throws SQLException{
        
        Connection conexao = null;
        try {
               Class.forName("com.mysql.jdbc.Driver");
               conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");       
        } catch (ClassNotFoundException ex) {
               System.out.println("Encontrou foi nada");
        } catch (SQLException ex) {
                System.out.println("Ocorreu o erro ao acessar o banco: " + ex.getMessage());
        }finally{
            if(conexao != null){
                conexao.close();
            }
        }
           
        // Após estabelecer conexao com MySQL, começar as vendas
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        while(n!=1000){
        
        System.out.println("----BEM-VINDO----");
        System.out.println("Bem-Vindo, gostaria de fazer um pedido ? - Digite 1!");
        n = entrada.nextInt();
        entrada.nextLine();
             
        
        if (n == 1) {
        
            System.out.println("Faca seu pedido:");
            System.out.println("Qual carne de hamburguer?");
            System.out.println("----------CARNES----------");
            System.out.println("1 -Bovina");
            System.out.println("2 -Suina");
            System.out.println("3 -Ave");
            System.out.println("4 -Vegana");

            String escolha_carne = null;
            
            while(escolha_carne == null) {
                
                escolha_carne = entrada.nextLine().toLowerCase(); 

                if(null != escolha_carne)switch (escolha_carne) {
                    case "bovina":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_carnes_bovinas = conexao.createStatement().executeQuery("select carnebovina from carnes");
                        while(numero_carnes_bovinas.next()){
                            String a = numero_carnes_bovinas.getString("carnebovina");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("A carne bovina esta em falta!");
                                System.out.println("Escolha novamente:");
                                escolha_carne = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE carnes SET carnebovina = carnebovina - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "suina":{
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_carnes_suinas = conexao.createStatement().executeQuery("select carnesuina from carnes");
                        while(numero_carnes_suinas.next()){
                            String a = numero_carnes_suinas.getString("carnesuina");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("A carne suina esta em falta!");
                                System.out.println("Escolha novamente:");
                                escolha_carne = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE carnes SET carnesuina = carnesuina - 1");
                                updateStmt.executeUpdate();
                            }  
                        }   break;
                        }
                    case "ave":{
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_carnes_ave = conexao.createStatement().executeQuery("select carneave from carnes");
                        while(numero_carnes_ave.next()){
                            String a = numero_carnes_ave.getString("carneave");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("A carne de aves esta em falta!");
                                System.out.println("Escolha novamente:");
                                escolha_carne = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE carnes SET carneave = carneave - 1");
                                updateStmt.executeUpdate();
                            }  
                        }   break;
                    }
                    case "vegana":{
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_carnes_veganas = conexao.createStatement().executeQuery("select carnevegana from carnes");
                        while(numero_carnes_veganas.next()){
                            String a = numero_carnes_veganas.getString("carnevegana");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("A carne vegana esta em falta!");
                                System.out.println("Escolha novamente:");
                                escolha_carne = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE carnes SET carnevegana = carnevegana - 1");
                                updateStmt.executeUpdate();
                            }  
                        }   break;
                    }    
                }
            }
                
            /*conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
            PreparedStatement updateStmt = conexao.prepareStatement("UPDATE carnes SET carnebovina = carnebovina - 1");
            updateStmt.executeUpdate();
            ResultSet rsclient = conexao.createStatement().executeQuery("select *from carnes");
            while(rsclient.next()){
            System.out.println("Nome: " + rsclient.getString("carnevegana"));
            }*/
                
            
            System.out.println("Qual refrigerante deseja pedir ?");
            System.out.println("----------Refris----------");
            System.out.println("1 -Coca");
            System.out.println("2 -Laranja");
            System.out.println("3 -Uva");
            System.out.println("4 -Guarana");
                
                String refri = null;
                while (refri == null) {  
                refri = entrada.nextLine().toLowerCase(); // Convert input to lowercase
                if(null != refri)switch (refri) {
                    case "coca":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_cocas = conexao.createStatement().executeQuery("select coca from refri");
                        while(numero_cocas.next()){
                            String a = numero_cocas.getString("coca");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("A coca esta em falta!");
                                System.out.println("Escolha novamente:");
                                refri = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE refri SET coca = coca - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "laranja":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_laranja = conexao.createStatement().executeQuery("select laranja from refri");
                        while(numero_laranja.next()){
                            String a = numero_laranja.getString("laranja");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("O refri de laranja esta em falta!");
                                System.out.println("Escolha novamente:");
                                refri = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE refri SET laranja = laranja - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "uva":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_uva = conexao.createStatement().executeQuery("select uva from refri");
                        while(numero_uva.next()){
                            String a = numero_uva.getString("uva");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("O refri de uva esta em falta!");
                                System.out.println("Escolha novamente:");
                                refri = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE refri SET uva = uva - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "guarana":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_guarana = conexao.createStatement().executeQuery("select guarana from refri");
                        while(numero_guarana.next()){
                            String a = numero_guarana.getString("guarana");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("O guarana esta em falta!");
                                System.out.println("Escolha novamente:");
                                refri = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE refri SET guarana = guarana - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;                      
                    default:
                        break;
                }
            }
                
                
            System.out.println("Qual tempero gostaria de adicionar ?");
            System.out.println("----------Temperos----------");
            System.out.println("1 -Cheddar");
            System.out.println("2 -Catupiry");
            System.out.println("3 -Maionese");
            System.out.println("4 -Ketchup");
            
            String temp = null;
            while (temp == null) {  
            temp = entrada.nextLine().toLowerCase(); // Convert input to lowercase
                
                if(null != temp)switch (temp){
                    case "cheddar":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_cheddar = conexao.createStatement().executeQuery("select cheddar from temp");
                        while(numero_cheddar.next()){
                            String a = numero_cheddar.getString("cheddar");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("O cheddar esta em falta!");
                                System.out.println("Escolha novamente:");
                                temp = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE temp SET cheddar = cheddar - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "catupiry":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_catupiry = conexao.createStatement().executeQuery("select catupiry from temp");
                        while(numero_catupiry.next()){
                            String a = numero_catupiry.getString("catupiry");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("O catupiry esta em falta!");
                                System.out.println("Escolha novamente:");
                                temp = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE temp SET catupiry = catupiry - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "maionese":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_maionese = conexao.createStatement().executeQuery("select maionese from temp");
                        while(numero_maionese.next()){
                            String a = numero_maionese.getString("maionese");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("A maionese esta em falta!");
                                System.out.println("Escolha novamente:");
                                temp = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE temp SET maionese = maionese - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "ketchup":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_ketchup = conexao.createStatement().executeQuery("select ketchup from temp");
                        while(numero_ketchup.next()){
                            String a = numero_ketchup.getString("ketchup");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("O ketchup esta em falta!");
                                System.out.println("Escolha novamente:");
                                temp = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE temp SET ketchup = ketchup - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;                      
                    default:
                        break;
                }
            }
                
                System.out.println("Qual batata gostaria de adicionar ?");
                System.out.println("----------Batatas----------");
                System.out.println("1 -Fritas");
                System.out.println("2 -Chips");
                
                
                String batatas_aux = null;
                while (batatas_aux == null) {  
                batatas_aux = entrada.nextLine().toLowerCase(); // Convert input to lowercase
                
                if(null != batatas_aux)switch (batatas_aux){
                    case "fritas":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_fritas = conexao.createStatement().executeQuery("select fritas from batatas");
                        while(numero_fritas.next()){
                            String a = numero_fritas.getString("fritas");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("As fritas estao em falta!");
                                System.out.println("Escolha novamente:");
                                batatas_aux = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE batatas SET fritas = fritas - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "chips":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_chips = conexao.createStatement().executeQuery("select chips from batatas");
                        while(numero_chips.next()){
                            String a = numero_chips.getString("chips");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro <= 0){
                                System.out.println("As chips estao em falta!");
                                System.out.println("Escolha novamente:");
                                batatas_aux = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE batatas SET chips = chips - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                }
            }
            System.out.println("Qual batata gostaria de adicionar ?");
            System.out.println("----------Tipo-de-Pao----------");
            System.out.println("1 -Brioche");
            System.out.println("2 -Carioca");  
            System.out.println("3 -Arabe");
            
            String tipodepao_aux = null;
                while (tipodepao_aux == null) {  
                tipodepao_aux = entrada.nextLine().toLowerCase(); // Convert input to lowercase
                
                if(null != tipodepao_aux)switch (tipodepao_aux){
                    case "brioche":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_brioche = conexao.createStatement().executeQuery("select brioche from tipodepao");
                        while(numero_brioche.next()){
                            String a = numero_brioche.getString("brioche");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro == 0){
                                System.out.println("O pao brioche esta em falta!");
                                System.out.println("Escolha novamente:");
                                tipodepao_aux = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE tipodepao SET brioche = brioche - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "carioca":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_carioca = conexao.createStatement().executeQuery("select carioca from tipodepao");
                        while(numero_carioca.next()){
                            String a = numero_carioca.getString("carioca");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro == 0){
                                System.out.println("O pao carioca esta em falta!");
                                System.out.println("Escolha novamente:");
                                tipodepao_aux = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE tipodepao SET carioca = carioca - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;
                    case "arabe":
                        conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                        ResultSet numero_arabe = conexao.createStatement().executeQuery("select arabe from tipodepao");
                        while(numero_arabe.next()){
                            String a = numero_arabe.getString("arabe");
                            int Inteiro = Integer.parseInt(a);
                                
                            if(Inteiro == 0){
                                System.out.println("O pao arabe esta em falta!");
                                System.out.println("Escolha novamente:");
                                tipodepao_aux = null;
                            }
                            else{
                                conexao = DriverManager.getConnection("jdbc:mysql://localhost/estoque","root","");
                                PreparedStatement updateStmt = conexao.prepareStatement("UPDATE tipodepao SET arabe = arabe - 1");
                                updateStmt.executeUpdate();
                            }  
                        }
                        break;    
                    }
                }
                
                Pedido pedido01 = new Pedido(escolha_carne,refri,temp,batatas_aux,tipodepao_aux);
                System.out.println("Gostaria de revisar seu pedido?");
                System.out.println("Digite 1 se sim, se não, digite qualquer outra tecla!");
                int aux01;
                aux01 = entrada.nextInt();
                entrada.nextLine();
                if(aux01 == 1){
                    System.out.println(pedido01);
                        System.out.println("Sair - digite 4");
                        int x;
                        x = entrada.nextInt();
                        entrada.nextLine();
                        if(x == 4){
                            n = 1000;
                        }
                        else
                        {
                            n = 1000;
                        }
                }
                else{
                    n = 1000;
                }
            }        
       }
    }    
}
       

