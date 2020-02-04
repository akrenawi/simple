package com.projectgps.demo.controllers;

import com.amazonaws.services.dynamodbv2.xspec.L;

import com.projectgps.demo.gpsdata.*;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * @author Ayman
 */
@CrossOrigin
@RestController
@RequestMapping("sendRequestForCheck")
public class A {

    private  RepositoryAdd repositoryAdd;
    public A() throws IOException, JSONException {

    }

    /**
     * @author  Ayman
     */
    @PostMapping("/add")
    public void getUsers(@RequestBody RepositoryAdd repositoryAdd) {
        this.repositoryAdd = new RepositoryAdd(repositoryAdd.getNum1(), repositoryAdd.getNum2());
        System.out.println(this.repositoryAdd);
    }

}