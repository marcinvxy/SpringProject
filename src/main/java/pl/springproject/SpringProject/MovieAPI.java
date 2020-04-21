package pl.springproject.SpringProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping
public class MovieAPI {

    @Autowired
    MovieManager movieManager;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<MovieEntity> getAll(){
        return movieManager.findAll();
    }

    @GetMapping("/getbyid")
    public Optional<MovieEntity> getById(@RequestParam Long index){
        return movieManager.findById(index);
    }

    @PostMapping("/add")
    public  MovieEntity addVideo(@RequestBody MovieEntity movieEntity){
        return movieManager.save(movieEntity);
    }

    @PutMapping("/update")
    public MovieEntity updateVideo(@RequestBody MovieEntity movieEntity){
        return movieManager.save(movieEntity);
    }

    @DeleteMapping("/delete")
    public void deleteVideo(@RequestParam Long index){
        movieManager.deleteById(index);
    }

    @PostMapping("/upload")
    public ResponseEntity.BodyBuilder uplaodImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        File addFile = new File("src/main/resources/static/"+file.getOriginalFilename());
        addFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(addFile);
        fout.write(file.getBytes());
        fout.close();
        return ResponseEntity.status(HttpStatus.OK);
    }
}