
public class Livro extends Tipo
{
    private String titulo;
    private double preco;
    
    public Livro(){
        this.preco=100;
    }
    
    private String getTitulo(){
        return this.titulo;    
    }
    
    private double getPreco(){
        return this.preco;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Preço: " + getPreco());
    }
}
