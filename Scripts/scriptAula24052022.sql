desc funcionario;

INSERT INTO funcionario 
	values(1, "Jão", 2222222222, null),
		(2, "Zé", 33333333333, 2222222222),
        (3, "Joca", 111222222333344, 2222222222);
        
select * from funcionario;

INSERT INTO funcionario
	values(4, "Maria", null,222222222);

alter table fucionario
	add salario decimal(7,2) not null;
    
desc funcionario;

alter table funcionario
	modify salario decimal(7,2) not null;
    
select * from funcionario;

update funcionario
set salario = 3000.00
where salario is null
limit 5;

update funcionario
set salario = salario + 2000.00
where idfunc = 4;

select * from funcionario;

update funcionario
set salario = salario + salario * 0.15
limit 5;

delete from funcionario
where idfunc=5;

    

    

    