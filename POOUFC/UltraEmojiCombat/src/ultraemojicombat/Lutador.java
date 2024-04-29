
package ultraemojicombat;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias,derrotas,empates;
    
    //metodos
    
    public void apresentar(){
        System.out.println("Chegou o homi "  + this.getNome());
        System.out.println("Peso " + this.getPeso());
        System.out.println("Altura " + this.getAltura());
        System.out.println("Nacionalidade "+ this.getNacionalidade());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Categoria "+this.getCategoria());
    }   
    
    public void status(){
        System.out.println("Chegou o homi "  + this.getNome());
        System.out.println("Peso " + this.getPeso());
        System.out.println("Altura " + this.getAltura());
        System.out.println("Lutas Vencidas " + this.getVitorias());
        System.out.println("Lutas Perdidas " + this.getDerrotas());
        System.out.println("Lutas Empatadas " + this.getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setVitorias(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.peso <= 70.3){
            this.categoria ="leve";
        }
        else if(this.peso <= 83.9){
            this.categoria ="media";
        }
        else if(this.peso <= 120.2){
            this.categoria ="pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
