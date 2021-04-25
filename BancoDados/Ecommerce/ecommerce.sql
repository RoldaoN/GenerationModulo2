-- MySQL Script generated by MySQL Workbench
-- Sat Apr 24 18:46:14 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ecommerce
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ecommerce
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ecommerce` DEFAULT CHARACTER SET utf8 ;
USE `ecommerce` ;

-- -----------------------------------------------------
-- Table `ecommerce`.`tb_produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ecommerce`.`tb_produtos` (
  `id_produtos` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `tipo_produto` VARCHAR(45) NOT NULL,
  `cor` VARCHAR(20) NOT NULL,
  `tamanho` VARCHAR(20) NOT NULL,
  `data_chegada` DATE NOT NULL,
  `preco` FLOAT NOT NULL,
  PRIMARY KEY (`id_produtos`),
  UNIQUE INDEX `id_produtos_UNIQUE` (`id_produtos` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

SELECT * FROM ecommerce.tb_produtos;

INSERT INTO tb_produtos (tipo_produto, cor, tamanho, data_chegada, preco)
values ("Smatfones","Preto","6.0 Polegadas","2021/04/20",1500.00),
("Carregadores","Variadas","1.5 Metros","2021/04/20",10.00),
("Fone de ouvido","Variadas","1.1 Metros","2021/04/20",15.00),
("Capinhas Variadas","Variadas","Variados","2021/04/20",20.00),
("HeadFones sem fio","Preto","Único","2021/04/15",500.00),
("Mouse com fio USB3.0","Grafite","1.5 Metros","2021/04/15",600.00),
("Tablets","Preto","12.5 Polegadas","2021/04/10",750.00);

SELECT * FROM  tb_produtos WHERE preco >= 500;
SELECT * FROM  tb_produtos WHERE preco < 500;

UPDATE ecommerce.tb_produtos
SET preco = 400 WHERE id_produtos = 6;