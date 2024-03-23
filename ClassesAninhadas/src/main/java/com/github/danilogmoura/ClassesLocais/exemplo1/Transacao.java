package com.github.danilogmoura.ClassesLocais.exemplo1;

import java.math.BigDecimal;

public interface Transacao {

    BigDecimal getValorTotal();

    void reembolsar();
}
