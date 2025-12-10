package cl.duoc.ms_blogs_bs.service;

import cl.duoc.ms_blogs_bs.client.BlogsDbClient;
import cl.duoc.ms_blogs_bs.model.dto.BlogPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogsDbClient blogsDbClient;

    public List<BlogPostDto> getAll() {
        return blogsDbClient.getAll();
    }

    public BlogPostDto getById(Long id) {
        return blogsDbClient.getById(id);
    }

    public BlogPostDto create(BlogPostDto dto) {
        return blogsDbClient.create(dto);
    }

    public BlogPostDto update(Long id, BlogPostDto dto) {
        return blogsDbClient.update(id, dto);
    }

    public void delete(Long id) {
        blogsDbClient.delete(id);
    }
}
