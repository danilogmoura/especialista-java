package com.github.danilogmoura;

public class Pedido {

    private String nomeCliente;

    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;
    private double valorTotal;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelado(getValorTotal())) {
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("Pedido não pode ser cancelado");
        }
    }

    public void marcarComoEntregue() {
        this.status = StatusPedido.ENTREGUE;
    }

    public void marcarComoEmitido() {
        this.status = StatusPedido.EMITIDO;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                       "nomeCliente='" + nomeCliente + '\'' +
                       ", status=" + status +
                       ", origem=" + origem +
                       '}';
    }
}
