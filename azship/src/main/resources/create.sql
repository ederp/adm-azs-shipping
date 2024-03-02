CREATE TABLE frete (
    id INT PRIMARY KEY AUTO_INCREMENT,
    local_origem VARCHAR(255),
    local_destino VARCHAR(255),
    tipo_carga VARCHAR(100),
    peso_carga NUMERIC,
    cubagem_carga NUMERIC,
    data_coleta DATE,
    data_entrega DATE,
    valor_frete DECIMAL(6,2),
    status_frete VARCHAR(100),
    meio_transporte VARCHAR(100),
    condicoes_especiais VARCHAR(255)
);