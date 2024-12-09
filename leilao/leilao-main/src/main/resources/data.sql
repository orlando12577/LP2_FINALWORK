insert into usr_usuario (usr_cpf,usr_nome, usr_email, usr_telefone)
    values ('22233344455', 'Valdiney', 'valdiney@meu.email', '12999887755');
insert into usr_usuario (usr_cpf,usr_nome, usr_email, usr_telefone)
    values ('33344455566', 'Gilberto', 'gilberto@meu.email', '12988775544');
insert into end_endereco (end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento, end_usr_id) 
    values ('SP', 'Sao Jose dos Campos', 'Cidade Morumbi', 'Rua Sete', 70,'Bloco 2, Apartamento 707',1);
insert into end_endereco (end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento, end_usr_id) 
    values ('SP', 'Sao Jose dos Campos', 'Parque Industrial', 'Praça Natal', 60,'Bloco 1, Apartamento 770',2);
insert into fin_financeira (fin_cnpj,fin_nome, fin_razao_social, fin_email, fin_telefone)
    values ('22233344455000', 'ValdineyInveste', 'Financeira Leal do Brasil SA', 'valdiney@investe.email', '12999887755');
insert into fin_financeira (fin_cnpj,fin_nome, fin_razao_social, fin_email, fin_telefone)
    values ('33344455566000', 'GilbertoInvest', 'Financeira Nº1 do Brasil SA', 'gilberto@invest.email', '12988775544');
insert into lei_leilao (lei_data_hora, lei_data_visitacao, lei_descricao, lei_status, lei_fin_id)
    values ('2023-12-29T09:27:39', '2023-11-27', 'Este lei é um teste', 'EM_ABERTO',2);
insert into lei_leilao (lei_data_hora, lei_data_visitacao, lei_descricao, lei_status, lei_fin_id)
    values ('2024-01-25T09:00:00', '2023-12-01', 'Este lei é um teste também', 'EM_ABERTO',2);
--insert into lot_lote (lot_lance, lot_valor_inicial, lot_lei_id)
--    values (1500.00, 1300.00, 1);
--insert into lot_lote (lot_lance, lot_valor_inicial, lot_lei_id)
--    values (9000.00, 7500.00, 1);
insert into itm_item (tipo_item, itm_nome, itm_valor_inicial, itm_lei_id)
    values ('NOTEBOOK', 'Notebook', 1300.00, 1);
insert into itm_item (tipo_item, itm_nome, vei_marca, vei_modelo, itm_valor_inicial, itm_lei_id)
    values ('CARRO', 'Corsa', 'GM', '96/97', 9000.00, 1);