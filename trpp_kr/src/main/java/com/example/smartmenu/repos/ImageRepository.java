package com.example.smartmenu.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.smartmenu.models.Image;


@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{
    public List<Image> findByName(String name);
}
