
package Classes;

import java.util.ArrayList;

public class metodos_titulo {
    
    public ArrayList titulos(){
        ArrayList<Obra> dadosTitulos = new ArrayList<Obra>();
        for (int i = 0; i < Obra.obra.size(); i++) {            
            Obra x = new Obra();
            x.setNome_obra(Obra.obra.get(i).getNome_obra());
            dadosTitulos.add(x);
        }        
        return dadosTitulos;
    }
    
    public ArrayList pesquisaTitulos(String titulo){
        ArrayList<Obra> pesquisa = new ArrayList<Obra>();
        for (int i = 0; i < Obra.obra.size(); i++) {
            if (titulo.equals(Obra.obra.get(i).getNome_obra())) {
                Obra x = new Obra();
                x.setCodigo(Obra.obra.get(i).getCodigo());
                x.setArea(Obra.obra.get(i).getArea());
                x.setEditora(Obra.obra.get(i).getEditora());
                x.setNome_obra(Obra.obra.get(i).getNome_obra());
                x.setNome_autor(Obra.obra.get(i).getNome_autor());
                x.setQtd_paginas(Obra.obra.get(i).getQtd_paginas());
                pesquisa.add(x);
            }
        }        
        return pesquisa;
    }
}
