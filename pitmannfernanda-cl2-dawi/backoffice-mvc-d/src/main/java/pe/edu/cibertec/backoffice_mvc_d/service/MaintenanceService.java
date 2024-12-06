package pe.edu.cibertec.backoffice_mvc_d.service;

import pe.edu.cibertec.backoffice_mvc_d.dto.FilmDetailDto;
import pe.edu.cibertec.backoffice_mvc_d.dto.FilmDto;
import pe.edu.cibertec.backoffice_mvc_d.entity.Film;

import java.util.List;

public interface MaintenanceService {
    //Metodo que devuelva una lista
    List<FilmDto> getAllFilms();

    //Definimos un contrato nos va a devolver un objeto de entidad
    FilmDetailDto getFilmById(int id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    public void eliminarFilm(Integer id);

    Film agregarFilm(Film film);
}
