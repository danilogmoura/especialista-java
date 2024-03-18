package com.github.danilogmoura;

import com.github.danilogmoura.detran.Carro;
import com.github.danilogmoura.detran.Proprietario;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Proprietario maria = new Proprietario("Maria", "05577788899");
        Proprietario ana = new Proprietario("Ana", "33344488811");
        Proprietario jose = new Proprietario("José", "09988877766");
        Proprietario joao = new Proprietario("João", "22233344455");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

//        Map<Carro, Proprietario> proprietarios = new LinkedHashMap<>();
//        Map<Carro, Proprietario> proprietarios = new Hashtable<>();
        Map<Carro, Proprietario> proprietarios = new TreeMap<>();


        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);


//        proprietarios.put(porsche, joao);


//        proprietarios.remove(new Carro("JAV5A67", "Ford Ka"));

//        proprietarios.put(null, joao);

//        proprietarios.put(porsche, null);
//        proprietarios.put(ford, null);

//        System.out.println(proprietarios);

//        System.out.println(proprietarios.get(new Carro("JAV5A67", "Ford Ka")));
//        System.out.println(proprietarios.get(new Carro("XXX5A67", "Ford Ka")));

//        Set<Carro> carros = proprietarios.keySet();
//        for (Carro carro : carros) {
//            System.out.println(carro);
//        }

//        for (Carro carro : proprietarios.keySet()) {
//            System.out.println(carro);
//        }

//        Collection<Proprietario> proprietariosCollection = proprietarios.values();
//        for (Proprietario proprietario : proprietariosCollection) {
//            System.out.println(proprietario);
//        }

//        for (Proprietario proprietario : proprietarios.values()) {
//            System.out.println(proprietario);
//        }

//        for (Carro carro : proprietarios.keySet()) {
//            var proprietario = proprietarios.get(carro);
//            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(), proprietario.getNome());
//        }

//        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
//            var carro = entry.getKey();
//            var proprietario = entry.getValue();
//            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(), proprietario.getNome());
//        }

        for (var entry : proprietarios.entrySet()) {
            var carro = entry.getKey();
            var proprietario = entry.getValue();
            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(), proprietario.getNome());
        }
    }
}
