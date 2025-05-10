CREATE DATABASE Gerenciar;
USE Gerenciar;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
insert into usuarios (email,senha) values('admin','123');

CREATE TABLE categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(255) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE produtos (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(255) NOT NULL,
    quantidade_produto INT NOT NULL,
    preco_produto double NOT NULL,
    descricao_produto VARCHAR(255),
    usuario_id INT,
    id_categoria INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (id_categoria) REFERENCES categorias(id_categoria)
);
select * from produtos;
select * from usuarios;
select * from categorias;

delete from categorias where id_categoria = 4;