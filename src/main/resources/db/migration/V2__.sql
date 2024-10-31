CREATE TABLE cargo
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    descricao VARCHAR(255),
    CONSTRAINT pk_cargo PRIMARY KEY (id)
);

CREATE TABLE evento
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    nome      VARCHAR(255),
    descricao VARCHAR(255),
    local     VARCHAR(255),
    online    BOOLEAN,
    data_hora TIMESTAMP WITHOUT TIME ZONE,
    tipo_id   BIGINT,
    CONSTRAINT pk_evento PRIMARY KEY (id)
);

CREATE TABLE participante_evento
(
    evento_id       BIGINT NOT NULL,
    participante_id BIGINT NOT NULL
);

CREATE TABLE tipo_evento
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    descricao VARCHAR(255),
    CONSTRAINT pk_tipoevento PRIMARY KEY (id)
);

CREATE TABLE usuario
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    nome        VARCHAR(255),
    email       VARCHAR(255),
    senha       VARCHAR(255),
    telefone    VARCHAR(255),
    aniversario date                                    NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (id)
);

CREATE TABLE usuario_cargo
(
    cargo_id   BIGINT NOT NULL,
    usuario_id BIGINT NOT NULL
);

ALTER TABLE usuario
    ADD CONSTRAINT uc_usuario_email UNIQUE (email);

ALTER TABLE evento
    ADD CONSTRAINT FK_EVENTO_ON_TIPO FOREIGN KEY (tipo_id) REFERENCES tipo_evento (id);

ALTER TABLE participante_evento
    ADD CONSTRAINT fk_pareve_on_evento FOREIGN KEY (evento_id) REFERENCES evento (id);

ALTER TABLE participante_evento
    ADD CONSTRAINT fk_pareve_on_usuario FOREIGN KEY (participante_id) REFERENCES usuario (id);

ALTER TABLE usuario_cargo
    ADD CONSTRAINT fk_usucar_on_cargo FOREIGN KEY (cargo_id) REFERENCES cargo (id);

ALTER TABLE usuario_cargo
    ADD CONSTRAINT fk_usucar_on_usuario FOREIGN KEY (usuario_id) REFERENCES usuario (id);