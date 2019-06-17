-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 17 Cze 2019, 05:52
-- Wersja serwera: 10.1.40-MariaDB
-- Wersja PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `szko__a-2`
--

DELIMITER $$
--
-- Procedury
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `dod` (IN `imie` TEXT, IN `nazwisko` TEXT, IN `pesel` VARCHAR(11), IN `ocena` INT)  INSERT INTO `uczniowie` ( `Imie`, `Nazwisko`, `Pesel`, `Oceny`) VALUES
(imie, nazwisko, pesel, ocena)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `srednia` (IN `pese` VARCHAR(200))  SELECT (matematyka + jpolski + jangielski + wf + biologia + geografia)/6    from oceny where Pesel = pese$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `nauczyciele`
--

CREATE TABLE `nauczyciele` (
  `Nr.` int(11) NOT NULL,
  `Imie` text NOT NULL,
  `Nazwisko` text NOT NULL,
  `Przedmiot` text NOT NULL,
  `PeselNauczyciela` text CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `nauczyciele`
--

INSERT INTO `nauczyciele` (`Nr.`, `Imie`, `Nazwisko`, `Przedmiot`, `PeselNauczyciela`) VALUES
(11, 'Juliusz', 'Makkow', 'j.angieslki', '77123075646'),
(12, 'Andzej', 'Duaader', 'wf', '22123256757'),
(13, 'Agata', 'Saerae', 'geografia', '55231243475'),
(16, 'Henryk', 'Sienna', 'biologia', '55093064575'),
(17, 'Zbigniew', 'Herawa', 'j.polski', '77012347568');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `oceny`
--

CREATE TABLE `oceny` (
  `Nr.` int(11) NOT NULL,
  `Pesel` varchar(11) NOT NULL,
  `matematyka` int(11) NOT NULL,
  `jpolski` int(11) NOT NULL,
  `jangielski` int(11) NOT NULL,
  `wf` int(11) NOT NULL,
  `biologia` int(11) NOT NULL,
  `geografia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `oceny`
--

INSERT INTO `oceny` (`Nr.`, `Pesel`, `matematyka`, `jpolski`, `jangielski`, `wf`, `biologia`, `geografia`) VALUES
(18, '09876543211', 5, 4, 5, 4, 3, 3),
(16, '11111111111', 4, 4, 4, 4, 4, 3),
(17, '12345543211', 3, 3, 3, 3, 4, 3);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `uczniowie`
--

CREATE TABLE `uczniowie` (
  `Nr.` int(11) NOT NULL,
  `Imie` text NOT NULL,
  `Nazwisko` text NOT NULL,
  `Pesel` varchar(11) NOT NULL,
  `Oceny` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `uczniowie`
--

INSERT INTO `uczniowie` (`Nr.`, `Imie`, `Nazwisko`, `Pesel`, `Oceny`) VALUES
(59, 'Adam', 'Herre', '11111111111', 5),
(63, 'Henryk', 'Vivaldii', '09876543211', 5);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `nauczyciele`
--
ALTER TABLE `nauczyciele`
  ADD PRIMARY KEY (`Nr.`);

--
-- Indeksy dla tabeli `oceny`
--
ALTER TABLE `oceny`
  ADD PRIMARY KEY (`Pesel`),
  ADD KEY `Nr.` (`Nr.`) USING BTREE;

--
-- Indeksy dla tabeli `uczniowie`
--
ALTER TABLE `uczniowie`
  ADD PRIMARY KEY (`Nr.`),
  ADD KEY `Pesel` (`Pesel`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `nauczyciele`
--
ALTER TABLE `nauczyciele`
  MODIFY `Nr.` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT dla tabeli `oceny`
--
ALTER TABLE `oceny`
  MODIFY `Nr.` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT dla tabeli `uczniowie`
--
ALTER TABLE `uczniowie`
  MODIFY `Nr.` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `uczniowie`
--
ALTER TABLE `uczniowie`
  ADD CONSTRAINT `uczniowie_ibfk_1` FOREIGN KEY (`Pesel`) REFERENCES `oceny` (`Pesel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
