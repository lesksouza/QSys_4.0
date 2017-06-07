-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.6.26-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para qsys
CREATE DATABASE IF NOT EXISTS `qsys` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `qsys`;


-- Copiando estrutura para tabela qsys.administrador
CREATE TABLE IF NOT EXISTS `administrador` (
  `nome` varchar(50) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela qsys.assunto
CREATE TABLE IF NOT EXISTS `assunto` (
  `nome` varchar(50) NOT NULL,
  `codigo` int(11) NOT NULL,
  `disciplina` varchar(30) DEFAULT NULL,
  `grau_educacao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela qsys.disciplina
CREATE TABLE IF NOT EXISTS `disciplina` (
  `nome` varchar(30) NOT NULL,
  `codigo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela qsys.professores
CREATE TABLE IF NOT EXISTS `professores` (
  `codigo` int(11) DEFAULT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `login` varchar(15) DEFAULT NULL,
  `senha` varchar(30) DEFAULT NULL,
  `disciplina1` varchar(30) DEFAULT NULL,
  `disciplina2` varchar(30) DEFAULT NULL,
  `contato` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `licenciatura` tinyint(1) DEFAULT NULL,
  `bacharelado` tinyint(1) DEFAULT NULL,
  `especializacao` tinyint(1) DEFAULT NULL,
  `mestrado` tinyint(1) DEFAULT NULL,
  `doutorado` tinyint(1) DEFAULT NULL,
  `posdoutorado` tinyint(1) DEFAULT NULL,
  `curriculo` varchar(250) DEFAULT NULL,
  `diretordeturma` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela qsys.prova
CREATE TABLE IF NOT EXISTS `prova` (
  `codigo` int(11) NOT NULL,
  `assunto` varchar(100) DEFAULT NULL,
  `disciplina` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.


-- Copiando estrutura para tabela qsys.questao
CREATE TABLE IF NOT EXISTS `questao` (
  `codigo` int(11) NOT NULL,
  `assunto` varchar(30) DEFAULT NULL,
  `disciplina` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Exportação de dados foi desmarcado.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
