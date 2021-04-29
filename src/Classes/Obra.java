package Classes;

import java.util.ArrayList;

public class Obra extends Livro {
    
    public static ArrayList<Obra> obra = new ArrayList<>();
    
    private int qtd_paginas;
    private String nome_obra, nome_autor;
    
    public Obra(){  
        super();
    }
    
    public Obra(String codigo, String area, String editora, String nome_obra, String nome_autor, int paginas ){
        super(codigo, area, editora);
        this.nome_obra = nome_obra;
        this.nome_autor = nome_autor;
        this.qtd_paginas = paginas;        
    }
    
    

    public int getQtd_paginas() {
        return qtd_paginas;
    }

    public void setQtd_paginas(int qtd_paginas) {
        this.qtd_paginas = qtd_paginas;
    }

    public String getNome_obra() {
        return nome_obra;
    }

    public void setNome_obra(String nome_obra) {
        this.nome_obra = nome_obra;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }
}
