package cl.duoc.ms_blogs_bs.controller;

import cl.duoc.ms_blogs_bs.model.dto.BlogPostDto;
import cl.duoc.ms_blogs_bs.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<BlogPostDto> getAll() {
        return blogService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogPostDto> getById(@PathVariable Long id) {
        BlogPostDto dto = blogService.getById(id);
        if (dto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public BlogPostDto create(@RequestBody BlogPostDto dto) {
        return blogService.create(dto);
    }

    @PutMapping("/{id}")
    public BlogPostDto update(@PathVariable Long id, @RequestBody BlogPostDto dto) {
        return blogService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        blogService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
