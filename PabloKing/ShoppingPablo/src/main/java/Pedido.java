
public class Pedido {
    
    private String carnedohamburguer;
    private String refrigerante;
    private String tempero;
    private String batatas;
    private String tipodepao;
    
    public void cancelarPedido(){
        System.out.println("Pedido Cancelado\n");
    }

    public Pedido(String carnedohamburguer, String refrigerante, String tempero, String batatas, String tipodepao) {
        this.carnedohamburguer = carnedohamburguer;
        this.refrigerante = refrigerante;
        this.tempero = tempero;
        this.batatas = batatas;
        this.tipodepao = tipodepao;
    }
    
    public Pedido(String escolha_carne){
        this.carnedohamburguer = escolha_carne;
    }

    @Override
    public String toString() {
        return "Pedido{" + "carnedohamburguer=" + carnedohamburguer + ", refrigerante=" + refrigerante + ", tempero=" + tempero + ", batatas=" + batatas + ", tipodepao=" + tipodepao + '}';
    }
    
    public String getCarnedohamburguer() {
        return carnedohamburguer;
    }

    public void setCarnedohamburguer(String carnedohamburguer) {
        this.carnedohamburguer = carnedohamburguer;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }

    public String getTempero() {
        return tempero;
    }

    public void setTempero(String tempero) {
        this.tempero = tempero;
    }

    public String getBatatas() {
        return batatas;
    }

    public void setBatatas(String batatas) {
        this.batatas = batatas;
    }

    public String getTipodepao() {
        return tipodepao;
    }

    public void setTipodepao(String tipodepao) {
        this.tipodepao = tipodepao;
    }
    
    
}

