

public class Biblioteca
{
    private Tipo [] estante = new Tipo[10];
    private int total=0;
    
    public void adicionaItem(Tipo novoTipo){
      if (total<10){
        estante[total]=novoTipo;
        total++;
      }
      else
        System.out.println("A estante esta cheia");
    }
    
    public void imprimir(){
        for(int i=0; i<total;i++){
            estante[i].imprimir();
        }
    }
}
