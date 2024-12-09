insert into usr_usuario (usr_cpf, usr_nome, usr_email, usr_telefone)
    values ('44556677889', 'Carlos', 'carlos@meu.email', '11987654321');
insert into usr_usuario (usr_cpf, usr_nome, usr_email, usr_telefone)
    values ('55667788990', 'Fernanda', 'fernanda@meu.email', '11976543210');
insert into end_endereco (end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento, end_usr_id)
    values ('RJ', 'Rio de Janeiro', 'Copacabana', 'Avenida Atlântica', 150, 'Apartamento 304', 1);
insert into end_endereco (end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento, end_usr_id)
    values ('RJ', 'Rio de Janeiro', 'Ipanema', 'Rua Visconde de Pirajá', 220, 'Apartamento 801', 2);
insert into fin_financeira (fin_cnpj, fin_nome, fin_razao_social, fin_email, fin_telefone)
    values ('44556677889000', 'CarlosInvest', 'Financeira Silva e Cia SA', 'carlos@invest.email', '11987654321');
insert into fin_financeira (fin_cnpj, fin_nome, fin_razao_social, fin_email, fin_telefone)
    values ('55667788990000', 'FernandaFinances', 'Financeira Primeira do Brasil SA', 'fernanda@finances.email', '11976543210');
insert into lei_leilao (lei_data_hora, lei_data_visitacao, lei_descricao, lei_status, lei_fin_id)
    values ('2024-02-15T14:30:00', '2024-01-05', 'Leilão teste do Carlos', 'EM_ABERTO', 2);
insert into lei_leilao (lei_data_hora, lei_data_visitacao, lei_descricao, lei_status, lei_fin_id)
    values ('2024-03-10T10:00:00', '2024-02-01', 'Leilão teste da Fernanda', 'EM_ABERTO', 2);
--insert into lot_lote (lot_lance, lot_valor_inicial, lot_lei_id)
--    values (1600.00, 1400.00, 1);
--insert into lot_lote (lot_lance, lot_valor_inicial, lot_lei_id)
--    values (9500.00, 8000.00, 1);
insert into itm_item (tipo_item, itm_nome, itm_valor_inicial, itm_lei_id)
    values ('LIVRO', 'Livro de História', 500.00, 1);
insert into itm_item (tipo_item, itm_nome, vei_marca, vei_modelo, itm_valor_inicial, itm_lei_id)
    values ('MOTO', 'CB 500', 'Honda', '2020', 12000.00, 1);






