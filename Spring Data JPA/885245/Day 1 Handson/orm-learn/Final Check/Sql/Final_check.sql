create database finalcheck;

use finalcheck;

CREATE TABLE `movie` (
  `id` bigint NOT NULL,
  `active` bit(1) NOT NULL,
  `box_office` varchar(255) DEFAULT NULL,
  `date_of_launch` datetime DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `has_teaser` bit(1) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `movie` VALUES (1,_binary '','$2,787,965,087','2017-03-15 00:00:00','Science Fiction',_binary '','Avatar'),
(2,_binary '','$1,518,812,988','2017-12-23 00:00:00','Superhero',_binary '\0','The Avengers'),
(3,_binary '','$2,187,463,944','2017-08-21 00:00:00','Romance',_binary '\0','Titanic'),
(4,_binary '\0','$1,671,713,208','2017-07-02 00:00:00','Science Fiction',_binary '','Jurassic World'),
(5,_binary '','$2,750,760,348','2022-11-02 00:00:00','Superhero',_binary '','Avengers: End Game');

select * from movie;