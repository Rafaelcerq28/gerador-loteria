package com.loteria.geradorloteria;

import java.util.List;

//Classe para armazenar os numeros gerados
public class Gerador {
    
    private String nomeJogo;
    private List<Integer> numerosGerados;
    
    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public List<Integer> getNumerosGerados() {
        return numerosGerados;
    }

    public void setNumerosGerados(List<Integer> numerosGerados) {
        this.numerosGerados = numerosGerados;
    }


}
