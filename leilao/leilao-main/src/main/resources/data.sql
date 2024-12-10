-- Inserções na tabela usr_usuario
INSERT INTO usr_usuario (usr_cpf, usr_nome, usr_email, usr_telefone)
VALUES ('22233344455', 'Orlando', 'Orlando@meu.email', '12999887755');

INSERT INTO usr_usuario (usr_cpf, usr_nome, usr_email, usr_telefone)
VALUES ('33344455566', 'Gilmar', 'gilmar@meu.email', '12988775544');

-- Inserções na tabela end_endereco
INSERT INTO end_endereco (end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento, end_usr_id)
VALUES ('SP', 'Sao Jose dos Campos', 'Cidade Morumbi', 'Rua Sete', 70, 'Bloco 2, Apartamento 707', 1);

INSERT INTO end_endereco (end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento, end_usr_id)
VALUES ('SP', 'Sao Jose dos Campos', 'Parque Industrial', 'Praça Natal', 60, 'Bloco 1, Apartamento 770', 2);

-- Inserções na tabela fin_financeira
INSERT INTO fin_financeira (fin_cnpj, fin_nome, fin_razao_social, fin_email, fin_telefone)
VALUES ('22233344455000', 'OrlandoInveste', 'Financeira Leal do Brasil SA', 'Orlando@investe.email', '12999887755');

INSERT INTO fin_financeira (fin_cnpj, fin_nome, fin_razao_social, fin_email, fin_telefone)
VALUES ('33344455566000', 'GilmarInvest', 'Financeira Nº1 do Brasil SA', 'gilmar@invest.email', '12988775544');

-- Inserção com data atual (2024-12-10) e hora atual
INSERT INTO lei_leilao (lei_data_hora, lei_data_visitacao, lei_descricao, lei_status, lei_fin_id)
VALUES ('2024-12-15T14:35:00', '2024-12-05', 'Este é um teste com data mais atual', 'EM_ABERTO', 1);

-- Outra inserção com data e hora atuais, mas em um horário diferente
INSERT INTO lei_leilao (lei_data_hora, lei_data_visitacao, lei_descricao, lei_status, lei_fin_id)
VALUES ('2024-12-15T15:00:00', '2024-12-01', 'Outro teste com data recente', 'EM_ABERTO', 1);

-- Inserções na tabela itm_item
INSERT INTO itm_item (tipo_item, itm_nome, itm_valor_inicial, itm_lei_id)
VALUES ('NOTEBOOK', 'Notebook', 1300.00, 1);

-- Supondo que 'vei_marca' e 'vei_modelo' são colunas opcionais ou presentes na tabela itm_item
INSERT INTO itm_item (tipo_item, itm_nome, vei_marca, vei_modelo, itm_valor_inicial, itm_lei_id)
VALUES ('CARRO', 'Corsa', 'GM', '96/97', 9000.00, 1);

-- Lance de 1500 no item com id 1 e usuário com id 1
INSERT INTO lan_lance (lan_valor, lan_data_hora, lan_itm_id, lan_usr_id)
VALUES (1500.00, '2024-12-10 14:30:00', 1, 1);

-- Lance de 9500 no item com id 2 e usuário com id 2
INSERT INTO lan_lance (lan_valor, lan_data_hora, lan_itm_id, lan_usr_id)
VALUES (9500.00, '2024-12-10 14:30:00', 2, 2);



