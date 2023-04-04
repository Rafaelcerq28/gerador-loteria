package com.loteria.geradorloteria;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gerador")
public class GeradorController {
    
    GeradorService geradorService;

    public GeradorController(GeradorService geradorService) {
        this.geradorService = geradorService;
    }

    /*
    Usando request mapping consigo receber valores atraves de formularios, 
    como http://localhost:8080/gerador/sortear?quantidade=6&range=70
    Modo quue chama os numeros de maneira "livre" passando o valor por formulario
    */
    @RequestMapping("/sortear/livre")
    @ResponseStatus(HttpStatus.OK)
    public Gerador sorteiaNumeros(int quantidade, int range){
        return geradorService.gerarNumeroLoteria("Nenhum jogo Especifico",quantidade, range);
    }

     //* TO DO
     //* Criar controllers para todos os jogos

     //* Lotomania 20n - 0 a 99
     @GetMapping("/sortear/lotomania")
     @ResponseStatus(HttpStatus.OK)
     public Gerador sorteiaLotomania(){
         return geradorService.gerarNumeroLoteriaComZero("lotomania",20, 99);
     }

     //* Quina 5n - 1-80
     @GetMapping("/sortear/quina")
     @ResponseStatus(HttpStatus.OK)
     public Gerador sorteiaQuina(){
         return geradorService.gerarNumeroLoteria("quina",5, 80);
     }
     //* Mega sena 6n - 1-60
     @GetMapping("/sortear/megasena")
     @ResponseStatus(HttpStatus.OK)
     public Gerador sorteiaMegaSena(){
         return geradorService.gerarNumeroLoteria("megasena",6, 60);
     }

     //* Lotofacil 15n - 1-25
     @GetMapping("/sortear/lotofacil")
     @ResponseStatus(HttpStatus.OK)
     public Gerador sorteiaLotoFacil(){
         return geradorService.gerarNumeroLoteria("lotofacil",15, 25);
     }

    /*
    Esse tipo de informaacao na assinatura do metodo funciona melhor nesse tipo de getMapping

    @GetMapping("/sortear/quantidade{quantidade}/range{range}")
    @ResponseStatus(HttpStatus.OK)
    public Gerador acessaSite(@PathVariable(value = "id") int quantidade, @PathVariable(value = "id")int range) 
    */
    
}
