# ORANGE TALENTS - API DE CONTROLE DE VACINAS

Projeto do desafio do Orange Talents da Zup

## Contexto do desafio

> Você está fazendo uma API REST que precisará controlar a aplicação de vacinas entre a população brasileira. O primeiro passo deve ser a  construção de um cadastro de usuários, sendo obrigatórios dados como:  nome, e-mail, CPF e data de nascimento, onde e-mail e CPF devem ser  únicos.
>
> O segundo passo é criar um cadastro de aplicação de vacinas, sendo  obrigatórios dados como: nome da vacina, e-mail do usuário e a data que  foi realizada a vacina.
>
> Você deve construir apenas dois endpoints neste sistema, o cadastro  do usuário e o cadastro da aplicação da vacina. Caso os cadastros  estejam corretos, é necessário voltar o Status 201, caso hajam erros de  preenchimento de dados, o Status deve ser 400.
>
>  
>
> **Se ficou fácil, te desafiamos a:**
>
> - Construir a aplicação sem utilizar Lombok;
>
> - Substituir o e-mail do usuário na tabela de vacinação     para uma chave estrangeira associada ao id do usuário. 

## Proposta de solução

O desafio é uma api simples apenas com o C do CRUD, ou seja apenas a criação dos recursos no sistema, mesmo sendo um desafio simples vou buscar utilizar os melhores métodos e boas praticas que eu conheço na hora da implementação, tentando manter uma simplicidade e pensando na escalabilidade do projeto

Segue abaixo o link do blog explicando como fiz a implementação:

https://docs.google.com/document/d/1RkA_LAhKf_Jxu0pNNl2HvlBWkYkcIL2K4yio9WhgVvM/edit?usp=sharing

## Requisições HTTP

Para criar um usuário:

Para criar uma Vacinação:

