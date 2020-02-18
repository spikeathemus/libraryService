package com.libraryservice.demo.repository;

import com.libraryservice.demo.entity.LibraryStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryStation,Long> {
}
