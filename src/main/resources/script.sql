 CREATE TABLE `cliente` (
 `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 `cpf` varchar(14) NOT NULL,
 `nome` varchar(45) NOT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY `id` (`id`),
 UNIQUE KEY `cpf` (`cpf`)
 );

 CREATE TABLE `contrato` (
 `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 `idCliente` bigint(20) unsigned NOT NULL,
 `redacao` MEDIUMTEXT NOT NULL,
 `ultimaAtualizacao` date,
 PRIMARY KEY (`id`),
 UNIQUE KEY `id` (`id`),
 FOREIGN KEY `idCliente` (`idCliente`)
 REFERENCES `cliente` (`id`) ON DELETE CASCADE
 );