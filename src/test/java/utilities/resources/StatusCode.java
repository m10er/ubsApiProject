package utilities.resources;

public enum StatusCode {
    CODE_200(200, ""),
    CODE_201(201, ""),
    CODE_203(203, "To access this data, you must log in as a admin."),
    CODE_400(400, "Missing required field: name"),
    CODE_401(401, "Unauthenticated.");

    public final int code;
    public final String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

   public int getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
