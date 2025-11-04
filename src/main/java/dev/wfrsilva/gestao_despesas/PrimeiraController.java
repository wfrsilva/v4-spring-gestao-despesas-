package dev.wfrsilva.gestao_despesas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/coturnix")
@RestController
public class PrimeiraController {
    
    @GetMapping("/ola")
    public String helloCoturnix()
    {
        return "Olá seu bando de codornas.";
    }//helloCoturnix

}//PrimeiraController
