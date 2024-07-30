package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public List<String> listBSMs() {
        return Arrays.asList(
                "BSM - Proatividade",
                "BSM - Orientação ao Futuro",
                "BSM - Comunicação",
                "BSM - Pensamento Crítico",
                "BSM - Orientação ao Detalhe",
                "BSM - Trabalho em Equipe",
                "BSM - Responsabilidade Pessoal",
                "BSM - Mentalidade de Crescimento"
        );
    }

    @GetMapping("/objetivos")
    public List<String> listObjetivos() {
        return Arrays.asList(
                "Aprender Spring Boot",
                "Praticar Java",
                "Desenvolver APIs RESTful",
                "Melhorar habilidades em programação"
        );
    }
}

