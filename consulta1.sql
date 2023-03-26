SELECT nome, salario, departamento
FROM funcionario, engenheiro
WHERE funcionario.codigo = engenheiro.codigo AND crea LIKE 'PR%'
