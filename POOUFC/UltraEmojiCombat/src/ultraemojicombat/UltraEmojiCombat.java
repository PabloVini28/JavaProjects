
package ultraemojicombat;

public class UltraEmojiCombat {
    
    public static void main(String[] args) {
       Lutador Pablo = new Lutador("Pablo","Brasileiro",20,1.72f,70,13,2,1);
       Lutador Davi = new Lutador("Davi","Brasileiro",20,1.72f,70,10,0,0);
       
       Luta ufc = new Luta();
       ufc.marcarLuta(Pablo, Davi);
       ufc.lutar();
       Pablo.status();
       Davi.status();
    }
   
}
