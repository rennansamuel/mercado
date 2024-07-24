-- Criando o banco de dados
create database mercado;

-- Criando Tabelas
create table clientes (
	CPF varchar(12) primary key,
	nome_cliente varchar(100) not null,
	email_do_cliente varchar unique not null,
	telefone varchar(20)
);

create table produtos (
	produto_id serial primary key,
	nome_produto varchar(100) not null,
	preco decimal(10, 2) not null,
	categoria varchar (50),
	quantidade_estoque integer not null
);

create table pedidos (
 pedidos_id serial primary key,
 CPF varchar(12) references clientes(CPF),
 data timestamp default current_timestamp
);

create table venda_produto (
	id_venda_produto serial primary key,
	pedidos_id integer references pedidos(pedidos_id),
	produtos_id integer references produtos(produto_id)
);

-- Inserindo dados clientes
insert into clientes (CPF, nome_cliente, email_do_cliente, telefone)
	values(12558954775, 'Robson Teixeira', 'robson.teixeira@gmail.com', '(18) 99999-9999');

insert into clientes(CPF, nome_cliente, email_do_cliente, telefone)
	values(19087623450, 'Marcos Roberto', 'marcos.roberto@gmail.com', '(18) 99999-9990');

select *
	from clientes;

-- Inserindo dados produtos
insert into produtos (nome_produto, preco, categoria, quantidade_estoque)
	values('Notebook Acer', 2450.90, 'Informática', 5);

INSERT INTO produtos (nome_produto, preco, categoria, quantidade_estoque)
VALUES
    ('Smartphone Samsung Galaxy S20', 3499.00, 'Eletrônicos', 8),
    ('Fone de Ouvido Bluetooth JBL', 299.90, 'Eletrônicos', 15),
    ('Livro "Dom Quixote" de Miguel de Cervantes', 45.00, 'Livros', 20),
    ('Mochila Escolar Infantil', 89.99, 'Moda', 12),
    ('Panela de Pressão Elétrica', 189.00, 'Cozinha', 7),
    ('Camiseta Polo Masculina', 79.90, 'Moda', 30),
    ('Colchão Queen Size Ortobom', 1299.00, 'Casa e Decoração', 3),
    ('Jogo de Talheres Inox 24 peças', 149.90, 'Cozinha', 10),
    ('Impressora Multifuncional HP', 599.00, 'Informática', 6),
    ('Câmera Fotográfica Canon EOS', 1999.00, 'Eletrônicos', 4);


select *
	from venda_produto vp;

select *
	from pedidos p;

select *
	from produtos p;

-- Inserindo uma Venda
INSERT INTO pedidos (CPF, "data")
SELECT CPF, '2024-07-24 15:00:00'
FROM clientes
WHERE nome_cliente = 'Marcos Roberto';

INSERT INTO pedidos (CPF, "data")
SELECT CPF, '2024-07-23 12:00:00'
FROM clientes
WHERE nome_cliente = 'Marcos Roberto';

INSERT INTO pedidos (CPF, "data")
SELECT CPF, '2024-07-22 10:00:00'
FROM clientes
WHERE nome_cliente = 'Marcos Roberto';

insert into venda_produto (pedidos_id, produtos_id)
	values (10, 4);

FROM clientes
WHERE nome_cliente = 'Robson Teixeira';

-- Unindo tabelas
select c.CPF as "CPF_Cliente",
       c.nome_cliente as "Nome_Cliente",
       c.email_do_cliente  as "Email",
       ped.data as "Data_Pedido",
       pro.nome_produto as "Nome_Produto",
       pro.preco as "Preco",
       pro.categoria as "Categoria_Produto"
     from clientes c 
     join pedidos ped 
     on c.cpf = ped.cpf 
     join venda_produto vp 
     on ped.pedidos_id = vp.pedidos_id 
     join produtos pro 
     on vp.produtos_id = pro.produto_id
     order by ped.data;
     
   
   select * from pedidos p ; 
    
    
with t1 as (    
  select c.CPF as "CPF_/Cliente",
         c.nome_cliente as "Nome_Cliente",
         p.data as "Data_Pedido",
         c.email_do_cliente as "Email",
         p2.nome_produto as "Nome_Produto",
         p2.preco as "Preco",
         p2.categoria as "Categoria_Produto",
         p.pedidos_id as "ID_Pedido"
       from clientes c
       join pedidos p 
       on c.cpf = p.cpf
       join venda_produto vp
       on p.pedidos_id = vp.pedidos_id
       join produtos p2
       on vp.produtos_id = p2.produto_id     
)
select *
	from t1
	order by "Data_Pedido";


select *
	from produtos p;

update produtos
	set quantidade_estoque = quantidade_estoque - 1
	where produto_id in (select vp.produtos_id
	                     from venda_produto vp
	                     join)
	

UPDATE produtos p
set p.quantidade_estoque = (p.quantidade_estoque,1)
where p.produto_id = 1;


select *
	from produtos p;


WHERE produto_id IN (
    SELECT vp.produtos_id
    FROM venda_produto vp
    WHERE vp.pedidos_id = ?  

    
    
    update produtos
    set quantidade_estoque  = (quantidade_estoque-1)
    where produto_id = 8);    
   
 
 create or replace function atualizar_estoque()
 return trigger  $$ 
 
 begin 
	update produtos
    set quantidade_estoque  = (quantidade_estoque-1)
    where produto_id = new.produto_id;  
  return new;
end;
$$ language plpgsql;

create trigger atualizar_estoque()
after insert on venda_produto
for each row 
execute function atualizar_estoque()

 
 
      
      
      
      
      
      
      
      
      
      
      
      
