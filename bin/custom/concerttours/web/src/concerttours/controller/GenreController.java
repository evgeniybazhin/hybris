package concerttours.controller;

import concerttours.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GenreController {
    @Autowired
    private AlbumService albumService;

    @GetMapping(value = "genre/{genreCode}")
    public String showGenres(@PathVariable String genreCode, Model model){
        model.addAttribute("albums", albumService.getAlbums(genreCode));
        return "AlbumsByGenre";
    }
}
