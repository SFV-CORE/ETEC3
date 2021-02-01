
IF NOT EXISTS (SELECT * FROM sys.databases WHERE name = N'loja')
    BEGIN
        CREATE DATABASE [loja]
    END;
GO

USE [loja]
GO

----Rodar tudo junto-----

IF object_id('dbo.Cliente') IS NULL
    BEGIN
        CREATE TABLE dbo.Cliente
        (
            cod_clie INT IDENTITY  CONSTRAINT clie_cod_pk PRIMARY KEY,
            nome_clie VARCHAR(120) CONSTRAINT clie_nm_nn NOT NULL,
            cep VARCHAR(12) CONSTRAINT clie_cep_nn NOT NULL,
            cnpj VARCHAR(21) CONSTRAINT clie_doc_nn NOT NULL UNIQUE(cnpj),
            cidade VARCHAR(40) CONSTRAINT clie_city_nn NOT NULL,
			uf CHAR(2) CONSTRAINT clie_uf_nn NOT NULL,
            endereco VARCHAR(120) CONSTRAINT clie_end_nn NOT NULL,
			ativo TINYINT CONSTRAINT clie_ativo_nn NOT NULL
        )
    END;
GO

IF object_id('dbo.Vendedor') IS NULL
    BEGIN
        CREATE TABLE dbo.Vendedor
        (
            cod_ven INT IDENTITY CONSTRAINT vend_cod_pk PRIMARY KEY,
            nome_ven VARCHAR(120) CONSTRAINT vend_nm_nn NOT NULL,
            sal_fixo NUMERIC(10,2) CONSTRAINT vend_sal_nn NOT NULL,
            comissao NUMERIC(10,2) CONSTRAINT vend_comi_nn NOT NULL,
			ativo TINYINT CONSTRAINT vend_ativo_nn NOT NULL
        )
    END;
GO

IF object_id('dbo.Produto') IS NULL
    BEGIN
        CREATE TABLE dbo.Produto
        (
            cod_prod NUMERIC(7) CONSTRAINT prod_cod_pk PRIMARY KEY,
            nome_prod VARCHAR(120) CONSTRAINT prod_nm_nn NOT NULL,
            descricao VARCHAR(240) CONSTRAINT prod_desc_nn NOT NULL,
            val_unit NUMERIC(8,2) CONSTRAINT prod_val_nn NOT NULL,
            unidade NUMERIC(8) CONSTRAINT prod_uni_nn NOT NULL,
			ativo TINYINT CONSTRAINT prod_ativo_nn NOT NULL
        )
    END;
GO

IF object_id('dbo.Pedido') IS NULL
    BEGIN
        CREATE TABLE dbo.Pedido
        (
            cod_ped NUMERIC(10) CONSTRAINT ped_cod_pk PRIMARY KEY,
			dt_emissao DATE,
            pr_entrega DATE,
			valor_total NUMERIC(8,2) CONSTRAINT ped_val_nn NOT NULL,
			cod_ven_fk INT REFERENCES dbo.Vendedor,
			cnpj_fk VARCHAR(21)
        )
    END;
GO

IF object_id('dbo.Item_Pedido') IS NULL
    BEGIN
        CREATE TABLE dbo.Item_Pedido
        (
            quant NUMERIC IDENTITY CONSTRAINT iped_qtd_nn NOT NULL,
            cod_prod NUMERIC(7) REFERENCES dbo.Produto,
            cod_ped NUMERiC(10) REFERENCES dbo.Pedido
        )
    END;
GO

IF object_id('dbo.Usuario') IS NULL
    BEGIN
        CREATE TABLE dbo.Usuario
        (
            cod_user NUMERIC(10) CONSTRAINT user_id_pk PRIMARY KEY,
            nome_user VARCHAR(120) CONSTRAINT user_nm_nn NOT NULL,
            senha VARCHAR(120) CONSTRAINT user_pass_nn NOT NULL ,
			adm TINYINT CONSTRAINT user_adm_nn NOT NULL,
			cod_ven_fk INT REFERENCES dbo.Vendedor
        )
    END;
GO
--------------------
--Clientes

INSERT INTO Cliente(nome_clie, cep, cnpj, cidade, uf, endereco, ativo) 
	VALUES('Anderson Utilidades', '13141-313', '45.165.841/6516-58', 'São Paulo', 'SP', 'Av. Paulista 1200', 1)
INSERT INTO Cliente(nome_clie, cep, cnpj, cidade, uf, endereco, ativo)
	VALUES('Helios SA', '51551-688', '45.190.887/2056-69', 'Pernambuco', 'PE', 'Rua João Tavares, 20', 1)

--Vendedores

INSERT INTO Vendedor 
	VALUES('Admin', 5000, 0, 1) 
INSERT INTO Vendedor 
	VALUES('Julia', 1800, 10, 1) 
INSERT INTO Vendedor 
	VALUES('Lucas', 1200, 20, 1)

--Produtos
	
INSERT INTO Produto(cod_prod, nome_prod, descricao, val_unit, unidade, ativo)
	VALUES(1, 'TumpWare','Vermelha, tamanho medio', 40, 50, 1)
INSERT INTO Produto(cod_prod, nome_prod, descricao, val_unit, unidade, ativo)
	VALUES(2, 'Assadera','Vermelha, 6 camadas anti-aderente, grande ', 50, 70, 1)
INSERT INTO Produto(cod_prod, nome_prod, descricao, val_unit, unidade, ativo)
	VALUES(3, 'Rodo','Cabo verde, borracha preta, 1m de cabo ', 10, 20, 1)

--Pedidos

INSERT INTO Pedido(cod_ped, dt_emissao, pr_entrega, valor_total, cod_ven_fk, cnpj_fk)
	VALUES(1, '12-01-2020', '12-03-2020', 500, 2, '45.190.887/2056-69')
INSERT INTO Pedido(cod_ped, dt_emissao, pr_entrega, valor_total, cod_ven_fk, cnpj_fk)
	VALUES(2, '20-02-2020', '12-05-2020', 130, 3, '45.165.841/6516-58')

--Item_pedido

SET IDENTITY_INSERT dbo.Item_Pedido  ON
INSERT INTO Item_Pedido(quant, cod_prod, cod_ped) 
	values(13, 3, 2)
INSERT INTO Item_Pedido(quant, cod_prod, cod_ped) 
	values(10, 2, 1)

--Usuarios

INSERT INTO Usuario 
	VALUES(1, 'adm', 'adm', 1, 1)
INSERT INTO Usuario 
	VALUES(2, 'Julia', '123456789', 0, 2)
INSERT INTO Usuario 
	VALUES(3, 'Lucx', 'test123', 0, 3)
	

select * from Cliente
select * from Produto
select * from Pedido
select * from Item_Pedido  
select * from Vendedor   
select * from Usuario 

