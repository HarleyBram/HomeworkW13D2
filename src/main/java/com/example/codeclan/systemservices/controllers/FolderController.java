package com.example.codeclan.systemservices.controllers;

import com.example.codeclan.systemservices.models.File;
import com.example.codeclan.systemservices.models.Folder;
import com.example.codeclan.systemservices.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/folders")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping
    public ResponseEntity<List<File>> getAllFolders(){
        return new ResponseEntity(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Optional<File>> getFolder(@PathVariable Long id){
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity PostFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity(folder, HttpStatus.CREATED);
    }
}
