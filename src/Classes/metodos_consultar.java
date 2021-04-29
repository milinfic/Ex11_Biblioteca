
package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class metodos_consultar {
    
    public ArrayList pesquisaautor() {//pesquisar Autor, se tiver livro do mesmo autor, será descartado o mesmo, e enviando apenas uma vez
        ArrayList<Obra> autor = new ArrayList<Obra>();
        int v;

        String data;

        for (int i = 0; i < Obra.obra.size(); i++) {
            v = 0;
            Obra x = new Obra();

            data = Obra.obra.get(i).getNome_autor();
            for (int j = 0; j < autor.size(); j++) {
                if (Obra.obra.get(i).getNome_autor().equals(autor.get(j).getNome_autor())) {
                    v++;
                }
            }
            if (v == 0) {
                x.setNome_autor(Obra.obra.get(i).getNome_autor());
                autor.add(x);
            }
        }
        return autor;
    }
    
    public ArrayList comboAutor(String autor){
        ArrayList<Obra> combo = new ArrayList<Obra>();
        for (int i = 0; i < Obra.obra.size(); i++) {
                if (autor.equals(Obra.obra.get(i).getNome_autor())) {
                    Obra x = new Obra();
                    x.setCodigo(Obra.obra.get(i).getCodigo());
                    x.setArea(Obra.obra.get(i).getArea());
                    x.setEditora(Obra.obra.get(i).getEditora());
                    x.setNome_obra(Obra.obra.get(i).getNome_obra());
                    x.setNome_autor(Obra.obra.get(i).getNome_autor());
                    x.setQtd_paginas(Obra.obra.get(i).getQtd_paginas());                    
                    combo.add(x);
                }
            }        
        return combo;
    }
}
