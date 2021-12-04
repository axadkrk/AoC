fun main() {
    val numbers = intArrayOf(
        17,
        2,
        33,
        86,
        38,
        41,
        4,
        34,
        91,
        61,
        11,
        81,
        3,
        59,
        29,
        71,
        26,
        44,
        54,
        89,
        46,
        9,
        85,
        62,
        23,
        76,
        45,
        24,
        78,
        14,
        58,
        48,
        57,
        40,
        21,
        49,
        7,
        99,
        8,
        56,
        50,
        19,
        53,
        55,
        10,
        94,
        75,
        68,
        6,
        83,
        84,
        88,
        52,
        80,
        73,
        74,
        79,
        36,
        70,
        28,
        37,
        0,
        42,
        98,
        96,
        92,
        27,
        90,
        47,
        20,
        5,
        77,
        69,
        93,
        31,
        30,
        95,
        25,
        63,
        65,
        51,
        72,
        60,
        16,
        12,
        64,
        18,
        13,
        1,
        35,
        15,
        66,
        67,
        43,
        22,
        87,
        97,
        32,
        39,
        82
    )

    val blocks =
        arrayOf(
            arrayOf(
                intArrayOf(10, 27, 53, 91, 86),
                intArrayOf(15, 94, 47, 38, 61),
                intArrayOf(32, 68, 8, 88, 9),
                intArrayOf(35, 84, 3, 7, 87),
                intArrayOf(62, 78, 90, 66, 64)
            ),
            arrayOf(
                intArrayOf(30, 51, 26, 16, 57),
                intArrayOf(66, 88, 47, 75, 23),
                intArrayOf(61, 77, 64, 9, 73),
                intArrayOf(44, 32, 28, 80, 81),
                intArrayOf(3, 99, 67, 49, 78),
            ),
            arrayOf(
                intArrayOf(68, 92, 82, 74, 83),
                intArrayOf(12, 99, 80, 72, 3),
                intArrayOf(56, 96, 36, 28, 43),
                intArrayOf(2, 7, 14, 24, 9),
                intArrayOf(63, 76, 40, 37, 73)
            ),
            arrayOf(
                intArrayOf(88, 66, 96, 86, 7),
                intArrayOf(94, 21, 70, 25, 46),
                intArrayOf(28, 16, 12, 69, 8),
                intArrayOf(59, 43, 89, 30, 55),
                intArrayOf(45, 52, 0, 83, 67)
            ),
            arrayOf(
                intArrayOf(21, 42, 92, 30, 81),
                intArrayOf(15, 98, 26, 79, 48),
                intArrayOf(90, 99, 5, 88, 53),
                intArrayOf(2, 67, 74, 55, 33),
                intArrayOf(54, 20, 69, 39, 75)
            ),
            arrayOf(
                intArrayOf(53, 12, 4, 86, 46),
                intArrayOf(62, 7, 98, 6, 23),
                intArrayOf(17, 68, 39, 63, 20),
                intArrayOf(29, 25, 84, 87, 24),
                intArrayOf(54, 5, 42, 8, 45)
            ),
            arrayOf(
                intArrayOf(14, 63, 36, 84, 27),
                intArrayOf(72, 96, 95, 99, 40),
                intArrayOf(28, 68, 78, 8, 46),
                intArrayOf(41, 45, 33, 15, 82),
                intArrayOf(65, 66, 64, 49, 7)
            ),
            arrayOf(
                intArrayOf(22, 35, 72, 75, 47),
                intArrayOf(53, 59, 17, 95, 55),
                intArrayOf(25, 91, 57, 10, 96),
                intArrayOf(39, 3, 18, 90, 64),
                intArrayOf(34, 26, 71, 52, 69)
            ),
            arrayOf(
                intArrayOf(72, 8, 67, 92, 83),
                intArrayOf(87, 89, 25, 39, 78),
                intArrayOf(86, 53, 55, 22, 43),
                intArrayOf(21, 63, 40, 9, 74),
                intArrayOf(29, 56, 44, 30, 80)
            ),
            arrayOf(
                intArrayOf(33, 87, 52, 80, 83),
                intArrayOf(70, 91, 74, 63, 36),
                intArrayOf(48, 49, 29, 42, 6),
                intArrayOf(54, 47, 96, 4, 19),
                intArrayOf(53, 35, 30, 43, 61)
            ),
            arrayOf(
                intArrayOf(82, 7, 38, 86, 79),
                intArrayOf(53, 87, 21, 45, 44),
                intArrayOf(10, 18, 46, 30, 36),
                intArrayOf(12, 1, 50, 2, 59),
                intArrayOf(94, 3, 39, 62, 32)
            ),
            arrayOf(
                intArrayOf(68, 74, 24, 97, 99),
                intArrayOf(45, 75, 41, 62, 34),
                intArrayOf(3, 28, 49, 1, 66),
                intArrayOf(10, 91, 95, 58, 38),
                intArrayOf(61, 79, 50, 27, 71)
            ),
            arrayOf(
                intArrayOf(69, 59, 96, 5, 26),
                intArrayOf(67, 16, 2, 72, 28),
                intArrayOf(45, 58, 55, 18, 53),
                intArrayOf(74, 76, 98, 38, 42),
                intArrayOf(82, 22, 79, 89, 87)
            ),
            arrayOf(
                intArrayOf(3, 33, 73, 66, 52),
                intArrayOf(69, 29, 78, 75, 34),
                intArrayOf(1, 64, 15, 17, 68),
                intArrayOf(27, 32, 46, 54, 18),
                intArrayOf(55, 74, 60, 28, 40)
            ),
            arrayOf(
                intArrayOf(9, 54, 84, 1, 42),
                intArrayOf(15, 91, 77, 74, 10),
                intArrayOf(55, 64, 60, 22, 86),
                intArrayOf(18, 58, 73, 0, 23),
                intArrayOf(11, 61, 2, 68, 43)
            ),
            arrayOf(
                intArrayOf(75, 62, 34, 89, 53),
                intArrayOf(39, 10, 84, 56, 21),
                intArrayOf(86, 98, 87, 90, 83),
                intArrayOf(17, 79, 1, 19, 15),
                intArrayOf(42, 67, 55, 6, 77)
            ),
            arrayOf(
                intArrayOf(36, 3, 60, 1, 70),
                intArrayOf(63, 40, 7, 88, 61),
                intArrayOf(65, 96, 18, 73, 30),
                intArrayOf(42, 35, 44, 45, 81),
                intArrayOf(77, 95, 39, 24, 5)
            ),
            arrayOf(
                intArrayOf(81, 24, 39, 53, 89),
                intArrayOf(99, 11, 27, 22, 86),
                intArrayOf(5, 8, 36, 97, 28),
                intArrayOf(92, 58, 38, 34, 62),
                intArrayOf(32, 4, 1, 74, 68)
            ),
            arrayOf(
                intArrayOf(97, 20, 54, 99, 67),
                intArrayOf(63, 78, 61, 57, 21),
                intArrayOf(28, 24, 4, 98, 19),
                intArrayOf(64, 77, 14, 81, 30),
                intArrayOf(16, 36, 89, 79, 26)
            ),
            arrayOf(
                intArrayOf(73, 90, 0, 28, 5),
                intArrayOf(11, 27, 56, 96, 1),
                intArrayOf(29, 87, 12, 69, 8),
                intArrayOf(63, 95, 72, 86, 64),
                intArrayOf(48, 46, 50, 37, 57)
            ),
            arrayOf(
                intArrayOf(22, 3, 7, 87, 14),
                intArrayOf(90, 11, 67, 76, 13),
                intArrayOf(58, 49, 16, 56, 59),
                intArrayOf(45, 46, 19, 41, 23),
                intArrayOf(75, 66, 61, 51, 54)
            ),
            arrayOf(
                intArrayOf(4, 6, 84, 59, 86),
                intArrayOf(18, 16, 40, 79, 85),
                intArrayOf(38, 98, 95, 89, 5),
                intArrayOf(82, 21, 76, 36, 13),
                intArrayOf(71, 0, 17, 47, 29)
            ),
            arrayOf(
                intArrayOf(73, 41, 26, 87, 95),
                intArrayOf(62, 99, 58, 9, 20),
                intArrayOf(45, 10, 71, 28, 39),
                intArrayOf(89, 17, 29, 46, 81),
                intArrayOf(49, 35, 24, 74, 32)
            ),
            arrayOf(
                intArrayOf(62, 22, 95, 86, 0),
                intArrayOf(2, 39, 9, 41, 25),
                intArrayOf(59, 42, 94, 74, 13),
                intArrayOf(72, 69, 75, 97, 21),
                intArrayOf(6, 71, 90, 4, 19)
            ),
            arrayOf(
                intArrayOf(62, 75, 92, 98, 10),
                intArrayOf(80, 12, 57, 82, 25),
                intArrayOf(3, 65, 67, 81, 15),
                intArrayOf(1, 69, 43, 14, 45),
                intArrayOf(93, 53, 36, 66, 4)
            ),
            arrayOf(
                intArrayOf(72, 12, 47, 40, 78),
                intArrayOf(68, 43, 24, 28, 99),
                intArrayOf(5, 98, 70, 25, 59),
                intArrayOf(8, 10, 58, 46, 7),
                intArrayOf(36, 56, 37, 84, 32)
            ),
            arrayOf(
                intArrayOf(37, 2, 68, 52, 23),
                intArrayOf(66, 80, 18, 98, 84),
                intArrayOf(97, 77, 96, 3, 26),
                intArrayOf(12, 14, 40, 42, 99),
                intArrayOf(29, 9, 30, 11, 44)
            ),
            arrayOf(
                intArrayOf(24, 82, 7, 51, 16),
                intArrayOf(96, 0, 10, 92, 43),
                intArrayOf(34, 80, 5, 59, 57),
                intArrayOf(30, 18, 72, 37, 38),
                intArrayOf(31, 28, 81, 87, 94)
            ),
            arrayOf(
                intArrayOf(40, 93, 85, 27, 69),
                intArrayOf(70, 6, 41, 14, 17),
                intArrayOf(58, 95, 79, 24, 65),
                intArrayOf(62, 48, 11, 78, 43),
                intArrayOf(30, 21, 19, 16, 97)
            ),
            arrayOf(
                intArrayOf(90, 14, 51, 98, 39),
                intArrayOf(45, 56, 69, 24, 38),
                intArrayOf(73, 29, 88, 9, 62),
                intArrayOf(72, 84, 27, 18, 81),
                intArrayOf(22, 7, 23, 91, 68)
            ),
            arrayOf(
                intArrayOf(55, 19, 29, 40, 18),
                intArrayOf(63, 51, 26, 93, 12),
                intArrayOf(11, 50, 60, 88, 65),
                intArrayOf(9, 35, 22, 97, 23),
                intArrayOf(61, 69, 82, 32, 28)
            ),
            arrayOf(
                intArrayOf(37, 17, 81, 94, 1),
                intArrayOf(19, 6, 0, 49, 8),
                intArrayOf(40, 25, 34, 98, 63),
                intArrayOf(59, 15, 53, 23, 64),
                intArrayOf(66, 52, 69, 84, 68)
            ),
            arrayOf(
                intArrayOf(83, 86, 19, 87, 93),
                intArrayOf(85, 92, 24, 50, 33),
                intArrayOf(1, 41, 40, 96, 26),
                intArrayOf(99, 59, 9, 98, 3),
                intArrayOf(45, 75, 60, 52, 90)
            ),
            arrayOf(
                intArrayOf(41, 40, 36, 70, 57),
                intArrayOf(64, 63, 72, 16, 99),
                intArrayOf(50, 84, 69, 89, 43),
                intArrayOf(12, 55, 54, 67, 53),
                intArrayOf(59, 13, 42, 78, 91)
            ),
            arrayOf(
                intArrayOf(98, 19, 96, 21, 39),
                intArrayOf(28, 48, 83, 50, 97),
                intArrayOf(57, 7, 12, 6, 63),
                intArrayOf(38, 32, 52, 66, 10),
                intArrayOf(2, 18, 42, 75, 94)
            ),
            arrayOf(
                intArrayOf(75, 31, 77, 20, 90),
                intArrayOf(35, 14, 28, 54, 95),
                intArrayOf(96, 24, 86, 11, 58),
                intArrayOf(7, 50, 97, 76, 63),
                intArrayOf(27, 51, 34, 21, 83)
            ),
            arrayOf(
                intArrayOf(60, 89, 11, 38, 88),
                intArrayOf(57, 36, 77, 55, 18),
                intArrayOf(42, 27, 67, 32, 94),
                intArrayOf(12, 9, 24, 10, 14),
                intArrayOf(69, 35, 79, 97, 50)
            ),
            arrayOf(
                intArrayOf(46, 82, 60, 45, 6),
                intArrayOf(84, 88, 0, 7, 51),
                intArrayOf(37, 52, 64, 25, 74),
                intArrayOf(31, 8, 75, 53, 72),
                intArrayOf(11, 47, 34, 40, 50)
            ),
            arrayOf(
                intArrayOf(70, 96, 35, 20, 26),
                intArrayOf(73, 62, 54, 72, 4),
                intArrayOf(29, 27, 8, 46, 48),
                intArrayOf(31, 0, 90, 81, 16),
                intArrayOf(82, 44, 88, 22, 32)
            ),
            arrayOf(
                intArrayOf(73, 95, 77, 66, 37),
                intArrayOf(30, 68, 12, 85, 11),
                intArrayOf(34, 5, 57, 15, 38),
                intArrayOf(22, 89, 78, 7, 40),
                intArrayOf(71, 1, 54, 90, 39)
            ),
            arrayOf(
                intArrayOf(13, 80, 22, 73, 30),
                intArrayOf(49, 36, 98, 75, 33),
                intArrayOf(32, 95, 74, 54, 56),
                intArrayOf(21, 55, 68, 34, 61),
                intArrayOf(60, 50, 3, 38, 11)
            ),
            arrayOf(
                intArrayOf(21, 80, 17, 8, 46),
                intArrayOf(7, 88, 18, 22, 20),
                intArrayOf(41, 73, 72, 0, 34),
                intArrayOf(66, 75, 45, 47, 30),
                intArrayOf(44, 10, 93, 28, 58)
            ),
            arrayOf(
                intArrayOf(32, 50, 78, 90, 29),
                intArrayOf(28, 71, 77, 2, 69),
                intArrayOf(79, 66, 30, 40, 37),
                intArrayOf(14, 11, 63, 10, 60),
                intArrayOf(84, 88, 65, 8, 54)
            ),
            arrayOf(
                intArrayOf(86, 89, 64, 69, 76),
                intArrayOf(53, 82, 24, 16, 51),
                intArrayOf(67, 75, 3, 33, 21),
                intArrayOf(23, 63, 99, 13, 43),
                intArrayOf(4, 39, 7, 73, 87)
            ),
            arrayOf(
                intArrayOf(3, 38, 22, 72, 80),
                intArrayOf(56, 48, 1, 50, 60),
                intArrayOf(49, 98, 67, 53, 30),
                intArrayOf(79, 61, 66, 9, 45),
                intArrayOf(96, 24, 23, 43, 78)
            ),
            arrayOf(
                intArrayOf(62, 10, 16, 52, 93),
                intArrayOf(64, 81, 45, 21, 23),
                intArrayOf(90, 39, 98, 70, 28),
                intArrayOf(57, 42, 37, 47, 87),
                intArrayOf(99, 48, 94, 75, 9)
            ),
            arrayOf(
                intArrayOf(69, 91, 72, 58, 67),
                intArrayOf(13, 16, 52, 86, 68),
                intArrayOf(17, 40, 23, 15, 83),
                intArrayOf(80, 37, 85, 82, 60),
                intArrayOf(22, 76, 3, 89, 35)
            ),
            arrayOf(
                intArrayOf(79, 61, 4, 0, 89),
                intArrayOf(47, 6, 10, 12, 83),
                intArrayOf(13, 24, 31, 50, 90),
                intArrayOf(54, 99, 45, 42, 98),
                intArrayOf(21, 73, 39, 15, 16)
            ),
            arrayOf(
                intArrayOf(25, 67, 43, 16, 93),
                intArrayOf(15, 98, 5, 54, 57),
                intArrayOf(87, 60, 64, 36, 7),
                intArrayOf(65, 73, 41, 44, 4),
                intArrayOf(38, 52, 47, 19, 30)
            ),
            arrayOf(
                intArrayOf(22, 20, 1, 92, 94),
                intArrayOf(52, 73, 90, 14, 16),
                intArrayOf(54, 59, 29, 9, 44),
                intArrayOf(65, 83, 89, 75, 45),
                intArrayOf(72, 33, 77, 15, 69)
            ),
            arrayOf(
                intArrayOf(84, 46, 85, 11, 41),
                intArrayOf(13, 95, 28, 38, 6),
                intArrayOf(96, 74, 19, 32, 15),
                intArrayOf(37, 70, 29, 83, 14),
                intArrayOf(48, 62, 92, 8, 64)
            ),
            arrayOf(
                intArrayOf(26, 92, 89, 37, 23),
                intArrayOf(39, 97, 2, 40, 42),
                intArrayOf(46, 85, 52, 47, 45),
                intArrayOf(77, 36, 67, 10, 27),
                intArrayOf(8, 28, 24, 53, 86)
            ),
            arrayOf(
                intArrayOf(52, 21, 54, 91, 72),
                intArrayOf(96, 53, 17, 89, 51),
                intArrayOf(23, 58, 5, 18, 2),
                intArrayOf(13, 68, 32, 47, 75),
                intArrayOf(50, 97, 30, 84, 86)
            ),
            arrayOf(
                intArrayOf(91, 21, 13, 3, 74),
                intArrayOf(33, 1, 4, 95, 31),
                intArrayOf(29, 52, 62, 14, 10),
                intArrayOf(23, 11, 56, 51, 35),
                intArrayOf(47, 93, 8, 70, 58)
            ),
            arrayOf(
                intArrayOf(1, 83, 91, 43, 7),
                intArrayOf(58, 18, 66, 47, 39),
                intArrayOf(67, 62, 89, 41, 35),
                intArrayOf(32, 50, 96, 56, 49),
                intArrayOf(11, 21, 12, 80, 86)
            ),
            arrayOf(
                intArrayOf(23, 3, 63, 99, 42),
                intArrayOf(98, 97, 66, 86, 60),
                intArrayOf(73, 32, 96, 52, 75),
                intArrayOf(8, 31, 59, 84, 19),
                intArrayOf(93, 48, 35, 0, 92)
            ),
            arrayOf(
                intArrayOf(9, 55, 36, 31, 78),
                intArrayOf(24, 81, 3, 10, 80),
                intArrayOf(88, 42, 91, 14, 87),
                intArrayOf(6, 59, 44, 30, 12),
                intArrayOf(71, 68, 58, 1, 57)
            ),
            arrayOf(
                intArrayOf(85, 36, 3, 58, 11),
                intArrayOf(16, 44, 69, 60, 39),
                intArrayOf(51, 31, 65, 95, 87),
                intArrayOf(82, 63, 8, 14, 49),
                intArrayOf(67, 7, 64, 91, 59)
            ),
            arrayOf(
                intArrayOf(52, 65, 60, 39, 22),
                intArrayOf(1, 77, 81, 91, 46),
                intArrayOf(19, 18, 87, 31, 88),
                intArrayOf(23, 11, 32, 10, 79),
                intArrayOf(4, 50, 8, 59, 68)
            ),
            arrayOf(
                intArrayOf(54, 60, 99, 68, 42),
                intArrayOf(40, 20, 88, 5, 69),
                intArrayOf(14, 27, 73, 80, 30),
                intArrayOf(47, 62, 33, 86, 35),
                intArrayOf(72, 74, 12, 8, 15)
            ),
            arrayOf(
                intArrayOf(37, 32, 15, 90, 21),
                intArrayOf(14, 61, 52, 82, 76),
                intArrayOf(44, 27, 58, 51, 55),
                intArrayOf(49, 2, 10, 17, 79),
                intArrayOf(29, 48, 71, 86, 30)
            ),
            arrayOf(
                intArrayOf(36, 63, 48, 89, 92),
                intArrayOf(38, 71, 1, 46, 41),
                intArrayOf(3, 83, 79, 14, 34),
                intArrayOf(51, 11, 96, 69, 35),
                intArrayOf(61, 74, 99, 22, 95)
            ),
            arrayOf(
                intArrayOf(25, 3, 2, 88, 13),
                intArrayOf(7, 98, 22, 89, 40),
                intArrayOf(30, 47, 42, 43, 31),
                intArrayOf(55, 65, 75, 99, 24),
                intArrayOf(23, 64, 29, 90, 10)
            ),
            arrayOf(
                intArrayOf(57, 85, 31, 17, 98),
                intArrayOf(70, 3, 81, 51, 34),
                intArrayOf(43, 90, 23, 50, 37),
                intArrayOf(13, 75, 89, 25, 88),
                intArrayOf(12, 99, 46, 62, 36)
            ),
            arrayOf(
                intArrayOf(97, 48, 96, 15, 53),
                intArrayOf(45, 87, 35, 0, 77),
                intArrayOf(46, 72, 89, 55, 54),
                intArrayOf(98, 81, 69, 92, 42),
                intArrayOf(95, 47, 19, 33, 63)
            ),
            arrayOf(
                intArrayOf(65, 58, 47, 51, 17),
                intArrayOf(61, 60, 43, 10, 9),
                intArrayOf(4, 2, 53, 3, 25),
                intArrayOf(37, 93, 18, 59, 75),
                intArrayOf(42, 96, 11, 32, 35)
            ),
            arrayOf(
                intArrayOf(10, 96, 37, 83, 17),
                intArrayOf(2, 87, 64, 18, 99),
                intArrayOf(81, 73, 1, 0, 66),
                intArrayOf(78, 80, 42, 72, 56),
                intArrayOf(59, 97, 53, 9, 12)
            ),
            arrayOf(
                intArrayOf(59, 97, 49, 11, 58),
                intArrayOf(6, 99, 83, 27, 12),
                intArrayOf(21, 67, 79, 16, 57),
                intArrayOf(96, 9, 39, 69, 81),
                intArrayOf(18, 43, 42, 45, 95)
            ),
            arrayOf(
                intArrayOf(10, 37, 77, 48, 85),
                intArrayOf(15, 19, 71, 92, 44),
                intArrayOf(57, 94, 39, 28, 1),
                intArrayOf(52, 46, 79, 60, 38),
                intArrayOf(11, 55, 65, 74, 93)
            ),
            arrayOf(
                intArrayOf(10, 92, 67, 91, 2),
                intArrayOf(8, 28, 47, 80, 98),
                intArrayOf(48, 33, 1, 21, 37),
                intArrayOf(41, 15, 44, 73, 17),
                intArrayOf(31, 96, 5, 68, 65)
            ),
            arrayOf(
                intArrayOf(87, 55, 85, 48, 7),
                intArrayOf(10, 53, 42, 80, 84),
                intArrayOf(81, 91, 68, 54, 27),
                intArrayOf(32, 45, 67, 76, 34),
                intArrayOf(30, 62, 31, 72, 12)
            ),
            arrayOf(
                intArrayOf(15, 13, 94, 65, 7),
                intArrayOf(42, 83, 84, 55, 8),
                intArrayOf(56, 78, 38, 54, 87),
                intArrayOf(97, 37, 67, 10, 29),
                intArrayOf(3, 96, 2, 30, 14)
            ),
            arrayOf(
                intArrayOf(96, 20, 38, 1, 41),
                intArrayOf(51, 29, 98, 21, 36),
                intArrayOf(87, 32, 85, 13, 66),
                intArrayOf(15, 94, 61, 0, 83),
                intArrayOf(5, 43, 73, 10, 39)
            ),
            arrayOf(
                intArrayOf(74, 19, 4, 13, 53),
                intArrayOf(31, 92, 66, 40, 39),
                intArrayOf(42, 3, 21, 33, 95),
                intArrayOf(14, 34, 23, 45, 60),
                intArrayOf(16, 82, 89, 44, 7)
            ),
            arrayOf(
                intArrayOf(64, 7, 12, 85, 32),
                intArrayOf(78, 23, 26, 39, 34),
                intArrayOf(42, 97, 41, 54, 59),
                intArrayOf(83, 4, 86, 57, 98),
                intArrayOf(87, 72, 0, 55, 96)
            ),
            arrayOf(
                intArrayOf(32, 65, 88, 4, 57),
                intArrayOf(15, 79, 17, 58, 70),
                intArrayOf(8, 64, 89, 14, 82),
                intArrayOf(10, 40, 18, 94, 75),
                intArrayOf(84, 85, 92, 63, 56)
            ),
            arrayOf(
                intArrayOf(19, 95, 11, 31, 38),
                intArrayOf(15, 0, 82, 75, 13),
                intArrayOf(25, 67, 78, 59, 18),
                intArrayOf(99, 69, 57, 21, 81),
                intArrayOf(14, 63, 12, 85, 35)
            ),
            arrayOf(
                intArrayOf(41, 82, 78, 99, 90),
                intArrayOf(15, 10, 3, 87, 65),
                intArrayOf(54, 2, 6, 32, 22),
                intArrayOf(39, 89, 4, 14, 8),
                intArrayOf(85, 75, 76, 25, 74)
            ),
            arrayOf(
                intArrayOf(69, 43, 56, 78, 26),
                intArrayOf(41, 11, 40, 8, 73),
                intArrayOf(64, 28, 55, 52, 44),
                intArrayOf(13, 33, 18, 77, 88),
                intArrayOf(50, 16, 60, 79, 83)
            ),
            arrayOf(
                intArrayOf(34, 24, 48, 22, 11),
                intArrayOf(74, 60, 61, 42, 26),
                intArrayOf(37, 89, 84, 53, 7),
                intArrayOf(38, 41, 43, 31, 69),
                intArrayOf(17, 64, 88, 52, 14)
            ),
            arrayOf(
                intArrayOf(40, 69, 43, 12, 29),
                intArrayOf(39, 79, 82, 0, 48),
                intArrayOf(17, 87, 73, 31, 71),
                intArrayOf(74, 35, 34, 85, 3),
                intArrayOf(76, 47, 13, 80, 20)
            ),
            arrayOf(
                intArrayOf(6, 21, 8, 58, 86),
                intArrayOf(10, 84, 38, 5, 74),
                intArrayOf(19, 62, 88, 49, 1),
                intArrayOf(48, 44, 59, 56, 4),
                intArrayOf(60, 63, 61, 16, 73)
            ),
            arrayOf(
                intArrayOf(40, 99, 77, 5, 11),
                intArrayOf(63, 30, 68, 94, 39),
                intArrayOf(36, 66, 13, 47, 89),
                intArrayOf(70, 22, 18, 53, 96),
                intArrayOf(24, 56, 87, 4, 93)
            ),
            arrayOf(
                intArrayOf(9, 29, 90, 57, 60),
                intArrayOf(31, 97, 52, 16, 22),
                intArrayOf(36, 99, 50, 87, 13),
                intArrayOf(64, 84, 72, 0, 71),
                intArrayOf(43, 45, 68, 5, 7)
            ),
            arrayOf(
                intArrayOf(64, 38, 78, 3, 89),
                intArrayOf(97, 25, 48, 65, 57),
                intArrayOf(39, 93, 77, 54, 6),
                intArrayOf(49, 10, 19, 53, 47),
                intArrayOf(84, 69, 76, 11, 86)
            ),
            arrayOf(
                intArrayOf(88, 86, 29, 33, 72),
                intArrayOf(14, 93, 40, 36, 59),
                intArrayOf(19, 71, 47, 17, 91),
                intArrayOf(92, 16, 67, 27, 55),
                intArrayOf(51, 15, 2, 5, 84)
            ),
            arrayOf(
                intArrayOf(55, 2, 36, 73, 61),
                intArrayOf(49, 25, 96, 56, 27),
                intArrayOf(42, 4, 89, 39, 83),
                intArrayOf(13, 14, 9, 52, 51),
                intArrayOf(71, 20, 92, 3, 5)
            ),
            arrayOf(
                intArrayOf(81, 59, 60, 45, 25),
                intArrayOf(98, 94, 86, 89, 8),
                intArrayOf(57, 78, 51, 73, 53),
                intArrayOf(14, 15, 61, 71, 47),
                intArrayOf(79, 0, 92, 5, 55)
            ),
            arrayOf(
                intArrayOf(67, 45, 73, 55, 53),
                intArrayOf(27, 88, 35, 85, 60),
                intArrayOf(71, 24, 6, 23, 21),
                intArrayOf(82, 76, 3, 9, 22),
                intArrayOf(86, 78, 8, 44, 47)
            ),
            arrayOf(
                intArrayOf(31, 89, 58, 12, 71),
                intArrayOf(30, 92, 81, 61, 14),
                intArrayOf(4, 39, 60, 44, 94),
                intArrayOf(62, 85, 65, 98, 3),
                intArrayOf(88, 25, 40, 56, 47)
            ),
            arrayOf(
                intArrayOf(75, 85, 40, 89, 19),
                intArrayOf(45, 86, 81, 74, 92),
                intArrayOf(62, 33, 78, 37, 1),
                intArrayOf(80, 2, 39, 76, 68),
                intArrayOf(91, 5, 79, 0, 54)
            ),
            arrayOf(
                intArrayOf(56, 45, 33, 86, 47),
                intArrayOf(63, 73, 96, 15, 95),
                intArrayOf(69, 85, 22, 80, 20),
                intArrayOf(51, 43, 64, 0, 58),
                intArrayOf(3, 6, 29, 52, 74)
            ),
            arrayOf(
                intArrayOf(74, 33, 86, 65, 16),
                intArrayOf(91, 80, 17, 53, 88),
                intArrayOf(23, 61, 90, 62, 79),
                intArrayOf(2, 95, 82, 26, 49),
                intArrayOf(15, 47, 77, 9, 46)
            ),
            arrayOf(
                intArrayOf(27, 49, 21, 51, 53),
                intArrayOf(8, 26, 97, 74, 34),
                intArrayOf(38, 48, 81, 98, 46),
                intArrayOf(14, 80, 18, 11, 9),
                intArrayOf(36, 82, 66, 85, 86)
            ),
            arrayOf(
                intArrayOf(44, 7, 89, 5, 45),
                intArrayOf(29, 48, 93, 37, 41),
                intArrayOf(77, 67, 21, 68, 81),
                intArrayOf(96, 28, 38, 49, 58),
                intArrayOf(19, 80, 1, 0, 50)
            ),
            arrayOf(
                intArrayOf(95, 10, 63, 75, 76),
                intArrayOf(77, 43, 62, 46, 18),
                intArrayOf(91, 79, 57, 74, 85),
                intArrayOf(93, 81, 35, 61, 98),
                intArrayOf(86, 67, 32, 80, 84)
            ),
            arrayOf(
                intArrayOf(78, 41, 61, 20, 40),
                intArrayOf(26, 34, 69, 7, 13),
                intArrayOf(49, 60, 92, 22, 56),
                intArrayOf(35, 99, 24, 82, 29),
                intArrayOf(0, 85, 53, 1, 75)
            ),
            arrayOf(
                intArrayOf(19, 18, 55, 70, 84),
                intArrayOf(28, 68, 71, 20, 6),
                intArrayOf(27, 90, 86, 52, 2),
                intArrayOf(44, 43, 15, 48, 39),
                intArrayOf(14, 37, 63, 83, 75)
            ),
            arrayOf(
                intArrayOf(73, 61, 41, 96, 68),
                intArrayOf(89, 40, 53, 12, 91),
                intArrayOf(29, 37, 59, 10, 19),
                intArrayOf(69, 98, 88, 82, 24),
                intArrayOf(65, 72, 25, 42, 4)
            ),
            arrayOf(
                intArrayOf(62, 50, 34, 16, 8),
                intArrayOf(75, 88, 84, 33, 29),
                intArrayOf(2, 64, 31, 41, 86),
                intArrayOf(94, 45, 76, 70, 3),
                intArrayOf(39, 89, 66, 4, 24)
            )
        )

    val blocksMarked: Array<Array<IntArray>> = Array(blocks.size) { Array(5) { IntArray(5) } };
    blocks.forEach { block ->
        block.forEachIndexed { index, _ ->
            blocksMarked[index] = arrayOf(
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 0, 0, 0),
            )
        }
    }
    val map = hashMapOf<Int, Boolean>()

    numbers.forEach { number ->
        blocks.forEachIndexed { blockIndex, block ->
            block.forEachIndexed { lineIndex, line ->
                line.forEachIndexed { numIndex, num ->
                    if (number == num) {
                        blocksMarked[blockIndex][lineIndex][numIndex] = 1;
                    }
                }
            }
        }
        // Check
        blocksMarked.forEachIndexed { blockIndex, block ->
            // horizontal
            block.forEach { line ->
                if (line.filter { it == 1 }.size == 5) {
                    calcSum(blocks[blockIndex], blocksMarked[blockIndex], blockIndex, number, map)
                }
            }
            // vertical
            val newBlock = Array<IntArray>(5) { IntArray(5) };
            for (i in 0..4) {
                for (j in 0..4) {
                    newBlock[j][i] = block[i][j]
                }
            }

            newBlock.forEach { line ->
                if (line.filter { it == 1 }.size == 5) {
                    calcSum(blocks[blockIndex], blocksMarked[blockIndex], blockIndex, number, map)
                }
            }
        }
    }
}

private fun calcSum(
    block: Array<IntArray>,
    blockMarked: Array<IntArray>,
    i1: Int,
    number: Int,
    map: HashMap<Int, Boolean>,
): Int {
    var sum = 0;
    block.forEachIndexed { lineIndex, line ->
        line.forEachIndexed { numIndex, _ ->
            if (blockMarked[lineIndex][numIndex] == 0) {
                sum += block[lineIndex][numIndex]
            }
        }
    }
    val sum2 = sum * number;
    if (map[i1] == null) {
        map[i1] = true;
        println("Block2: $i1")
        if (map.size == 100) {
            println(block)
        }
        return sum2;
    }
    return -1
}
