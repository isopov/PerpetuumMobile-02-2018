package server.messages;

//public class MessageStates {
//    public static final String ALREADY_AUTHORIZED = "user is already authorized";
//    public static final String NOT_ENOUGH_DATA = "not enough data";
//    public static final String AUTHORIZED = "successful authorize";
//    public static final String BAD_AUTHORIZE = "invalid login or password";
//    public static final String EMAIL_ALREADY_EXISTS = "this email already registered";
//    public static final String LOGIN_ALREADY_EXISTS = "this login already registered";
//    public static final String REGISTERED = "you are registered!!!";
//    //public static final String PASSWORDS_DO_NOT_MATCH = "passwords don't match";
//    public static final String UNAUTHORIZED = "not authorized";
//    public static final String CHANGED_USER_DATA = "user data has been changed";
//    public static final String BAD_DATA = "bad data given";
//    public static final String SUCCESS_UPLOAD = "you successfully uploaded file";
//}


public enum MessageStates {
    ALREADY_AUTHORIZED("user is already authorized"),
    NOT_ENOUGH_DATA("not enough data"),
    AUTHORIZED("successful authorize"),
    BAD_AUTHORIZE("invalid login or password"),
    EMAIL_ALREADY_EXISTS("this email already registered"),
    LOGIN_ALREADY_EXISTS("this login already registered"),
    BAD_PASSWORD("bad password"),
    REGISTERED("you are registered!!!"),
    PASSWORDS_DO_NOT_MATCH("passwords don't match"),
    UNAUTHORIZED("not authorized"),
    CHANGED_USER_DATA("user data has been changed"),
    BAD_DATA("bad data given"),
    SUCCESS_UPLOAD("you successfully uploaded file");

    private String message;

    MessageStates(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}