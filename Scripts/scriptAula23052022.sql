-- criando o BD da aula
-- Create Database aula230522;
-- acessando o Banco de Dados 
use aula230522;
-- criando as tabelas projeto e funcionario
create table funcionario(
	idfunc 	int primary key,
    nomef	varchar(100)
    );
 create table projeto (
	idproj	int,
    nomep	varchar(30),
    Primary Key (idproj)
);

/* 
Criando a tabela de relacionamento com 
chave primária composta pelos atributos
idfunc, idproj dtalocacao

Obs: Pode-se criar uma chave primária 
composta por três ou mais atributos, desde
que haja cuidado na inserção dos dados, pois 
aumenta a complexidade

*/
create table alocado (
	idprojfkpk		int,
	idfuncfkpk		int,
	dtalocacao 		date,
    primary key (idprojfkpk, idfuncfkpk, dtalocacao),
    foreign key (idprojfkpk) references projeto(idproj),
    foreign key (idfuncfkpk) references funcionario(idfunc)
);

-- Alter table para adicionar uma nova colunPRIMARYa
alter table funcionario
	add cpf numeric(11) not null unique
-- not null campo de preenchimento obrigatório
-- unique campo único a propriedade unique equivale a chave primária no exemplo foi definido o cpf como chave candidata
 
-- alter table para adicionar cpf a tabela alocado   
alter table alocado
	add cpfa numeric(11);
-- Alter table para adicionar restrição 
-- de chave estrangeira a tabela alocado
-- com um atributo único-unique
alter table alocado
	add constraint fkcpfa
    foreign key (cpfa) references funcionario(cpf);
    
-- criando uma tabela de autorrelacionamento    
create table pessoa(
idp 	 int primary key,
nome 	 varchar(100),
idcasada int,
foreign key (idcasada) references pessoa(idp)
); 
-- alter table para adicionar o cpfchefe a tabela funcionario
alter table funcionario
	add cpfchefe numeric(11);
-- alter table para criar o autorrelacionamento cpfchefia
alter table funcionario
	add constraint chefefk foreign key (cpfchefe) references funcionario(cpf); 

-- criando autorrelacionamento N - N Disciplina pré requisito
create table disciplina (
	coddisc int,
    nomedisc varchar(50),
    CONSTRAINT pkcoddisciplina primary key(coddisc)
);

-- criando a tabela do autorrelacionamento N-N
create table PreRequisito (
	coddiscpre 	int,
    coddiscreq	int,
    CONSTRAINT pkprereq primary key(coddiscpre, coddiscreq),
    CONSTRAINT fkcoddiscpre foreign key (coddiscpre) references disciplina(coddisc),
    CONSTRAINT fkcoddiscreq foreign key (coddiscreq) references disciplina(coddisc)
);

-- criando a tabela conhecimento slide 11
create table conhecimento (
	idconhece int,
    nomeconhece varchar(150)
);
-- ALTER TABLE PARA CRIAR CHAVE PRIMÁRIA
ALTER TABLE CONHECIMENTO
	add constraint pkconhece primary key(idconhece) 
-- alter table para adicionar +1 atributo chave na tabela alocado
-- 1º adicionar o campo conhecimento
alter table alocado
	add idconhece int not null;

-- alter table para modificar um atributo
alter table alocado
	MODIFY idconhece int not null UNIQUE;

-- adicionar como chave primária e estrangeira da tabela alocado
-- 2 adicionar relacionamento de chave estrangeira
alter table alocado
	add constraint fkidconhece foreign key (idconhece) references alocado(idconhece);

-- adicionar idconhece à chave composta de alocado
/*alter table alocado 
	Modify constraint addidconhecepkfk primary key (idprojfkpk, idfuncfkpk, dtalocacao, idconhece)
*/
-- criando a tabela alocado2 só para compor a chave primária composta
create table alocado2(
	idprojfkpk		int,
	idfuncfkpk		int,
	dtalocacao 		date,
    idconhecefk 	int,
    primary key (idprojfkpk, idfuncfkpk, dtalocacao, idconhecefk),
    foreign key (idprojfkpk) references projeto(idproj),
    foreign key (idfuncfkpk) references funcionario(idfunc),
    foreign key (idconhecefk) references conhecimento(idconhece)
);

--
create table engenheiro (
	idfunce int primary key,
    especialidade varchar(30),
    AjudaDeCusto numeric(7,2),
    Foreign key(idfunce) references(idfunc)
);

create table secretaria(
	idfuncs int,
    idioma varchar(30),
    curso varchar(30),
    primary key (idfuncs),
    foreign key (idfuncs) references funcinario(idfunc)
);

create table motorista (
	idfuncm int,
    cnh numeric(16),
    CONSTRAINT pkfkiidfuncm primary key (idfuncm),
    CONSTRAINT Fkpkidfuncm foreign key (idfuncm) references funcinario(idfunc)
);
    