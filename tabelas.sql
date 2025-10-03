CREATE TABLE Cliente (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE Funcionario (
    id_funcionario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(50),
    salario DECIMAL(10,2)
);

CREATE TABLE Mesa (
    id_mesa INT PRIMARY KEY AUTO_INCREMENT,
    numero INT NOT NULL,
    capacidade INT
);

CREATE TABLE Pedido (
    id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    data DATETIME NOT NULL,
    valor_total DECIMAL(10,2),
    id_cliente INT,
    id_funcionario INT,
    id_mesa INT,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente),
    FOREIGN KEY (id_funcionario) REFERENCES Funcionario(id_funcionario),
    FOREIGN KEY (id_mesa) REFERENCES Mesa(id_mesa)
);

CREATE TABLE Prato (
    id_prato INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    preco DECIMAL(10,2)
);

CREATE TABLE ItemPedido (
    id_item INT PRIMARY KEY AUTO_INCREMENT,
    quantidade INT NOT NULL,
    id_pedido INT,
    id_prato INT,
    FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido),
    FOREIGN KEY (id_prato) REFERENCES Prato(id_prato)
);

CREATE TABLE Pagamento (
    id_pagamento INT PRIMARY KEY AUTO_INCREMENT,
    valor DECIMAL(10,2) NOT NULL,
    forma_pagamento VARCHAR(50),
    id_pedido INT UNIQUE,
    FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido)
);
