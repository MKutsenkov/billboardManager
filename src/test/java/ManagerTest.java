import org.junit.jupiter.api.Test;
import ru.netology.domain.List;
import ru.netology.manager.ManagerFilm;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    List film1 = new List(11, 1, "Бладшот", 200, 2);
    List film2 = new List(12, 2, "Вперед", 100, 2);
    List film3 = new List(13, 3, "Белград", 200, 2);
    List film4 = new List(14, 4, "Джентельмены", 300, 2);
    List film5 = new List(15, 5, "Человек невидимка", 100, 5);
    List film6 = new List(16, 6, "Тролли", 200, 1);
    List film7 = new List(17, 7, "Номер один", 100, 3);
    List film8 = new List(18, 8, "Фильм8", 300, 6);
    List film9 = new List(19, 9, "Фильм9", 300, 4);
    List film10 = new List(20, 10, "Фильм10", 100, 2);
    List film11 = new List(21, 11, "Фильм11", 200, 4);

    @Test
    public void testFindLast() {
        ManagerFilm manager = new ManagerFilm();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        List[] actual = manager.findLast();
        List[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindLastLessLimit() {
        ManagerFilm manager = new ManagerFilm();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);

        List[] actual = manager.findLast();
        List[] expected = {film9, film8, film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void testFindLastMoreLimit() {
        ManagerFilm manager = new ManagerFilm();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);
        List[] actual = manager.findLast();
        List[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};

        assertArrayEquals(actual, expected);
    }

//   @Test
//   public void testFindLastMoreLimitBag() {
//       ManagerFilm manager = new ManagerFilm();
//       manager.add(film1);
//       manager.add(film2);
//       manager.add(film3);
//       manager.add(film4);
//       manager.add(film5);
//       manager.add(film6);
//       manager.add(film7);
//       manager.add(film8);
//       manager.add(film9);
//       manager.add(film10);
//       manager.add(film11);
//       List[] actual = manager.findLast();
//       List[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

//       assertArrayEquals(actual, expected);
//   }
}
