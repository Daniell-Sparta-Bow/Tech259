package com.example.libraryapp.model.exceptions;

// Represents the JSON Body of our ResponseEntity
public class AuthorNotFoundResponse {
    private String url;
    private String message;
    private int statusCode;

    public AuthorNotFoundResponse(String url, String message, int statusCode) {
        this.url = url;
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
