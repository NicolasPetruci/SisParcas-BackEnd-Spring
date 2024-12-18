CREATE TABLE interesse
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    descricao VARCHAR(255),
    tipo_id   BIGINT,
    CONSTRAINT pk_interesse PRIMARY KEY (id)
);

CREATE TABLE tipo_interesse
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    descricao VARCHAR(255),
    CONSTRAINT pk_tipointeresse PRIMARY KEY (id)
);

CREATE TABLE usuario_interesse
(
    id_interesse BIGINT NOT NULL,
    id_usuario   BIGINT NOT NULL
);

ALTER TABLE interesse
    ADD CONSTRAINT FK_INTERESSE_ON_TIPO FOREIGN KEY (tipo_id) REFERENCES tipo_interesse (id);

ALTER TABLE usuario_interesse
    ADD CONSTRAINT fk_usuint_on_interesse FOREIGN KEY (id_interesse) REFERENCES interesse (id);

ALTER TABLE usuario_interesse
    ADD CONSTRAINT fk_usuint_on_usuario FOREIGN KEY (id_usuario) REFERENCES usuario (id);