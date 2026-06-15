package poojava.exercicio;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Carro {    

    String cor;
    String modelo;
    int capacidadeTanque;

    public double totalValor(double valorCombustivel) {
        
        return capacidadeTanque * valorCombustivel;
    }
}