-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 09 Haz 2022, 23:47:25
-- Sunucu sürümü: 10.4.19-MariaDB
-- PHP Sürümü: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `fm_db`
--

DELIMITER $$
--
-- Yordamlar
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `display_max_NetProfit` (OUT `highestprofit` INT)  BEGIN
SELECT MAX(act.net_profit) INTO highestprofit FROM account as act;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Get_OrdersWithCustomers` ()  BEGIN
SELECT c.cst_name,c.cst_surname,c.cst_birthdate,c.cst_nationality,c.address,c.phone,O.order_date FROM orders  
INNER JOIN customers c ON c.cst_id = orders.cst_id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `get_reports` ()  BEGIN
SELECT * FROM account WHERE NEXT > 100.000;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `account`
--

CREATE TABLE `account` (
  `report_id` int(11) NOT NULL,
  `total_sold_car_amount` int(11) DEFAULT NULL,
  `total_income_from_car` float DEFAULT NULL,
  `total_paid_salary` float DEFAULT NULL,
  `total_bills` float DEFAULT NULL,
  `net_profit` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `account`
--

INSERT INTO `account` (`report_id`, `total_sold_car_amount`, `total_income_from_car`, `total_paid_salary`, `total_bills`, `net_profit`) VALUES
(5, 1, 125000, 20000, 75000, 30000);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `categories`
--

CREATE TABLE `categories` (
  `categori_id` int(11) NOT NULL,
  `categori_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `categories`
--

INSERT INTO `categories` (`categori_id`, `categori_name`) VALUES
(1, 'A SEGMENT'),
(2, 'B SEGMENT'),
(3, 'C SEGMENT'),
(4, 'D SEGMENT'),
(5, 'COUPE'),
(6, 'CABRIO'),
(7, 'BUSINESS'),
(8, 'BUSINESS LONG'),
(9, 'ROADSTER'),
(10, 'D - SUV'),
(11, 'C - SUV'),
(12, 'D - SUV'),
(13, 'B - SUV');

-- --------------------------------------------------------

--
-- Görünüm yapısı durumu `customerorders`
-- (Asıl görünüm için aşağıya bakın)
--
CREATE TABLE `customerorders` (
`cst_name` varchar(50)
,`cst_surname` varchar(50)
,`cst_nationality` varchar(50)
,`ord_id` int(11)
,`cst_id` int(11)
,`prd_name` varchar(50)
,`amount_paid` float
,`sp_id` int(11)
,`prd_id` int(11)
,`order_date` varchar(11)
,`transport_ID` int(11)
);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `customers`
--

CREATE TABLE `customers` (
  `cst_id` int(11) NOT NULL,
  `cst_name` varchar(50) DEFAULT NULL,
  `cst_surname` varchar(50) DEFAULT NULL,
  `cst_birthdate` varchar(11) DEFAULT NULL,
  `cst_nationality` varchar(50) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `customers`
--

INSERT INTO `customers` (`cst_id`, `cst_name`, `cst_surname`, `cst_birthdate`, `cst_nationality`, `address`, `phone`) VALUES
(1, 'AKİF', 'KAYAR', '22.05.1999', 'Turkey', 'ORDU / TURKEY', '569-965-0326'),
(2, 'VOLKAN', 'TECİR', '12.06.1999', 'Turkey', 'ORDU / TURKEY', '569-236-0362');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `departments`
--

CREATE TABLE `departments` (
  `dpt_id` int(11) NOT NULL,
  `dpt_name` varchar(50) DEFAULT NULL,
  `dpt_phone` varchar(50) DEFAULT NULL,
  `dpt_address` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `departments`
--

INSERT INTO `departments` (`dpt_id`, `dpt_name`, `dpt_phone`, `dpt_address`) VALUES
(1, 'Research & Development', '569-689-26803', 'MAIN BUILDING , FLOOR = 1'),
(2, 'MANAGEMENT', '569-969-0325', 'MANAGEMENT BUILDING , FLOOR = 4'),
(3, 'DESIGN', '569-625-6925', 'DESIGN BUILDING'),
(4, 'HUMAN RESOURCES', '569-658-0325', 'MANAGEMENT BUILDING , FLOOR = 2'),
(5, 'ACCOUNT', '235-036-5689', 'MANAGEMENT BUILDING , FLOOR = 2');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `employees`
--

CREATE TABLE `employees` (
  `emp_id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `surname` varchar(50) DEFAULT NULL,
  `birth_date` varchar(11) DEFAULT NULL,
  `nationality` varchar(50) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `dpt_id` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `job` varchar(50) DEFAULT NULL,
  `salary` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tetikleyiciler `employees`
--
DELIMITER $$
CREATE TRIGGER `before_insert_EmployeeSalary` BEFORE INSERT ON `employees` FOR EACH ROW BEGIN
IF employees.salary < 0 THEN SET NEW.salary = 10000;
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Görünüm yapısı durumu `employeewithdepartments`
-- (Asıl görünüm için aşağıya bakın)
--
CREATE TABLE `employeewithdepartments` (
`name` varchar(50)
,`surname` varchar(50)
,`birth_date` varchar(11)
,`nationality` varchar(50)
,`address` text
,`phone` varchar(50)
,`email` varchar(50)
,`job` varchar(50)
,`salary` float
,`dpt_name` varchar(50)
);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `jobapplications`
--

CREATE TABLE `jobapplications` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `surname` varchar(50) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `dpt_id` int(11) DEFAULT NULL,
  `work_type` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `jobapplications`
--

INSERT INTO `jobapplications` (`id`, `name`, `surname`, `address`, `phone`, `email`, `dpt_id`, `work_type`) VALUES
(1, 'NAZIM BERAT', 'YÜKSEL', 'ISTANBUL / TURKEY', '569-036-0696', 'nazım.berat@gmail.com', 4, 'PART TIME');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `managers`
--

CREATE TABLE `managers` (
  `manager_id` int(11) NOT NULL,
  `manager_name` varchar(50) DEFAULT NULL,
  `manager_surname` varchar(50) DEFAULT NULL,
  `manager_email` varchar(50) DEFAULT NULL,
  `dpt_id` int(11) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `mng_password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `managers`
--

INSERT INTO `managers` (`manager_id`, `manager_name`, `manager_surname`, `manager_email`, `dpt_id`, `address`, `salary`, `mng_password`) VALUES
(1, 'MEHMET', 'ŞENER', 'sener.mehmet@factory.com', 2, 'GIRESUN / TURKEY', 300000, '123456');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `orders`
--

CREATE TABLE `orders` (
  `ord_id` int(11) NOT NULL,
  `cst_id` int(11) DEFAULT NULL,
  `prd_name` varchar(50) DEFAULT NULL,
  `amount_paid` float DEFAULT NULL,
  `sp_id` int(11) DEFAULT NULL,
  `prd_id` int(11) DEFAULT NULL,
  `order_date` varchar(11) DEFAULT NULL,
  `transport_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `orders`
--

INSERT INTO `orders` (`ord_id`, `cst_id`, `prd_name`, `amount_paid`, `sp_id`, `prd_id`, `order_date`, `transport_ID`) VALUES
(1, 1, 'F - Type +', 125000, 1, 1, '16.12.2020', 1);

--
-- Tetikleyiciler `orders`
--
DELIMITER $$
CREATE TRIGGER `before_insert_order` BEFORE INSERT ON `orders` FOR EACH ROW BEGIN
IF orders.amount_paid <= 0 THEN SIGNAL SQLSTATE '50001' SET MESSAGE_TEXT = 'INVALID';
END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `before_insert_report` BEFORE INSERT ON `orders` FOR EACH ROW BEGIN
IF account.total_bills <= 0 THEN SIGNAL SQLSTATE '50001' SET MESSAGE_TEXT = 'INVALID VALUE';
END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Görünüm yapısı durumu `ordersdetails`
-- (Asıl görünüm için aşağıya bakın)
--
CREATE TABLE `ordersdetails` (
`cst_name` varchar(50)
,`cst_surname` varchar(50)
,`cst_birthdate` varchar(11)
,`cst_nationality` varchar(50)
,`amount_paid` float
,`prd_name` varchar(50)
,`order_date` varchar(11)
,`sp_name` varchar(50)
,`sp_surname` varchar(50)
,`shop_id` int(11)
);

-- --------------------------------------------------------

--
-- Görünüm yapısı durumu `producswithcategoryandsimulationinfo`
-- (Asıl görünüm için aşağıya bakın)
--
CREATE TABLE `producswithcategoryandsimulationinfo` (
`prd_name` varchar(50)
,`categori_name` varchar(50)
,`prd_color` varchar(50)
,`sell_price` float
,`explanation` text
,`Simulation Info` text
);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `productionmachines`
--

CREATE TABLE `productionmachines` (
  `machine_id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `production_date` varchar(11) DEFAULT NULL,
  `supplier_id` int(11) DEFAULT NULL,
  `explanation` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `productionmachines`
--

INSERT INTO `productionmachines` (`machine_id`, `name`, `production_date`, `supplier_id`, `explanation`) VALUES
(1, 'PRESS MACHINE', '22.06.2020', 1, 'It used in  the production of body parts.');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `production_simulations`
--

CREATE TABLE `production_simulations` (
  `simulation_id` int(11) NOT NULL,
  `explanation` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `production_simulations`
--

INSERT INTO `production_simulations` (`simulation_id`, `explanation`) VALUES
(1, 'HP = 400\nTork (Nm) = 350\nWeight = 1650 KG\nAutomic transmission\nCD = 0.31'),
(2, 'HP = 550\nTork (Nm) = 500\nWeight = 1550 KG\nSemi automatic transmission\nCD = 0.29');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `products`
--

CREATE TABLE `products` (
  `prd_id` int(11) NOT NULL,
  `prd_name` varchar(50) DEFAULT NULL,
  `categori_id` int(11) DEFAULT NULL,
  `prd_color` varchar(50) DEFAULT NULL,
  `cost_price` float DEFAULT NULL,
  `sell_price` float DEFAULT NULL,
  `net_profit` int(11) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  `simulation_id` int(11) DEFAULT NULL,
  `explanation` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `products`
--

INSERT INTO `products` (`prd_id`, `prd_name`, `categori_id`, `prd_color`, `cost_price`, `sell_price`, `net_profit`, `quantity`, `simulation_id`, `explanation`) VALUES
(1, 'F - Type +', 9, 'BLACK', 50000, 125000, 75000, 1500, 2, 'PREMIUM PACKAGE WITH CARBON STYLE');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `rawmaterial`
--

CREATE TABLE `rawmaterial` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `supplier_id` int(11) DEFAULT NULL,
  `explanation` text DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `rawmaterial`
--

INSERT INTO `rawmaterial` (`id`, `name`, `supplier_id`, `explanation`, `amount`, `price`) VALUES
(1, 'ALUMINUM', 2, 'Body parts will made by aliminum.', 200, 15000);

-- --------------------------------------------------------

--
-- Görünüm yapısı durumu `rawmaterialswithsuppliers`
-- (Asıl görünüm için aşağıya bakın)
--
CREATE TABLE `rawmaterialswithsuppliers` (
`name` varchar(50)
,`explanation` text
,`amount` int(11)
,`price` float
,`supplier_name` varchar(50)
);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `salespersons`
--

CREATE TABLE `salespersons` (
  `sp_id` int(11) NOT NULL,
  `sp_name` varchar(50) DEFAULT NULL,
  `sp_surname` varchar(50) DEFAULT NULL,
  `shop_id` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `sp_password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `salespersons`
--

INSERT INTO `salespersons` (`sp_id`, `sp_name`, `sp_surname`, `shop_id`, `email`, `phone`, `address`, `salary`, `sp_password`) VALUES
(1, 'SERHAT', 'COŞKUN', 1, 'coskun.serhat@factory', '536-698-0626', 'ADIYAMAN / TURKEY', 6000, '123456789');

-- --------------------------------------------------------

--
-- Görünüm yapısı durumu `salespersonwithorders`
-- (Asıl görünüm için aşağıya bakın)
--
CREATE TABLE `salespersonwithorders` (
`sp_name` varchar(50)
,`sp_surname` varchar(50)
,`email` varchar(50)
,`phone` varchar(50)
,`address` text
,`prd_name` varchar(50)
,`order_date` varchar(11)
,`amount_paid` float
);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `shops`
--

CREATE TABLE `shops` (
  `shop_id` int(11) NOT NULL,
  `shop_name` varchar(50) DEFAULT NULL,
  `shop_address` text DEFAULT NULL,
  `shop_mail` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `shops`
--

INSERT INTO `shops` (`shop_id`, `shop_name`, `shop_address`, `shop_mail`) VALUES
(1, 'NEW YORK AUTO PLAZA', 'NEW YORK / USA', 'plaza.newyork@factory.com'),
(2, 'LONDON AUTO PLAZA', 'LONDON / UK', 'plaza.london@factory.com'),
(3, 'ISTANBUL AUTO PLAZA', 'ISTANBUL / TURKEY', 'plaza.istanbul@factory.com'),
(4, 'TOKYO AUTO PLAZA', 'TOKYO / JAPAN', 'plaza.tokyo@factory.com'),
(5, 'MUMBAI AUTO PLAZA', 'MUMBAI / INDIA', 'plaza.mumbai@factory.com');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `suppliers`
--

CREATE TABLE `suppliers` (
  `supplier_id` int(11) NOT NULL,
  `supplier_name` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `suppliers`
--

INSERT INTO `suppliers` (`supplier_id`, `supplier_name`, `country`, `phone`, `address`, `email`) VALUES
(1, 'BOSCH', 'Germany', '526-698-0000', 'BERLIN / GERMANY qqq', 'bosch@gmbh.com'),
(2, 'SIEMENS', 'Germany', '569-0362-0202', 'MUNIH / GERMANY', 'siemens@gmbh.com');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `transportvehicles`
--

CREATE TABLE `transportvehicles` (
  `vehicle_id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `model` varchar(50) DEFAULT NULL,
  `plaque` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `transportvehicles`
--

INSERT INTO `transportvehicles` (`vehicle_id`, `name`, `model`, `plaque`) VALUES
(1, 'MERCEDES - BENZ ACTROS ', '2019', '546-ASD5-ASD');

-- --------------------------------------------------------

--
-- Görünüm yapısı `customerorders`
--
DROP TABLE IF EXISTS `customerorders`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `customerorders`  AS SELECT `customers`.`cst_name` AS `cst_name`, `customers`.`cst_surname` AS `cst_surname`, `customers`.`cst_nationality` AS `cst_nationality`, `orders`.`ord_id` AS `ord_id`, `orders`.`cst_id` AS `cst_id`, `orders`.`prd_name` AS `prd_name`, `orders`.`amount_paid` AS `amount_paid`, `orders`.`sp_id` AS `sp_id`, `orders`.`prd_id` AS `prd_id`, `orders`.`order_date` AS `order_date`, `orders`.`transport_ID` AS `transport_ID` FROM (`customers` join `orders` on(`customers`.`cst_id` = `orders`.`cst_id`)) ;

-- --------------------------------------------------------

--
-- Görünüm yapısı `employeewithdepartments`
--
DROP TABLE IF EXISTS `employeewithdepartments`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employeewithdepartments`  AS SELECT `employees`.`name` AS `name`, `employees`.`surname` AS `surname`, `employees`.`birth_date` AS `birth_date`, `employees`.`nationality` AS `nationality`, `employees`.`address` AS `address`, `employees`.`phone` AS `phone`, `employees`.`email` AS `email`, `employees`.`job` AS `job`, `employees`.`salary` AS `salary`, `departments`.`dpt_name` AS `dpt_name` FROM (`employees` join `departments` on(`employees`.`emp_id` = `departments`.`dpt_id`)) ;

-- --------------------------------------------------------

--
-- Görünüm yapısı `ordersdetails`
--
DROP TABLE IF EXISTS `ordersdetails`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ordersdetails`  AS SELECT `c`.`cst_name` AS `cst_name`, `c`.`cst_surname` AS `cst_surname`, `c`.`cst_birthdate` AS `cst_birthdate`, `c`.`cst_nationality` AS `cst_nationality`, `o`.`amount_paid` AS `amount_paid`, `o`.`prd_name` AS `prd_name`, `o`.`order_date` AS `order_date`, `sp`.`sp_name` AS `sp_name`, `sp`.`sp_surname` AS `sp_surname`, `sp`.`shop_id` AS `shop_id` FROM ((((`orders` `o` join `transportvehicles` `tv` on(`tv`.`vehicle_id` = `o`.`transport_ID`)) join `products` `p` on(`p`.`prd_id` = `o`.`prd_id`)) join `customers` `c` on(`c`.`cst_id` = `o`.`cst_id`)) join `salespersons` `sp` on(`sp`.`sp_id` = `o`.`sp_id`)) ;

-- --------------------------------------------------------

--
-- Görünüm yapısı `producswithcategoryandsimulationinfo`
--
DROP TABLE IF EXISTS `producswithcategoryandsimulationinfo`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `producswithcategoryandsimulationinfo`  AS SELECT `p`.`prd_name` AS `prd_name`, `c`.`categori_name` AS `categori_name`, `p`.`prd_color` AS `prd_color`, `p`.`sell_price` AS `sell_price`, `p`.`explanation` AS `explanation`, `ps`.`explanation` AS `Simulation Info` FROM ((`products` `p` join `categories` `c` on(`c`.`categori_id` = `p`.`categori_id`)) join `production_simulations` `ps` on(`ps`.`simulation_id` = `p`.`simulation_id`)) ;

-- --------------------------------------------------------

--
-- Görünüm yapısı `rawmaterialswithsuppliers`
--
DROP TABLE IF EXISTS `rawmaterialswithsuppliers`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rawmaterialswithsuppliers`  AS SELECT `rawmaterial`.`name` AS `name`, `rawmaterial`.`explanation` AS `explanation`, `rawmaterial`.`amount` AS `amount`, `rawmaterial`.`price` AS `price`, `suppliers`.`supplier_name` AS `supplier_name` FROM (`rawmaterial` join `suppliers` on(`rawmaterial`.`supplier_id` = `suppliers`.`supplier_id`)) ;

-- --------------------------------------------------------

--
-- Görünüm yapısı `salespersonwithorders`
--
DROP TABLE IF EXISTS `salespersonwithorders`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `salespersonwithorders`  AS SELECT `salespersons`.`sp_name` AS `sp_name`, `salespersons`.`sp_surname` AS `sp_surname`, `salespersons`.`email` AS `email`, `salespersons`.`phone` AS `phone`, `salespersons`.`address` AS `address`, `orders`.`prd_name` AS `prd_name`, `orders`.`order_date` AS `order_date`, `orders`.`amount_paid` AS `amount_paid` FROM (`salespersons` join `orders` on(`salespersons`.`sp_id` = `orders`.`sp_id`)) ;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`report_id`);

--
-- Tablo için indeksler `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`categori_id`);

--
-- Tablo için indeksler `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`cst_id`);

--
-- Tablo için indeksler `departments`
--
ALTER TABLE `departments`
  ADD PRIMARY KEY (`dpt_id`);

--
-- Tablo için indeksler `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`emp_id`),
  ADD KEY `dpt_id` (`dpt_id`);

--
-- Tablo için indeksler `jobapplications`
--
ALTER TABLE `jobapplications`
  ADD PRIMARY KEY (`id`),
  ADD KEY `dpt_id` (`dpt_id`);

--
-- Tablo için indeksler `managers`
--
ALTER TABLE `managers`
  ADD PRIMARY KEY (`manager_id`),
  ADD KEY `dpt_id` (`dpt_id`);

--
-- Tablo için indeksler `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ord_id`),
  ADD KEY `cst_id` (`cst_id`),
  ADD KEY `sp_id` (`sp_id`),
  ADD KEY `prd_id` (`prd_id`),
  ADD KEY `transport_ID` (`transport_ID`);

--
-- Tablo için indeksler `productionmachines`
--
ALTER TABLE `productionmachines`
  ADD PRIMARY KEY (`machine_id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Tablo için indeksler `production_simulations`
--
ALTER TABLE `production_simulations`
  ADD PRIMARY KEY (`simulation_id`);

--
-- Tablo için indeksler `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`prd_id`),
  ADD KEY `categori_id` (`categori_id`),
  ADD KEY `simulation_id` (`simulation_id`);

--
-- Tablo için indeksler `rawmaterial`
--
ALTER TABLE `rawmaterial`
  ADD PRIMARY KEY (`id`),
  ADD KEY `supplier_id` (`supplier_id`);

--
-- Tablo için indeksler `salespersons`
--
ALTER TABLE `salespersons`
  ADD PRIMARY KEY (`sp_id`),
  ADD KEY `shop_id` (`shop_id`);

--
-- Tablo için indeksler `shops`
--
ALTER TABLE `shops`
  ADD PRIMARY KEY (`shop_id`);

--
-- Tablo için indeksler `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`supplier_id`);

--
-- Tablo için indeksler `transportvehicles`
--
ALTER TABLE `transportvehicles`
  ADD PRIMARY KEY (`vehicle_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `account`
--
ALTER TABLE `account`
  MODIFY `report_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `categories`
--
ALTER TABLE `categories`
  MODIFY `categori_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Tablo için AUTO_INCREMENT değeri `customers`
--
ALTER TABLE `customers`
  MODIFY `cst_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `departments`
--
ALTER TABLE `departments`
  MODIFY `dpt_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Tablo için AUTO_INCREMENT değeri `employees`
--
ALTER TABLE `employees`
  MODIFY `emp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `jobapplications`
--
ALTER TABLE `jobapplications`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `managers`
--
ALTER TABLE `managers`
  MODIFY `manager_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `orders`
--
ALTER TABLE `orders`
  MODIFY `ord_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `productionmachines`
--
ALTER TABLE `productionmachines`
  MODIFY `machine_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `production_simulations`
--
ALTER TABLE `production_simulations`
  MODIFY `simulation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `products`
--
ALTER TABLE `products`
  MODIFY `prd_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `rawmaterial`
--
ALTER TABLE `rawmaterial`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `salespersons`
--
ALTER TABLE `salespersons`
  MODIFY `sp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `shops`
--
ALTER TABLE `shops`
  MODIFY `shop_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Tablo için AUTO_INCREMENT değeri `suppliers`
--
ALTER TABLE `suppliers`
  MODIFY `supplier_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `transportvehicles`
--
ALTER TABLE `transportvehicles`
  MODIFY `vehicle_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`dpt_id`) REFERENCES `departments` (`dpt_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `jobapplications`
--
ALTER TABLE `jobapplications`
  ADD CONSTRAINT `jobapplications_ibfk_1` FOREIGN KEY (`dpt_id`) REFERENCES `departments` (`dpt_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `managers`
--
ALTER TABLE `managers`
  ADD CONSTRAINT `managers_ibfk_1` FOREIGN KEY (`dpt_id`) REFERENCES `departments` (`dpt_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`cst_id`) REFERENCES `customers` (`cst_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`sp_id`) REFERENCES `salespersons` (`sp_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`prd_id`) REFERENCES `products` (`prd_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `orders_ibfk_4` FOREIGN KEY (`transport_ID`) REFERENCES `transportvehicles` (`vehicle_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `productionmachines`
--
ALTER TABLE `productionmachines`
  ADD CONSTRAINT `productionmachines_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`supplier_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`simulation_id`) REFERENCES `production_simulations` (`simulation_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `products_ibfk_2` FOREIGN KEY (`categori_id`) REFERENCES `categories` (`categori_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `rawmaterial`
--
ALTER TABLE `rawmaterial`
  ADD CONSTRAINT `rawmaterial_ibfk_1` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`supplier_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Tablo kısıtlamaları `salespersons`
--
ALTER TABLE `salespersons`
  ADD CONSTRAINT `salespersons_ibfk_1` FOREIGN KEY (`shop_id`) REFERENCES `shops` (`shop_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
