
package Classes;

public class Livro {
        
    private String codigo, area, editora;
    
    public Livro(){  //contrutor mãe vazio      
    }
    
    public Livro(String codigo, String area, String editora){ //construtor mãe com instancia de dados
        this.codigo = codigo;
        this.area = area;
        this.editora = editora;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }  
    
}
