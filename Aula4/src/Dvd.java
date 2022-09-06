
public class Dvd extends Tipo
{
   private int duracao;
   
   public void setDuracao(int duracao){
       this.duracao = duracao;
   }
   private int duracao(){
       return this.duracao;
   }
   
   public void imprimir(){
       super.imprimir();
       System.out.println("Duração: " + this.duracao);
   }
}
