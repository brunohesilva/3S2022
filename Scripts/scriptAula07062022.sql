USE hr;

desc employees;

select * 
	from employees;
    
select first_name, commission_pct
	from employees
    where commission_pct is not null
    
select first_name, commission_pct
	from employees
    where commission_pct is null
    
select first_name
		last_name
	from employees
where  first_name like '%u%'

select first_name
		last_name
	from employees
where  first_name like '%a'

select first_name
		last_name
	from employees
where  first_name like '_ex%'

select first_name
		last_name
	from employees
where  first_name like 'A^l%'

select first_name
		salary
        from employees
        where salary between 5000 and 10000
	
select *
	from countries 
	where country_name in ('Argetina', 'Brazil', 'Canda')
    
select *
	from countries 
    order by country_name
    
select *
	from countries 
    order by country_name desc
    
create table teste(
	id int primary key auto_increment,
    nome varchar(30)
);

insert into teste
	values (null, 'zé'),
			(null, 'maria'),
			(null, 'dudu'),
			(null, 'duda'),
			(null, 'jão');
            
select * from teste 

select nome 
	from teste order by nome
    
select distinct nome
	from teste order by nome
    
create table aluno(
	ra numeric(12) primary key,
    nome varchar(100),
    dtNasc date
);

create table uc(
	id int primary key auto_increment,
    nome varchar(100),
    nota numeric(4,2)
);

create table curso(
	ra numeric(12) not null,
    id int not null,
    nome varchar(60),
    primary key(ra, id),
    foreign key (ra) references aluno(ra),
    foreign key (id) references uc(id)
);

-- Inserir 5 alunos

insert into aluno
	values (125111347384, 'Eduardo da Costa', '1999-10-10');
    
-- Inserir 3 ucs

insert into uc
	values (null, 'Modelagem de Sofware', 10);
    
select * from uc;
    
-- Inserir 3 cursos

insert into curso 
	values (125111347384, 1, 'ciencia da computação');
    
select 
		uc.nome,
		aluno.nome,
		curso.nome
	from uc
    inner join curso
		on curso.id = uc.id
	inner join aluno
		on aluno.ra = curso.ra
        
			

