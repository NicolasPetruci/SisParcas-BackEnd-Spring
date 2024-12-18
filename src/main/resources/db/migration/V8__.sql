CREATE TABLE forum
(
    id           BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    titulo       VARCHAR(255),
    descricao    VARCHAR(255),
    data_criacao TIMESTAMP WITHOUT TIME ZONE,
    autor_id     BIGINT,
    CONSTRAINT pk_forum PRIMARY KEY (id)
);

CREATE TABLE forum_assunto
(
    id_forum     BIGINT NOT NULL,
    id_interesse BIGINT NOT NULL
);

CREATE TABLE forum_posts
(
    forum_id BIGINT NOT NULL,
    posts_id BIGINT NOT NULL
);

CREATE TABLE post
(
    id           BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    titulo       VARCHAR(255),
    texto        TEXT,
    data_criacao TIMESTAMP WITHOUT TIME ZONE,
    autor_id     BIGINT,
    post_pai_id  BIGINT,
    forum_id     BIGINT,
    CONSTRAINT pk_post PRIMARY KEY (id)
);

ALTER TABLE forum_posts
    ADD CONSTRAINT uc_forum_posts_posts UNIQUE (posts_id);

ALTER TABLE forum
    ADD CONSTRAINT FK_FORUM_ON_AUTOR FOREIGN KEY (autor_id) REFERENCES usuario (id);

ALTER TABLE post
    ADD CONSTRAINT FK_POST_ON_AUTOR FOREIGN KEY (autor_id) REFERENCES usuario (id);

ALTER TABLE post
    ADD CONSTRAINT FK_POST_ON_FORUM FOREIGN KEY (forum_id) REFERENCES forum (id);

ALTER TABLE post
    ADD CONSTRAINT FK_POST_ON_POSTPAI FOREIGN KEY (post_pai_id) REFERENCES post (id);

ALTER TABLE forum_assunto
    ADD CONSTRAINT fk_forass_on_forum FOREIGN KEY (id_forum) REFERENCES forum (id);

ALTER TABLE forum_assunto
    ADD CONSTRAINT fk_forass_on_interesse FOREIGN KEY (id_interesse) REFERENCES interesse (id);

ALTER TABLE forum_posts
    ADD CONSTRAINT fk_forpos_on_forum FOREIGN KEY (forum_id) REFERENCES forum (id);

ALTER TABLE forum_posts
    ADD CONSTRAINT fk_forpos_on_post FOREIGN KEY (posts_id) REFERENCES post (id);