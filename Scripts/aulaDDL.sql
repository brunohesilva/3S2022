create database aulaDDL;

use aulaDDL;

create table Funcionario (
	idFunc int primary key,
    nomeFunc varchar(100)
);

create table Departamento (
	idDep int,
    nomeDep varchar(30),
    idFuncC int,
    primary key(idDep),
    foreign key(idFuncC) references Funcionario(idFunc)
);

create table Pessoa (
	idPes int,
    nome varchar(100),
    idCasada int,
    constraint pkPessoa primary key(idPes),
    constraint fkCasada foreign key(idCasada) references Pessoa(idPes)
);

create table Departamento2 (
	idDep int,
    nomeDep varchar(30),
    idFuncC int,
    primary key(idDep)
);

create table Funcionario2 (
	idFunc int primary key,
    nomeFunc varchar(100)
);

alter table Departamento2 
	add constraint fkFunDep 
    foreign key (idFuncC) references Funcionario2(idFunc) 
    
alter table Funcionario2
	add cpf numeric(11)
    
alter table Funcionario2
	add idFuncS int
    
alter table Funcionario2
	add constraint fkFSupervisao
    foreign key (idFuncS) references Funcionario2(idFunc)
    
create table Projeto (
	idProj int primary key,
    nomeProj varchar(30)
);

create table Alocado (
	codProja int,
    codFunca int,
    dtaLocacao date,
    constraint PkAlocacao primary key (codProja, codFunca, dtaLocacao),
    constraint FkProjA foreign key (codProja) references Projeto(idProj),
    constraint FkFuncA foreign key (codFunca) references Funcionario (idFunc)
);

create table Disciplina (
	idDisc int primary key, 
    nomeD varchar(30)
);

create table Precisa (
	idDiscR int,
    idDiscREq int,
    primary key (idDiscR, idDiscREq),
    foreign key (idDiscR) references Disciplina(idDisc),
    foreign key (idDiscREq) references Disciplina(idDisc)
);

create table Engenheiro (
	idFuncE int,
    esp varchar(20)not null,
    primary key (idFuncE),
    foreign key (idFuncE) references Funcionario(idFunc)
);

create table Motorista (
	idFuncM int primary key,
    cnh numeric(16),
    foreign key (idFuncM) references Funcionario (idFunc)
);

create table Secretaria (
	idFuncS int,
    idioma varchar(20),
    constraint pkSecr primary key(idFuncS),
    constraint fkSecr foreign key(idFuncS) references Funcionario(idFunc)
);

    