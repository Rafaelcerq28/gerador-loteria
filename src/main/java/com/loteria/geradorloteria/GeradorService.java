package com.loteria.geradorloteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GeradorService {
    
    /*
    Metodo que recebe dois valores como entrada e gera um lista de inteiros aleatorios 
    com a quantidade e no range informado, no final retorna um objeto Gerador
    */
    public Gerador gerarNumeroLoteria(String tipoJogo, int quantidadeNumeros,int totalNumeros){
        
        Gerador gerador = new Gerador();
        
        Random sorteiaNumeros = new Random();
        
        List<Integer> listaDeNumeros = new ArrayList<Integer>();

        for(int i =0; i < quantidadeNumeros; i++){
            int numGerado = sorteiaNumeros.nextInt(totalNumeros+1);
            //Checa se foi gerado um 0
            if(numGerado == 0){
                if(i==0){
                    continue;
                }else{
                    i--;
                }
            }else{
                //Armazena o numero gerado na lista
                if(listaDeNumeros.contains(numGerado) == false){
                    listaDeNumeros.add(numGerado);
                }else{
                    i--;
                }                
            }

        }

        //Ordena o array e salva no objeto
        Collections.sort(listaDeNumeros);
        gerador.setNomeJogo(tipoJogo);
        gerador.setNumerosGerados(listaDeNumeros);
        
        return gerador;
    }

    public Gerador gerarNumeroLoteriaComZero(String tipoJogo, int quantidadeNumeros,int totalNumeros){
        
        Gerador gerador = new Gerador();
        
        Random sorteiaNumeros = new Random();
        
        List<Integer> listaDeNumeros = new ArrayList<Integer>();

        for(int i =0; i < quantidadeNumeros; i++){
            int numGerado = sorteiaNumeros.nextInt(totalNumeros+1);

            //Armazena o numero gerado na lista
            if(listaDeNumeros.contains(numGerado) == false){
                listaDeNumeros.add(numGerado);
            }else{
                i--;
            }                
        }

        //Ordena o array e salva no objeto
        Collections.sort(listaDeNumeros);
        gerador.setNomeJogo(tipoJogo);
        gerador.setNumerosGerados(listaDeNumeros);
        
        return gerador;
    }

}
