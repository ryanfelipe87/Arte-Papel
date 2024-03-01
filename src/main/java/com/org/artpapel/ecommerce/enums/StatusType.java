package com.org.artpapel.ecommerce.enums;

public enum StatusType {

    PENDING("PENDING"," O pagamento foi iniciado, mas ainda não foi concluído ou confirmado."),
    PROCESSING("PROCESSING", "O sistema está atualmente processando o pagamento."),
    CONCLUDED("CONCLUDED", "O pagamento foi bem-sucedido e concluído com sucesso."),
    FAILED("FAILED", " O pagamento não pôde ser concluído com sucesso por algum motivo."),
    CANCELED("CANCELED", "O pagamento foi cancelado pelo cliente ou pelo sistema antes da conclusão.");

    private final String status;
    private final String description;

    StatusType(String status, String description){
        this.status = status;
        this.description = description;
    }
}
