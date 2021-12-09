package javaBasic.example.restApi.validate;


public class ErrorModelResponse {
    private int error;
    private String message;

    public ErrorModelResponse() {
    }

    public ErrorModelResponse(int error, String message){
        this.error = error;
        this.message = message;
    }
}
