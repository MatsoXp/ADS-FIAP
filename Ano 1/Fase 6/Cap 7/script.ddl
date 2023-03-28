-- Generated by Oracle SQL Developer Data Modeler 21.4.2.059.0838
--   at:        2022-05-23 15:38:13 BRT
--   site:      Oracle Database 11g
--   type:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE t_cate_mov (
    cd_categoria         NUMBER(2) NOT NULL,
    t_tipo_mov_cd_tp_mov NUMBER(2) NOT NULL,
    ds_categoria         VARCHAR2(25) NOT NULL
);

CREATE UNIQUE INDEX t_categoria_movimentacao__idx ON
    t_cate_mov (
        t_tipo_mov_cd_tp_mov
    ASC );

ALTER TABLE t_cate_mov ADD CONSTRAINT t_cat_mov_pk PRIMARY KEY ( cd_categoria );

CREATE TABLE t_genero (
    cd_genero        NUMBER(2) NOT NULL,
    ds_genero        VARCHAR2(15) NOT NULL,
    t_usuario_cd_usu NUMBER(5) NOT NULL
);

ALTER TABLE t_genero ADD CONSTRAINT t_genero_pk PRIMARY KEY ( cd_genero,
                                                              t_usuario_cd_usu );

CREATE TABLE t_meta (
    cd_meta          NUMBER(2) NOT NULL,
    t_usuario_cd_usu NUMBER(5) NOT NULL,
    ds_meta          VARCHAR2(25)
);

ALTER TABLE t_meta ADD CONSTRAINT t_meta_pk PRIMARY KEY ( cd_meta );

CREATE TABLE t_meta_descricao (
    t_meta_cd_meta      NUMBER(2) NOT NULL,
    ds_complemento_meta VARCHAR2(100),
    ds_valor            VARCHAR2(12) NOT NULL,
    dt_data             DATE
);

ALTER TABLE t_meta_descricao ADD CONSTRAINT t_meta_descricao_pk PRIMARY KEY ( t_meta_cd_meta );

CREATE TABLE t_mov (
    cd_mov           NUMBER(5) NOT NULL,
    t_usuario_cd_usu NUMBER(5) NOT NULL,
    ds_valor         VARCHAR2(12) NOT NULL,
    dt_data          DATE NOT NULL
);

COMMENT ON COLUMN t_mov.cd_mov IS
    'identificador da movimentacao';

ALTER TABLE t_mov ADD CONSTRAINT t_mov_pk PRIMARY KEY ( cd_mov,
                                                        t_usuario_cd_usu );

CREATE TABLE t_obj_fin (
    cd_objetivo      NUMBER(2) NOT NULL,
    ds_objetivo      VARCHAR2(20) NOT NULL,
    t_usuario_cd_usu NUMBER(5) NOT NULL,
    cd_usu           NUMBER NOT NULL
);

CREATE UNIQUE INDEX t_objetivo_financeiro__idx ON
    t_obj_fin (
        t_usuario_cd_usu
    ASC );

ALTER TABLE t_obj_fin ADD CONSTRAINT t_obj_fin_pk PRIMARY KEY ( cd_objetivo );

CREATE TABLE t_tipo_mov (
    cd_tp_mov              NUMBER(2) NOT NULL,
    ds_tipo_movimentacao   NVARCHAR2(15) NOT NULL,
    t_mov_cd_mov           NUMBER(5) NOT NULL,
    t_mov_t_usuario_cd_usu NUMBER(5) NOT NULL,
    t_usuario_cd_usu       NUMBER NOT NULL
);

ALTER TABLE t_tipo_mov ADD CONSTRAINT t_tipo_movimentacao_pk PRIMARY KEY ( cd_tp_mov );

CREATE TABLE t_usuario (
    cd_usu        NUMBER(5) NOT NULL,
    ds_email      VARCHAR2(256) NOT NULL,
    ds_senha      VARCHAR2(30) NOT NULL,
    nm_usuario    VARCHAR2(80) NOT NULL,
    dt_nascimento DATE NOT NULL
);

COMMENT ON COLUMN t_usuario.cd_usu IS
    'c�digo do usu�rio';

ALTER TABLE t_usuario ADD CONSTRAINT t_usuario_pk PRIMARY KEY ( cd_usu );

ALTER TABLE t_cate_mov
    ADD CONSTRAINT t_cate_mov_t_tipo_mov_fk FOREIGN KEY ( t_tipo_mov_cd_tp_mov )
        REFERENCES t_tipo_mov ( cd_tp_mov );

ALTER TABLE t_genero
    ADD CONSTRAINT t_genero_t_usuario_fk FOREIGN KEY ( t_usuario_cd_usu )
        REFERENCES t_usuario ( cd_usu );

ALTER TABLE t_meta_descricao
    ADD CONSTRAINT t_meta_descricao_t_meta_fk FOREIGN KEY ( t_meta_cd_meta )
        REFERENCES t_meta ( cd_meta );

ALTER TABLE t_meta
    ADD CONSTRAINT t_meta_t_usuario_fk FOREIGN KEY ( t_usuario_cd_usu )
        REFERENCES t_usuario ( cd_usu );

ALTER TABLE t_mov
    ADD CONSTRAINT t_mov_t_usuario_fk FOREIGN KEY ( t_usuario_cd_usu )
        REFERENCES t_usuario ( cd_usu );

ALTER TABLE t_obj_fin
    ADD CONSTRAINT t_obj_fin_t_usuario_fk FOREIGN KEY ( t_usuario_cd_usu )
        REFERENCES t_usuario ( cd_usu );

ALTER TABLE t_tipo_mov
    ADD CONSTRAINT t_tipo_mov_t_mov_fk FOREIGN KEY ( t_mov_cd_mov,
                                                     t_mov_t_usuario_cd_usu )
        REFERENCES t_mov ( cd_mov,
                           t_usuario_cd_usu );



-- Oracle SQL Developer Data Modeler Summary Report: 
-- 
-- CREATE TABLE                             8
-- CREATE INDEX                             2
-- ALTER TABLE                             15
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0