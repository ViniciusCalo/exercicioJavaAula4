
public abstract class Tipo
{
   private String localizacao;
   private String autor;
   
   public void setAutor(String autor){
       this.autor = autor;
   }
   public void setLocalizacao(String localizacao){
       this.localizacao = localizacao;
   }
   private String getAutor(){
       return this.autor;
   } 
   private String getLocalizacao(){
       return this.localizacao;
   }
   public void imprimir(){
       System.out.println("Autor: " + getAutor());
       System.out.println("Localização: " + getLocalizacao());
   }

}
