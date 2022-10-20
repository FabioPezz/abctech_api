create table assistances
(
    id          bigint auto_increment
        primary key,
    description varchar(300) not null,
    name        varchar(100) not null
);

INSERT INTO assistances (name, description) VALUES ('Troca de aparelho', 'Troca de aparelho decodificador de sinal');
INSERT INTO assistances (name, description) VALUES ('Troca de cabo interno', 'Troca de cabo interno');
INSERT INTO assistances (name, description) VALUES ('Troca de fiação interna', 'Substituição de fiação interna da residência');
INSERT INTO assistances (name, description) VALUES ('Manutenção em fogão', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em geladeira', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção de veiculo carro', 'Reparo com compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção de veículo moto', 'Reparo com compra de peças');
INSERT INTO assistances (name, description) VALUES ('Manutenção em rede de esgoto', 'Manutenção em rede de esgoto');
INSERT INTO assistances (name, description) VALUES ('Compra de itens para rede de esgoto', 'Compra de itens para rede de esgoto');
INSERT INTO assistances (name, description) VALUES ('Substituição de gás', 'Substituição de botijão de gás');
INSERT INTO assistances (name, description) VALUES ('Troca de Fiação telefonica', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances (name, description) VALUES ('Substituição de cabo de energia', 'Substituição de cabo de energia eletrica');
INSERT INTO assistances (name, description) VALUES ('Manutenção em aparelhos eletricos', 'Manutenção em tomadas e aparelhos eletricos');
INSERT INTO assistances (name, description) VALUES ('Troca de chuveiro', 'Troca de chuveiro');
INSERT INTO assistances (name, description) VALUES ('Manutenção em Jardim', 'Manutenção em Jardim');
INSERT INTO assistances (name, description) VALUES ('Troca de torneira', 'Substituição de torneira');
INSERT INTO assistances (name, description) VALUES ('Frete para menos de 20km com van', 'Frete para menos de 20km com pickup');
INSERT INTO assistances (name, description) VALUES ('Frete para mais de 20km com van', 'Frete para mais de 20km com pickup');
INSERT INTO assistances (name, description) VALUES ('Frete para menos de 20km com caminhão', 'Frete para menos de 20km com caminhão');
INSERT INTO assistances (name, description) VALUES ('Frete para mais de 20km com caminhão', 'Frete para mais de 20km com caminhão');