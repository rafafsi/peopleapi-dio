package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
public class PersonalController {

    @GetMapping
    public String getBook() {
        return "API test!";
    }
}


/*
*  @RestController - fica na classe principal (PersonalController -> porta de entrada do projeto)
*           significa que é um controlador e que vai ser acessado através de uma API REST
*
*  @RequestMapping  - apresenta o caminho principal da API
*  (que atende o nível 1 de maturidade de uma api: nome de recursos bem definidos)
*   o java permite essa definição de recurso a nível de classe
*
*   api - é uma api
*   v1 - versionamento
*   people - classe que gerencia toda people
* */