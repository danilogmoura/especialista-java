package com.github.danilogmoura;

public class Main {

    public static void main(String[] args) {
        var servico = new ServicoCancelamentoPedido();

        var pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setOrigem(OrigemPedido.ONLINE);
        pedido.setValorTotal(90);

        servico.cancelar(pedido, TipoUsuario.CLIENTE);

//        pedido.marcarComoEntregue();
//        pedido.marcarComoEmitido();

//        pedido.setStatus(StatusPedido.EM_ANALISE);
//        pedido.cancelar();

//        System.out.println(pedido.getStatus());


//        System.out.println(pedido.getTempoEntregaEmHoras());

//        System.out.println(pedido.getStatus());
//        System.out.println(pedido.getOrigem());

//        System.out.println(StatusPedido.EMITIDO.ordinal());
//        System.out.println(StatusPedido.EMITIDO.name());

//        for (var value : StatusPedido.values()) {
//            System.out.printf("%d - %s%n", value.ordinal(), value.name());
//        }

//        String textoStatus = "CANCELADO";
//        StatusPedido status = StatusPedido.valueOf(textoStatus);
//        System.out.printf("%d - %s", status.ordinal(), status.name());

//        int numero = 1;
//        StatusPedido status = StatusPedido.values()[numero];
//        System.out.printf("%d - %s", status.ordinal(), status.name());
    }
}
