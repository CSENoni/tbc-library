CREATE DATABASE IF NOT EXISTS `tbc_library`;
USE `tbc_library`;

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
	`id` int(11) NOT NULL primary key auto_increment,
    `categories` varchar(255) DEFAULT NULL,
	`name` varchar(255) DEFAULT NULL,
	`icon` text DEFAULT NULL
);

INSERT INTO `items` VALUES 
(1, 'consumables', 'Elixir of Major Agility', 'https://wow.zamimg.com/images/wow/icons/large/inv_potion_127.jpg'),
(2, 'weapons', 'Nathrezim Mindblade', 'https://wow.zamimg.com/images/wow/icons/large/inv_weapon_shortblade_41.jpg'),
(3, 'Hearbs', 'Terocone', 'https://wow.zamimg.com/images/wow/icons/large/inv_misc_herb_terrocone.jpg')
;