/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

public class Luta {
     private Lutador desafiado;
     private Lutador desafiante;
     private int round;
     private boolean aprovado;
     
     public void marcarLuta(Lutador l1,Lutador l2){
         if(l1.getCategoria().equals (l2.getCategoria())
             && l1 != l2){
             this.aprovado = true;
             this.desafiado = l1;
             this.desafiante = l2;
         } else{
             this.aprovado = false;
             this.desafiado = null;
             this.desafiado = null;
         }
     }
     public void lutar(){
         if(this.aprovado){
             System.out.println("Desafiante: ");
             this.desafiante.apresentar();
             System.out.println("Desafiado: ");
             this.desafiado.apresentar();
             
             Random aleatorio = new Random();
             int vencedor = aleatorio.nextInt(3);
             switch(vencedor){
                 case 0:
                     System.out.println("Empatou");
                     this.desafiado.empatarLuta();
                     this.desafiante.empatarLuta();
                     break;
                 case 1:
                     System.out.println("Venceu " + this.desafiado.getNome());
                     this.desafiado.ganharLuta();
                     this.desafiante.perderLuta();
                     break;
                 case 2:    
                     System.out.println("Venceu "+ this.desafiante.getNome());
                     this.desafiante.ganharLuta();
                     this.desafiado.perderLuta();
                     break;
             }
         }else{
             System.out.println("A luta não pode ocorrer");
         }
     } 

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
     
     
     
}
