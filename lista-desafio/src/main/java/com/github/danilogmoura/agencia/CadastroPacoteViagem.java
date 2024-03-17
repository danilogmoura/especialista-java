package com.github.danilogmoura.agencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroPacoteViagem {

    private final List<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        var pacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if (this.pacotes.contains(pacoteViagem)) {
            throw new PacoteViagemDuplicadoException("Pacote de viagem com esta descrição já foi adicionado");
        }

        this.pacotes.add(pacoteViagem);
    }

    public List<PacoteViagem> obterTodos() {
        return this.pacotes;
    }

    public void ordenar() {
        Collections.sort(this.pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PrecoPacoteViagemComparetor().reversed());
    }

    public void removerPorDescricao(String descricao) {
        boolean removido = false;

        var pacoteViagemIterator = this.pacotes.iterator();
        while (pacoteViagemIterator.hasNext()) {
            if (pacoteViagemIterator.next().getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
            }
        }

        if (removido) {
            throw new PacoteViagemNaoEncontrado("Pacote de viagem não encontrado com descrição");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacoteViagem : pacotes) {
            if (pacoteViagem.getDescricao().equals(descricao)) {
                return pacoteViagem;
            }
        }

        throw new PacoteViagemNaoEncontrado("Pacote de viagem não encontrado");
    }

}
