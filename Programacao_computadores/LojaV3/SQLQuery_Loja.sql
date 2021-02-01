
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
        CREATE TABLE [dbo.Cliente]
        (
            cod_clie INT IDENTITY  CONSTRAINT clie_cod_pk PRIMARY KEY,
            nome_clie VARCHAR(120) CONSTRAINT clie_nm_nn NOT NULL,
            cep NUMERIC(8) CONSTRAINT clie_cep_nn NOT NULL,
            cnpj NUMERIC(14) CONSTRAINT clie_cnpj_nn NOT NULL,
            cidade VARCHAR(40) CONSTRAINT clie_city_nn NOT NULL,
            endereco VARCHAR(120) CONSTRAINT clie_end_nn NOT NULL
        )
    END;
GO

IF object_id('dbo.Vendedor') IS NULL
    BEGIN
        CREATE TABLE [dbo.Vendedor]
        (
            cod_ven INT IDENTITY CONSTRAINT vend_cod_pk PRIMARY KEY,
            nome_ven VARCHAR(120) CONSTRAINT vend_nm_nn NOT NULL,
            salario_fixo NUMERIC(10,2) CONSTRAINT vend_sal_nn NOT NULL,
            comissao NUMERIC(10,2) CONSTRAINT vend_comi_nn NOT NULL
        )
    END;
GO

IF object_id('dbo.Produto') IS NULL
    BEGIN
        CREATE TABLE [dbo.Produto]
        (
            cod_prod INT IDENTITY CONSTRAINT prod_cod_pk PRIMARY KEY,
            descricao VARCHAR(240) CONSTRAINT prod_desc_nn NOT NULL,
            val_unit NUMERIC(8,2) CONSTRAINT prod_val_nn NOT NULL,
            unidade NUMERIC(8) CONSTRAINT prod_uni_nn NOT NULL
        )
    END;
GO

IF object_id('dbo.Pedido') IS NULL
    BEGIN
        CREATE TABLE [dbo.Pedido]
        (
            num_pedido INT IDENTITY CONSTRAINT ped_num_pk PRIMARY KEY,
            pr_entrega DATE,
            cod_clie INT 
                CONSTRAINT ped_codClie_fk FOREIGN KEY
				REFERENCES [dbo.Cliente]
        )
    END;
GO

IF object_id('dbo.Item_Pedido') IS NULL
    BEGIN
        CREATE TABLE [dbo.Item_Pedido]
        (
            quant INT IDENTITY CONSTRAINT iped_qtd_nn NOT NULL,
            cod_prod INT REFERENCES Produto,
            num_pedido INT REFERENCES Pedido
        )
    END;
GO

IF object_id('dbo.Usuario') IS NULL
    BEGIN
        CREATE TABLE dbo.Usuario
        (
            id_user INT IDENTITY CONSTRAINT user_id_pk PRIMARY KEY,
            nm_user VARCHAR(120) CONSTRAINT user_nm_nn NOT NULL,
            senha VARCHAR(120) CONSTRAINT user_pass_nn NOT NULL 
        )
    END;
GO
--------------------
