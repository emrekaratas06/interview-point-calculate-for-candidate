-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 09 Şub 2019, 18:52:04
-- Sunucu sürümü: 10.1.37-MariaDB
-- PHP Sürümü: 7.1.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text COLLATE utf32_turkish_ci NOT NULL,
  `password` text COLLATE utf32_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`) VALUES
('admin', 'admin'),
('emre', '12345');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `calisanlar`
--

CREATE TABLE `calisanlar` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `brans` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `derssaatisayisi` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `ekdersucreti` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `calisanlar`
--

INSERT INTO `calisanlar` (`id`, `ad`, `soyad`, `brans`, `derssaatisayisi`, `ekdersucreti`) VALUES
(2, 'Aşır', 'YÜCEL', 'Matematik', '\0\0\01\0\0\02\0\0\04', '1736'),
(4, 'Merve', 'VURAL', 'Matematik', '\0\0\09\0\0\00', '1260'),
(5, 'Havva', 'KANDEMİR', 'Bilişim', '32', '448'),
(7, 'Ahmet', 'YÜZBAŞIOĞLU', 'Matematik', '110', '1540'),
(9, 'Mustafa', 'ERDEM', 'Yönetim', '\0\0\09\0\0\00', '1260'),
(11, 'Esra', 'AKBULUT', 'Sosyal Bilgiler', '\0\0\01\0\0\00\0\0\00', '1148'),
(12, 'Hanife', 'YAVUZ', 'Din Kültürü', '\0\0\09\0\0\06', '1344'),
(13, 'Meryem', 'UYANIK', 'Din Kültürü', '\0\0\01\0\0\02\0\0\00', '1680'),
(15, 'Hüseyin', 'ŞEN', 'Fen Bilimleri', '\0\0\08\0\0\08', '1232'),
(16, 'Hüseyin', 'YÜCEL', 'Türkçe', '\0\0\09\0\0\06', '1344'),
(17, 'Özlem', 'ÇEVİK', 'Türkçe', '\0\0\01\0\0\00\0\0\02', '1428'),
(18, 'Yunus Emre', 'ERDEM', 'Fen Bilimleri', '\0\0\01\0\0\00\0\0\06', '1484'),
(20, 'Hülya', 'ÖZTÜRK', 'Matematik', '\0\0\01\0\0\00\0\0\00', '1400'),
(21, 'İsmail', 'ERDEM', 'Matematik', '\0\0\01\0\0\00\0\0\08', '1512'),
(22, 'Esra', 'KANDEMİR', 'Sosyal', '\0\0\01\0\0\01\0\0\06', '1624'),
(23, 'Umut', 'ERKURAN', 'Beden Eğitimi', '\0\0\01\0\0\02\0\0\00', '1680'),
(24, 'asim', 'akar', 'Sosyal Bilgiler', '80', '1120');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `dersprogrami`
--

CREATE TABLE `dersprogrami` (
  `id` int(11) NOT NULL,
  `ad` text COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text COLLATE utf8_turkish_ci NOT NULL,
  `brans` text COLLATE utf8_turkish_ci NOT NULL,
  `sinif` text COLLATE utf8_turkish_ci NOT NULL,
  `sube` text COLLATE utf8_turkish_ci NOT NULL,
  `derssaatisayisi` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `dersprogrami`
--

INSERT INTO `dersprogrami` (`id`, `ad`, `soyad`, `brans`, `sinif`, `sube`, `derssaatisayisi`) VALUES
(4, '', '', '', '7. Sınıf', 'C', '');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `calisanlar`
--
ALTER TABLE `calisanlar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Tablo için indeksler `dersprogrami`
--
ALTER TABLE `dersprogrami`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `calisanlar`
--
ALTER TABLE `calisanlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `dersprogrami`
--
ALTER TABLE `dersprogrami`
  ADD CONSTRAINT `dersprogrami_ibfk_1` FOREIGN KEY (`id`) REFERENCES `calisanlar` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
