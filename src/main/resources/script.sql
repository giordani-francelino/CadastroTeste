 CREATE TABLE `cliente` (
 `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 `cpf` bigint(11) NOT NULL,
 `nome` varchar(45) NOT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY `id` (`id`)
 );

 CREATE TABLE `contrato` (
 `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 `redacao` MEDIUMTEXT NOT NULL,
 `ultimaAtualizacao` date,
 PRIMARY KEY (`id`),
 UNIQUE KEY `id` (`id`)
 );