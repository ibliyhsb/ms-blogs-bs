package cl.duoc.ms_blogs_bs.client;

import cl.duoc.ms_blogs_bs.model.dto.BlogPostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "blogsDbClient", url = "${blogs.db.url}")
public interface BlogsDbClient {
    @GetMapping("/blogs")
    List<BlogPostDto> getAll();

    @GetMapping("/blogs/{id}")
    BlogPostDto getById(@PathVariable("id") Long id);

    @PostMapping("/blogs")
    BlogPostDto create(@RequestBody BlogPostDto dto);

    @PutMapping("/blogs/{id}")
    BlogPostDto update(@PathVariable("id") Long id, @RequestBody BlogPostDto dto);

    @DeleteMapping("/blogs/{id}")
    void delete(@PathVariable("id") Long id);
}
