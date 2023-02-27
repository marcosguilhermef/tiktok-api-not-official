package com.origin.tiktok.util;

/**
 * This class is responsible for generating a new entity class whenever the tiktok API is updated.
 * This class is under development.
 */
public class entytieGenerator {
    private String path;
    private String body;

    private String comment;
    public entytieGenerator(String path,String body){
        this.path = path;
        this.body = body;
    }

    public entytieGenerator(String path,String body, String comment){
        this.path = path;
        this.body = body;
        this.comment = comment;
    }
}
