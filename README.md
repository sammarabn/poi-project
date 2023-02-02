# Projeto POI
Este projeto tem como objetivo mostrar como se comportam diferentes políticas de baleanceamento de carga aplicadas em uma API simples através de um teste de estresse. Os algoritmos são Round-Robin, Least Connection, Destination Hash, Source Rashing, Shhortest Expect Delay, never Queue. 

## equipe: 
* Gabriel de Carvalho Fonseca (116110584) 
* Sammara Beserra Nunes (116210039)

## Ferramentas utilizadas

* SpringBoot
* Docker
* MiniKube
* Kubernetes
* Google Virtual Machine
* JMeter

## Objetivo

Simular um teste de stress em uma API REST escrita em SpringBoot para cadastro de livros. As requisições seriam feitas através do JMeter. Queria iria projetar os resultados de desempenho em gráficos para cada algoritmo de balanceamento de carga.

A aplicação seria hospedada em uma máquina virtual.  Com Kubernetes e o MiniKube, criamos um cluster para nossa aplicação que seria acessada de forma externa. Através da configuração do IPVS, poderíamos setar os algoritmos. 

## Resultados

Não foi possível obter os resultados devido a um problema para expor a o IP da máquina virtual, impedindo testes externos.
