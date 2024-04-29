package pessoasleitura;

public class PessoasLeitura {

    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro[] l = new Livro[2];
       
       p[0] = new Pessoa("Pablo",20,'m');
       p[1] =  new Pessoa("Maria",19,'f');
       
       l[0] = new Livro("Aprendendo Java","Gustavo",100,p[0]);
       l[1] = new Livro("Aprendendo POO","José",50,p[1]);
       
       l[0].abrir();
       l[0].folhear(12);
       
       System.out.println("Detalhes do livro 0 "+ l[0].detalhes());
    }
    
}
