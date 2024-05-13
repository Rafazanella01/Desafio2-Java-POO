package com.mycompany.sistemamatriculas;
/**
 *
 * @author rafaz
 */
public class SistemaMatriculas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Pessoa pes = new Pessoa("Rafael Zanella", 142054, "Rua intendente albino lenz, 1011");
        
        Disciplina d = new Disciplina(12, "Matematica", "ementa");
        
        DisciplinaEad ds = new DisciplinaEad(13, "fisica", "ementa", 17);
        
        int numUnidade = ds.getNumeroUnidades();
        System.out.println(ds);
        System.out.println(numUnidade);
        System.out.println(pes);
    }
}
