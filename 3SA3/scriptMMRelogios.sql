create database MMRelogios;

use MMRelogios;

create table Identificacao(
	email varchar(100),
    senha varchar(100),
	primary key (email, senha)
);

select * from Identificacao;

alter table Identificacao
	modify email varchar(100) not null,
    modify senha varchar(100) not null;
    
alter table Identificacao
	modify email varchar(100) not null unique;

create table Cadastro(
	cpf numeric(11),
    nome varchar(100) not null,
	primary key(cpf)
);

alter table Cadastro
	modify cpf numeric(11)not null unique;   

select * from Cadastro;

create table Endereco(
	cep numeric(8),
    codigoPostal varchar(50),
    complemnto varchar(50),
    endereco varchar(50),
	primary key(cep)
);

alter table Endereco
	modify endereco varchar(50)not null;
    
alter table Endereco
	modify cep numeric(8) unique;   

select * from Endereco;

create table Cookie(
	idSessao int,
    hisricoPesquisa varchar(50),
    primary key(idSessao)
);

alter table Cookie
	modify hisricoPesquisa varchar(50)not null;

select * from Cookie;

create table Transportadora(
	idTransportadora int,
    freteValor varchar(25) not null,
    destino varchar(25) not null,
    origem varchar(25) not null,
    nome varchar(25) not null,
    dataC datetime not null,
    statusEnvio varchar(25) not null,
    tipoCarga text(25) not null,
    pesoCarga varchar(25) not null,
    volume varchar(25) not null,
	primary key(idTransportadora, statusEnvio)
);

select * from Transportadora;

create table Administrador(
	numeroRH int primary key
);

select * from Administrador;

create table Relogio(
	codigoRelogio double,
    bateria varchar(25) not null,
    tipoBisel varchar(25) not null,
    numeroSerie varchar(25) not null,
    materialCorreia varchar(25) not null,
    tipoFecho varchar(25) not null,
    materialMostrador varchar(25) not null,
    corMostrador varchar(25) not null,
    mostradorHorario varchar(25)  not null,
    marca varchar(25) not null,
    modelo varchar(25) not null,
    resistenciaAgus boolean,
    cronometro boolean,
    alarme boolean,
    quantidade int not null,
    primary key(codigoRelogio, quantidade)
);


select * from Relogio;

create table DadosCartao(
	idDadosCartao int primary key,
    numeroCartao int not null,
    nomeCartao varchar(25) not null,
    cvv char(3) not null,
    dataValidade date not null
);

alter table Relogio
	add CONSTRAINT FkidFC foreign key (codigoRelogio) references FinalizarCompra(idFC);

select * from DadosCartao;

create table Pagamento(
	idPagamento int primary key,
    valor double not null,
    pix varchar(50),
    boleto varchar(50),
    dataPagamento datetime,
    statusP varchar(25) not null,
    notaFiscla varchar(100) not null,
    foreign key (idPagamento) references DadosCartao(idDadosCartao)
);

alter table Pagamento
	add idDadosCartao int;

select * from Pagamento;

alter table Pagamento
CHANGE notaFiscla notaFiscal varchar(100) not null;

alter table Pagamento
	add CONSTRAINT fkidDC foreign key (idDadosCartao) references DadosCartao(idDadosCartao);

create table FinalizarCompra(
	idFC int,
	metodoPagamento varchar(50),
    codigoRelogio double,
    transporte int not null,
    quantidade int not null,
	statusEnvio varchar(25) not null
);
    
alter table FinalizarCompra
    add CONSTRAINT FkidT foreign key (transporte, statusEnvio) references Transportadora(idTransportadora, statusEnvio);
    
alter table FinalizarCompra
    add CONSTRAINT FkidR foreign key (codigoRelogio,quantidade) references Relogio(codigoRelogio, quantidade);
    
alter table FinalizarCompra
	add primary key(idFC);
    
alter table FinalizarCompra
	add carrinhoCompras varchar(50) not null;
    
alter table FinalizarCompra
    add foreign key (carrinhoCompras) references Usuario(carrinhoCompras);
    
select * from FinalizarCompra;

create table Usuario(
	idUsuario int unique,
    login text(100) not null,
    carrinhoCompras varchar(50) not null,
    endereco numeric(8),
	primary key(carrinhoCompras),
    CONSTRAINT FkidE foreign key (endereco) references Endereco(cep)
);

select * from Usuario;
    

    
    


    


    

    






    
    

    
    
    
    
    







	

    

    
    