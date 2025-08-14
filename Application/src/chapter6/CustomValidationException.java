package chapter6;

public class CustomValidationException extends RuntimeException {

    String message = "validation error";

    int code = 404;
    //custome runtione exception yaradilir cox vaxt


    public CustomValidationException(String message) {
        super(message);
        this.message = message;
    }
}
