package ru.netology.manager;

import ru.netology.domain.List;

public class ManagerFilm {
    private List[] poster = new List[0];
    private int limit;

    public ManagerFilm() {
        limit = 10;
    }

    public ManagerFilm(int limit) {
        this.limit = limit;
    }

    public void add(List item) {
        int length = poster.length + 1;
        List[] tmp = new List[length];
        System.arraycopy(poster, 0, tmp, 0, poster.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        poster = tmp;
    }

    public List[] findLast() {
        List[] poster = findAll();
        List[] result;
        if (limit < poster.length) {
            result = new List[limit];
        } else {
            result = new List[poster.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = poster.length - i - 1;
            result[i] = poster[index];
        }
        return result;
    }

    public List[] findAll() {
        return poster;
    }
}


//    private PurchaseFilm[] films = new PurchaseFilm[0];
//
//    public void save(PurchaseFilm) {
//        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
//        for (int i = 0; i < films.length; i++) {
//            tmp[i] = films[i];
//        }
//        tmp[tmp.length - 1] = film;
//        films = tmp;
//    }
//
//    public void remID(int id) {
//        PurchaseFilm[] tmp = new PurchaseFilm[films.length - 1];
//        int copyToIndex = 0;
//        for (PurchaseFilm film : films) {
//            if (film.getId() != id) {
//                tmp[copyToIndex] = film;
//                copyToIndex++;
//            }
//        }
//        films = tmp;
//    }
//
//public  PurchaseFilm[] getFilms() {
//        return films;
//    }
//}
//